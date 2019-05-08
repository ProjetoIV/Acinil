package br.com.acinil.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Receita extends GenericDoMain {
    @ManyToOne
	@JoinColumn(nullable = false)
    private Paciente paciente;

    @ManyToOne
	@JoinColumn(nullable = false)
    private Medico medico;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dt_receita;

    @Column(length = 50 , nullable = false)
    private String nm_medicamento;

    @Column(length = 30 , nullable = false)
    private String ds_posologia;

    @Column(length = 100)
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
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * @return the dt_receita
     */
    public Date getDt_receita() {
        return dt_receita;
    }

    /**
     * @param dt_receita the dt_receita to set
     */
    public void setDt_receita(Date dt_receita) {
        this.dt_receita = dt_receita;
    }

    /**
     * @return the nm_medicamento
     */
    public String getNm_medicamento() {
        return nm_medicamento;
    }

    /**
     * @param nm_medicamento the nm_medicamento to set
     */
    public void setNm_medicamento(String nm_medicamento) {
        this.nm_medicamento = nm_medicamento;
    }

    /**
     * @return the ds_posologia
     */
    public String getDs_posologia() {
        return ds_posologia;
    }

    /**
     * @param ds_posologia the ds_posologia to set
     */
    public void setDs_posologia(String ds_posologia) {
        this.ds_posologia = ds_posologia;
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