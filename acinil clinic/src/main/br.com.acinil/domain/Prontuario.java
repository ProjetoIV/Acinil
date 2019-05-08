package br.com.acinil.domain;

import javax.persistence.Column;

public class Prontuario extends GenericDoMain {
    @ManyToOne
	@JoinColumn(nullable = false)
    private Paciente paciente;

    @ManyToOne
	@JoinColumn(nullable = false)
    private Exame exame;

    @ManyToOne
	@JoinColumn(nullable = false)
    private Receita receita;

    @Column(length = 100 , nullable = false)
    private String ds_observacao;

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the exame
     */
    public Exame getExame() {
        return exame;
    }

    /**
     * @param exame the exame to set
     */
    public void setExame(Exame exame) {
        this.exame = exame;
    }

    /**
     * @return the receita
     */
    public Receita getReceita() {
        return receita;
    }

    /**
     * @param receita the receita to set
     */
    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    /**
     * @return the ds_observacao
     */
    public String getDs_observacao() {
        return ds_observacao;
    }

    /**
     * @param ds_observacao the ds_observacao to set
     */
    public void setDs_observacao(String ds_observacao) {
        this.ds_observacao = ds_observacao;
    }

}