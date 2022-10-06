


public class TestePokemon {
    public static void main(String[] args) {
        Pokemon poke1 = new Pokemon();
        Pokemon poke2 = new Pokemon();
        TreinadorPokemon treinador = new TreinadorPokemon();
        
        treinador.setNome("Yuzo");
        
        poke1.setNome("Pikachu");
        poke1.setTipo("Elétrico");
        poke1.setForca(30.0);
        
        poke2.setNome("Charmander");
        poke2.setTipo("Fogo");
        poke2.setForca(30.0);
        
        for (int i = 1; i <= 5; i++) {
            treinador.treinarPokemon(poke2);
        }
        System.out.println("-------------------");
        System.out.println(String.format("Nome: %s\nTipo: %s\nForça: %.1f\nDoce: %d",
                poke2.getNome(), poke2.getTipo(), poke2.getForca(), poke2.getDoce()));
        System.out.println("-------------------");
        treinador.evoluirPokemon(poke2, "Charmeleon");
        
        for (int i = 1; i <= 2; i++) {
            treinador.treinarPokemon(poke1);
        }
        
        System.out.println("-------------------");
        System.out.println(String.format("Nome: %s\nTipo: %s\nForça: %.1f\nDoce: %d",
                poke1.getNome(), poke1.getTipo(), poke1.getForca(), poke1.getDoce()));
        System.out.println("-------------------");
        treinador.evoluirPokemon(poke1, "Raichu");
        System.out.println("-------------------");
        
        System.out.println(String.format("Status Treinador:\nNome: %s\nNível: %d",
                treinador.getNome(), treinador.getNivel()));
        System.out.println("-------------------");

    }
}
