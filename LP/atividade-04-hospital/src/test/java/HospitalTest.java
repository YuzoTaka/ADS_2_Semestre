
import com.sptech.atividade.com.testes.Hospital;
import com.sptech.atividade.com.testes.Medico;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author miniguiti
 */
class HospitalTest {

    private Medico medico;
    private Hospital hospital;

    @BeforeEach
    public void init() {
        this.medico = new Medico(1, "José", "A");
        this.hospital = new Hospital("Hosp. Saúde");
    }
    
    @Test
    @DisplayName("Construtor Hospital- Inicializa quantidadeDePagamentos e quantidadeDeHoraExtra com 0")
    void construtorHospital() {
        assertDoesNotThrow(() -> this.hospital.getQuantidadeDeHoraExtra());
        assertDoesNotThrow(() -> this.hospital.getQuantidadeDePagamentos());
        assertEquals(0, hospital.getQuantidadeDeHoraExtra());
        assertEquals(0, hospital.getQuantidadeDePagamentos());
    }

    @Test
    @DisplayName("Construtor Medico- Inicializa salario com 0.0 e ativo com true")
    void construtorMedico() {
        assertDoesNotThrow(() -> this.medico.getSalario());
        assertDoesNotThrow(() -> this.medico.getAtivo());
        assertEquals(0.0, medico.getSalario());
        assertTrue(medico.getAtivo());
    }

    
        @Test
    @DisplayName("realizarPagamento - sem hora extra: realizar pagamento com valor e médico valido")
    void realizarPagamentoValorValido() {
        this.hospital.realizarPagamento(medico, 10.0);
        assertEquals(10, medico.getSalario());
        assertEquals(1, hospital.getQuantidadeDePagamentos());
        assertEquals(0, hospital.getQuantidadeDeHoraExtra());
    }

    @Test
    @DisplayName("realizarPagamento - sem hora extra: realizar pagamento com valor menor que 0")
    void realizarPagamentoValorInvalido() {
        this.hospital.realizarPagamento(medico, -10.0);
        assertEquals(0, medico.getSalario());
        assertEquals(0, hospital.getQuantidadeDePagamentos());
        assertEquals(0, hospital.getQuantidadeDeHoraExtra());
    }

    @Test
    @DisplayName("realizarPagamento - sem hora extra: realizar pagamento com medico nulo")
    void realizarPagamentoMedicoNulo() {
        this.hospital.realizarPagamento(null, 0.0);
        assertEquals(0, medico.getSalario());
        assertEquals(0, hospital.getQuantidadeDePagamentos());
        assertEquals(0, hospital.getQuantidadeDeHoraExtra());
    }

    @Test
    @DisplayName("realizarPagamento - sem hora extra: realizar pagamento com medico nulo sem exceção")
    void realizarPagamentoMedicoNuloSemExcecao() {
        assertDoesNotThrow(() -> this.hospital.realizarPagamento(null, 0.0));
    }
    
    @Test
    @DisplayName("realizarPagamento - sem hora extra: realizar pagamento com valor nulo")
    void realizarPagamentoValorNulo() {
        this.hospital.realizarPagamento(medico, null);
        assertEquals(0, medico.getSalario());
        assertEquals(0, hospital.getQuantidadeDePagamentos());
        assertEquals(0, hospital.getQuantidadeDeHoraExtra());
    }

    @Test
    @DisplayName("realizarPagamento - sem hora extra: realizar pagamento com valor nulo sem exceção")
    void realizarPagamentoValorNuloSemExcecao() {
        assertDoesNotThrow(() -> this.hospital.realizarPagamento(medico, null));
    }
    
    @Test
    @DisplayName("realizarPagamento - com hora extra: realizar pagamento com medico inativo")
    void realizarPagamentoMedicoInativo() {
        medico.setAtivo(false);
        this.hospital.realizarPagamento(medico, 0.0);
        assertEquals(0, medico.getSalario());
        assertEquals(0, hospital.getQuantidadeDePagamentos());
        assertEquals(0, hospital.getQuantidadeDeHoraExtra());
    }

    @Test
    @DisplayName("realizarPagamento - com hora extra: realizar pagamento com valor, médico valido e hora extra validos")
    void realizarPagamentoHoraExtraValorValido() {
        this.hospital.realizarPagamento(medico, 10.0, 10.0);
        assertEquals(20.0, medico.getSalario());
        assertEquals(1, hospital.getQuantidadeDePagamentos());
        assertEquals(1, hospital.getQuantidadeDeHoraExtra());
    }

    @Test
    @DisplayName("realizarPagamento - com hora extra: realizar pagamento com valor menor que 0")
    void realizarPagamentoHoraExtraValorInvalido() {
        this.hospital.realizarPagamento(medico, -10.0, 10.0);
        assertEquals(0, medico.getSalario());
        assertEquals(0, hospital.getQuantidadeDePagamentos());
        assertEquals(0, hospital.getQuantidadeDeHoraExtra());
    }

