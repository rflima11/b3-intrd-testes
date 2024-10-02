package ada.tech.rflima.introducaotestes.service;

import ada.tech.rflima.introducaotestes.entities.Funcionario;

import java.time.LocalDate;

public class CalcularFeriasService {

    public boolean executar(Funcionario funcionario) {
        LocalDate dataAdmissao = funcionario.getDataAdmissao();

        LocalDate dataAtual = LocalDate.now();

        return funcionario.isPossuiFeriasVencidas() || dataAdmissao.plusYears(1).isEqual(dataAtual);
    }
}
