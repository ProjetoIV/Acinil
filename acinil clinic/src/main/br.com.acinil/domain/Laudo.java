package br.com.acinil.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Laudo extends GenericDoMain {
    @ManyToOne
	@JoinColumn(nullable = false)
    private Paciente paciente;

    @ManyToOne
	@JoinColumn(nullable = false)
    private Medico medico;

    @Column(length = 100)
    private String ds_descricao;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dt_data;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Date dt_horario;

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
     * @return the ds_descricao
     */
    public String getDs_descricao() {
        return ds_descricao;
    }

    /**
     * @param ds_descricao the ds_descricao to set
     */
    public void setDs_descricao(String ds_descricao) {
        this.ds_descricao = ds_descricao;
    }

    /**
     * @return the dt_data
     */
    public Date getDt_data() {
        return dt_data;
    }

    /**
     * @param dt_data the dt_data to set
     */
    public void setDt_data(Date dt_data) {
        this.dt_data = dt_data;
    }

    /**
     * @return the dt_horario
     */
    public Date getDt_horario() {
        return dt_horario;
    }

    /**
     * @param dt_horario the dt_horario to set
     */
    public void setDt_horario(Date dt_horario) {
        this.dt_horario = dt_horario;
    }

}