    @Test
    @DisplayName("realizarPagamento - com hora extra: realizar pagamento com medico nulo")
    void realizarPagamentoHoraExtraMedicoNulo() {
        this.hospital.realizarPagamento(null, 0.0,10.0);
        assertEquals(0, medico.getSalario());
        assertEquals(0, hospital.getQuantidadeDePagamentos());
        assertEquals(0, hospital.getQuantidadeDeHoraExtra());
    }
    
    @Test
    @DisplayName("realizarPagamento - com hora extra: realizar pagamento com medico nulo sem exceção")
    void realizarPagamentoHoraExtraMedicoNuloSemExcecao() {
        assertDoesNotThrow(() -> this.hospital.realizarPagamento(null, 10.0,10.0));
    }

    @Test
    @DisplayName("realizarPagamento - com hora extra: realizar pagamento com medico inativo")
    void realizarPagamentoHoraExtraMedicoInativo() {
        medico.setAtivo(false);
        this.hospital.realizarPagamento(medico, 0.0,10.0);
        assertEquals(0, medico.getSalario());
        assertEquals(0, hospital.getQuantidadeDePagamentos());
        assertEquals(0, hospital.getQuantidadeDeHoraExtra());
    }
    
    @Test
    @DisplayName("realizarPagamento - com hora extra: realizar pagamento hora extra menor que 0")
    void realizarPagamentoHoraExtraNegativa() {
        this.hospital.realizarPagamento(medico, 10.0, -10.0);
        assertEquals(0, medico.getSalario());
        assertEquals(0, hospital.getQuantidadeDePagamentos());
        assertEquals(0, hospital.getQuantidadeDeHoraExtra());
    }
    
    @Test
    @DisplayName("realizarPagamento - com hora extra: realizar pagamento hora extra nula")
    void realizarPagamentoHoraExtraNull() {
        this.hospital.realizarPagamento(medico, 10.0, null);
        assertEquals(0, medico.getSalario());
        assertEquals(0, hospital.getQuantidadeDePagamentos());
        assertEquals(0, hospital.getQuantidadeDeHoraExtra());
    }
 
    @Test
    @DisplayName("desligarMedico - desligar médico com argumento válido")
    void desligarMedicoValido() {
        this.hospital.desligarMedico(medico);
        Assertions.assertFalse(medico.getAtivo());
    }
    
    @Test
    @DisplayName("desligarMedico - desligar médico com argumento inválido")
    void desligarMedicoInvalido() {
        this.hospital.desligarMedico(null);
        Assertions.assertTrue(medico.getAtivo());
    }
    
    @Test
    @DisplayName("classe Hospital: Deve ter todos os seus atributos privados")
    void classeHospitalAtributosPrivados() {
        List<Field> fields = Arrays.asList(Hospital.class.getDeclaredFields());

        fields.forEach(field -> {
            assertTrue(field.getModifiers() == Modifier.PRIVATE);
        });
    }

    @Test
    @DisplayName("classe Hospital: Deve ter todos os seus metodos públicos")
    void classeHospitalaMetodosPublicos() {
        List<Method> methods = Arrays.asList(Hospital.class.getDeclaredMethods());

        methods.forEach(method -> {
            assertTrue(method.getModifiers() == Modifier.PUBLIC);
        });
    }

    @Test
    @DisplayName("classe Hospital: todos os atributos devem possuir Getter e não possuir Setter")
    @SuppressWarnings("ThrowableResultIgnored")
    void classeHospitalGettersESetters() {
        List<Field> fields = Arrays.asList(Hospital.class.getDeclaredFields());

        for (Field field : fields) {
            String getter = "get" + StringUtils.capitalize(field.getName());
            String setter = "set" + StringUtils.capitalize(field.getName());

            assertDoesNotThrow(() -> Hospital.class.getDeclaredMethod(getter));
            assertThrows(NoSuchMethodException.class, () -> Hospital.class.getDeclaredMethod(setter, field.getType()));
        }
    }
    
    @Test
    @DisplayName("classe Hospital: Deve ter todos os seus atributos privados")
    void classeMedicoAtributosPrivados() {
        List<Field> fields = Arrays.asList(Medico.class.getDeclaredFields());

        fields.forEach(field -> {
            assertTrue(field.getModifiers() == Modifier.PRIVATE);
        });
    }

    @Test
    @DisplayName("classe Hospital: Deve ter todos os seus metodos públicos")
    void classeMedicoMetodosPublicos() {
        List<Method> methods = Arrays.asList(Medico.class.getDeclaredMethods());

        methods.forEach(method -> {
            assertTrue(method.getModifiers() == Modifier.PUBLIC);
        });
    }

    @Test
    @DisplayName("classe Hospital: todos os atributos devem possuir Getter e Setter")
    @SuppressWarnings("ThrowableResultIgnored")
    void classeMedicoGettersESetters() {
        List<Field> fields = Arrays.asList(Medico.class.getDeclaredFields());

        for (Field field : fields) {
            String getter = "get" + StringUtils.capitalize(field.getName());
            String setter = "set" + StringUtils.capitalize(field.getName());

            assertDoesNotThrow(() -> Medico.class.getDeclaredMethod(getter));
            assertDoesNotThrow(() -> Medico.class.getDeclaredMethod(setter, field.getType()));
        }
    }
}
