package br.com.acinil.domain;

import javax.persistence.Column;

public class Medico extends GenericDoMain {
    @Column(length = 50 , nullable = false)
    private String nm_medico;

    @Column(length = 14 , nullable = false)
    private String nr_cpfMedico;

    @Column(length = 12 , nullable = false)
    private String nr_rgMedico;

    @Column(length = 15 , nullable = false)
    private int nr_crmMedico;

    @Column(length = 40 , nullable = false)
    private String ds_especialidades;

    @Column(length = 14 , nullable = false)
    private String ds_celular;

    @Column(length = 100 , nullable = false)
    private String ds_email;

    @Column(length = 10 , nullable = false)
    private String ds_senha;

    /**
     * @return the nm_medico
     */
    public String getNm_medico() {
        return nm_medico;
    }

    /**
     * @param nm_medico the nm_medico to set
     */
    public void setNm_medico(String nm_medico) {
        this.nm_medico = nm_medico;
    }

    /**
     * @return the nr_cpfMedico
     */
    public String getNr_cpfMedico() {
        return nr_cpfMedico;
    }

    /**
     * @param nr_cpfMedico the nr_cpfMedico to set
     */
    public void setNr_cpfMedico(String nr_cpfMedico) {
        this.nr_cpfMedico = nr_cpfMedico;
    }

    /**
     * @return the nr_rgMedico
     */
    public String getNr_rgMedico() {
        return nr_rgMedico;
    }

    /**
     * @param nr_rgMedico the nr_rgMedico to set
     */
    public void setNr_rgMedico(String nr_rgMedico) {
        this.nr_rgMedico = nr_rgMedico;
    }

    /**
     * @return the nr_crmMedico
     */
    public int getNr_crmMedico() {
        return nr_crmMedico;
    }

    /**
     * @param nr_crmMedico the nr_crmMedico to set
     */
    public void setNr_crmMedico(int nr_crmMedico) {
        this.nr_crmMedico = nr_crmMedico;
    }

    /**
     * @return the ds_especialidades
     */
    public String getDs_especialidades() {
        return ds_especialidades;
    }

    /**
     * @param ds_especialidades the ds_especialidades to set
     */
    public void setDs_especialidades(String ds_especialidades) {
        this.ds_especialidades = ds_especialidades;
    }

    /**
     * @return the ds_celular
     */
    public String getDs_celular() {
        return ds_celular;
    }

    /**
     * @param ds_celular the ds_celular to set
     */
    public void setDs_celular(String ds_celular) {
        this.ds_celular = ds_celular;
    }

    /**
     * @return the ds_email
     */
    public String getDs_email() {
        return ds_email;
    }

    /**
     * @param ds_email the ds_email to set
     */
    public void setDs_email(String ds_email) {
        this.ds_email = ds_email;
    }

    /**
     * @return the ds_senha
     */
    public String getDs_senha() {
        return ds_senha;
    }

    /**
     * @param ds_senha the ds_senha to set
     */
    public void setDs_senha(String ds_senha) {
        this.ds_senha = ds_senha;
    }

    
}