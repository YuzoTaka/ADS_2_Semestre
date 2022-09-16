
public class TreinadorPokemon {

    String nome;
    int nivel = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    void treinarPokemon(Pokemon poke) {
        Double forcaAtual = poke.getForca();
        int doceAtual = poke.getDoce();

        poke.setForca(forcaAtual * 1.1);
        poke.setDoce(doceAtual + 10);
        nivel += 2;
    }

    void evoluirPokemon(Pokemon poke, String nomeEvolucao) {
        int doceAtual = poke.getDoce();
        if (doceAtual >= 50) {
            poke.setDoce(doceAtual - 50);
            poke.setNome(nomeEvolucao);
            nivel += 10;
            System.out.println(String.format("Pokemon %s evoluiu para -> %s",
                    poke.getNome(), nomeEvolucao));
        }else{
            System.out.println("Não foi possível realizar operação");
        }
    }
}
