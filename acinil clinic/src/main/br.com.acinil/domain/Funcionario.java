package br.com.acinil.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Funcionario extends GenericDoMain {
    @Column(length = 50 , nullable = false)
    private String nm_funcionario;

    @Column(length = 14 , nullable = false)
    private String nr_cpfFuncionario;

    @Column(length = 12 , nullable = false)
    private String nr_rgFuncionario;

    @Column(length = 50 , nullable = false)
    private String ds_enderecoFuncionario;

    @Column(length = 10 , nullable = false)
    private short ds_numEndFuncionario;

    @Column(length = 50 , nullable = false)
    private String ds_bairroFuncionario;

    @Column(length = 10 , nullable = false)
    private String ds_cepFuncionario;

    @Column(length = 50)
    private String ds_complementoFuncionario;

    @Column(length = 14)
    private String num_telFuncionario;

    @Column(length = 14 , nullable = false)
    private String num_celFuncionario;

    @Column(length = 100 , nullable = false)
    private String ds_emailFuncionario;

    @Column(length = 20 , nullable = false)
    private String ds_senhaFuncionario;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dt_criacao;

    @ManyToOne
	@JoinColumn(nullable = false)
    private Cargo cargo;

    /**
     * @return the nm_funcionario
     */
    public String getNm_funcionario() {
        return nm_funcionario;
    }

    /**
     * @param nm_funcionario the nm_funcionario to set
     */
    public void setNm_funcionario(String nm_funcionario) {
        this.nm_funcionario = nm_funcionario;
    }

    /**
     * @return the nr_cpfFuncionario
     */
    public String getNr_cpfFuncionario() {
        return nr_cpfFuncionario;
    }

    /**
     * @param nr_cpfFuncionario the nr_cpfFuncionario to set
     */
    public void setNr_cpfFuncionario(String nr_cpfFuncionario) {
        this.nr_cpfFuncionario = nr_cpfFuncionario;
    }

    /**
     * @return the nr_rgFuncionario
     */
    public String getNr_rgFuncionario() {
        return nr_rgFuncionario;
    }

    /**
     * @param nr_rgFuncionario the nr_rgFuncionario to set
     */
    public void setNr_rgFuncionario(String nr_rgFuncionario) {
        this.nr_rgFuncionario = nr_rgFuncionario;
    }

    /**
     * @return the ds_enderecoFuncionario
     */
    public String getDs_enderecoFuncionario() {
        return ds_enderecoFuncionario;
    }

    /**
     * @param ds_enderecoFuncionario the ds_enderecoFuncionario to set
     */
    public void setDs_enderecoFuncionario(String ds_enderecoFuncionario) {
        this.ds_enderecoFuncionario = ds_enderecoFuncionario;
    }

    /**
     * @return the ds_numEndFuncionario
     */
    public short getDs_numEndFuncionario() {
        return ds_numEndFuncionario;
    }

    /**
     * @param ds_numEndFuncionario the ds_numEndFuncionario to set
     */
    public void setDs_numEndFuncionario(short ds_numEndFuncionario) {
        this.ds_numEndFuncionario = ds_numEndFuncionario;
    }

    /**
     * @return the ds_bairroFuncionario
     */
    public String getDs_bairroFuncionario() {
        return ds_bairroFuncionario;
    }

    /**
     * @param ds_bairroFuncionario the ds_bairroFuncionario to set
     */
    public void setDs_bairroFuncionario(String ds_bairroFuncionario) {
        this.ds_bairroFuncionario = ds_bairroFuncionario;
    }

    /**
     * @return the ds_cepFuncionario
     */
    public String getDs_cepFuncionario() {
        return ds_cepFuncionario;
    }

    /**
     * @param ds_cepFuncionario the ds_cepFuncionario to set
     */
    public void setDs_cepFuncionario(String ds_cepFuncionario) {
        this.ds_cepFuncionario = ds_cepFuncionario;
    }

    /**
     * @return the ds_complementoFuncionario
     */
    public String getDs_complementoFuncionario() {
        return ds_complementoFuncionario;
    }

    /**
     * @param ds_complementoFuncionario the ds_complementoFuncionario to set
     */
    public void setDs_complementoFuncionario(String ds_complementoFuncionario) {
        this.ds_complementoFuncionario = ds_complementoFuncionario;
    }

    /**
     * @return the num_telFuncionario
     */
    public String getNum_telFuncionario() {
        return num_telFuncionario;
    }

    /**
     * @param num_telFuncionario the num_telFuncionario to set
     */
    public void setNum_telFuncionario(String num_telFuncionario) {
        this.num_telFuncionario = num_telFuncionario;
    }

    /**
     * @return the num_celFuncionario
     */
    public String getNum_celFuncionario() {
        return num_celFuncionario;
    }

    /**
     * @param num_celFuncionario the num_celFuncionario to set
     */
    public void setNum_celFuncionario(String num_celFuncionario) {
        this.num_celFuncionario = num_celFuncionario;
    }

    /**
     * @return the ds_emailFuncionario
     */
    public String getDs_emailFuncionario() {
        return ds_emailFuncionario;
    }

    /**
     * @param ds_emailFuncionario the ds_emailFuncionario to set
     */
    public void setDs_emailFuncionario(String ds_emailFuncionario) {
        this.ds_emailFuncionario = ds_emailFuncionario;
    }

    /**
     * @return the ds_senhaFuncionario
     */
    public String getDs_senhaFuncionario() {
        return ds_senhaFuncionario;
    }

    /**
     * @param ds_senhaFuncionario the ds_senhaFuncionario to set
     */
    public void setDs_senhaFuncionario(String ds_senhaFuncionario) {
        this.ds_senhaFuncionario = ds_senhaFuncionario;
    }

    /**
     * @return the dt_criacao
     */
    public Date getDt_criacao() {
        return dt_criacao;
    }

    /**
     * @param dt_criacao the dt_criacao to set
     */
    public void setDt_criacao(Date dt_criacao) {
        this.dt_criacao = dt_criacao;
    }

    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
	 * @param cargo the cargo to set
	 */
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}