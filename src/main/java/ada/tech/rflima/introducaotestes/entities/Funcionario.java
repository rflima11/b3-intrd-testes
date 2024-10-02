package ada.tech.rflima.introducaotestes.entities;

import java.time.LocalDate;

public class Funcionario {

    private String nome;

    private LocalDate dataAdmissao;

    private boolean possuiFeriasVencidas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public boolean isPossuiFeriasVencidas() {
        return possuiFeriasVencidas;
    }

    public void setPossuiFeriasVencidas(boolean possuiFeriasVencidas) {
        this.possuiFeriasVencidas = possuiFeriasVencidas;
    }
}
