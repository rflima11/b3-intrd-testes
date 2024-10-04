package ada.tech.rflima.introducaotestes.service;

import ada.tech.rflima.introducaotestes.entities.Funcionario;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

class CalcularFeriasServiceTest {


    CalcularFeriasService service;
    Funcionario funcionario;


    @BeforeEach
    public void setUp() {
        service = new CalcularFeriasService();
        funcionario = new Funcionario();
    }

    @Test
    void deveConseguirTirarFeriasDadoQueEntrouUmAnoAtras() {
        //Cenário
        funcionario.setDataAdmissao(LocalDate.of(2023, 10, 2));
        funcionario.setPossuiFeriasVencidas(false);

        //Execução
        boolean isHabilitadoParaTirarFerias = service.executar(funcionario);

        //Verificação
        Assertions.assertTrue(isHabilitadoParaTirarFerias);
    }

    @Test
    void deveConseguirTirarFeriasDadoQuePossuiFeriasVencidas() {
        //Cenário
        funcionario.setPossuiFeriasVencidas(true);

        //Execução
        boolean isHabilitadoParaTirarFerias = service.executar(funcionario);


        //Verificação
        Assertions.assertTrue(isHabilitadoParaTirarFerias);
    }

    @Test
    void naoDeveConseguirTirarFeriasDadoQueEntrouHoje() {
        //Cenário
        funcionario.setDataAdmissao(LocalDate.now());
        funcionario.setPossuiFeriasVencidas(false);

        //Execução
        boolean isHabilitadoParaTirarFerias = service.executar(funcionario);

        //Verificação
        Assertions.assertFalse(isHabilitadoParaTirarFerias);
    }

}