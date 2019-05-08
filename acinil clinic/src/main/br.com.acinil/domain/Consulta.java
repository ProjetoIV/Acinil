package br.com.acinil.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Consulta extends GenericDoMain {
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date ds_date;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Date nr_horario;

    @ManyToOne
	@JoinColumn(nullable = false)
    private Paciente paciente;

    @ManyToOne
	@JoinColumn(nullable = false)
    private Medico medico;

    @Column(length = 20 , nullable = false)
    private Tipo cd_tipo;

    /**
     * @return the ds_date
     */
    public Date getDs_date() {
        return ds_date;
    }

    /**
     * @param ds_date the ds_date to set
     */
    public void setDs_date(Date ds_date) {
        this.ds_date = ds_date;
    }

    /**
     * @return the nr_horario
     */
    public Date getNr_horario() {
        return nr_horario;
    }

    /**
     * @param nr_horario the nr_horario to set
     */
    public void setNr_horario(Date nr_horario) {
        this.nr_horario = nr_horario;
    }

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
     * @return the cd_tipo
     */
    public String getCd_tipo() {
        return cd_tipo;
    }

    /**
     * @param cd_tipo the cd_tipo to set
     */
    public void setCd_tipo(Tipo cd_tipo) {
        this.cd_tipo = cd_tipo;
    }

}
