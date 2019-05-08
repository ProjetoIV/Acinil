package br.com.acinil.domain;

import javax.persistence.Column;

public class Paciente extends GenericDoMain{
    @Column(length = 50 , nullable = false)
    private String nm_paciente;

    @Column(length = 14 , nullable = false)
    private String nr_cpf;

    @Column(length = 12 , nullable = false)
    private String nr_rg;

    @Column(length = 50)
    private String nm_responsavel;

    @Column(length = 50 , nullable = false)
    private String ds_endereco;

    @Column(length = 10 , nullable = false)
    private short ds_numEnd;

    @Column(length = 50 , nullable = false)
    private String ds_bairro;

    @Column(length = 10 , nullable = false)
    private String ds_cep;

    @Column(length = 50)
    private String ds_complemento;

    @Column(length = 14)
    private String num_tel;

    @Column(length = 14 , nullable = false)
    private String num_cel;

    @Column(length = 100 , nullable = false)
    private String ds_email;

    @Column(length = 20 , nullable = false)
    private String ds_senha;

    /**
     * @return the nm_paciente
     */
    public String getNm_paciente() {
        return nm_paciente;
    }

    /**
     * @param nm_paciente the nm_paciente to set
     */
    public void setNm_paciente(String nm_paciente) {
        this.nm_paciente = nm_paciente;
    }

    /**
     * @return the nr_cpf
     */
    public String getNr_cpf() {
        return nr_cpf;
    }

    /**
     * @param nr_cpf the nr_cpf to set
     */
    public void setNr_cpf(String nr_cpf) {
        this.nr_cpf = nr_cpf;
    }

    /**
     * @return the nr_rg
     */
    public String getNr_rg() {
        return nr_rg;
    }

    /**
     * @param nr_rg the nr_rg to set
     */
    public void setNr_rg(String nr_rg) {
        this.nr_rg = nr_rg;
    }

    /**
     * @return the nm_responsavel
     */
    public String getNm_responsavel() {
        return nm_responsavel;
    }

    /**
     * @param nm_responsavel the nm_responsavel to set
     */
    public void setNm_responsavel(String nm_responsavel) {
        this.nm_responsavel = nm_responsavel;
    }

    /**
     * @return the ds_endereco
     */
    public String getDs_endereco() {
        return ds_endereco;
    }

    /**
     * @param ds_endereco the ds_endereco to set
     */
    public void setDs_endereco(String ds_endereco) {
        this.ds_endereco = ds_endereco;
    }

    /**
     * @return the ds_numEnd
     */
    public short getDs_numEnd() {
        return ds_numEnd;
    }

    /**
     * @param ds_numEnd the ds_numEnd to set
     */
    public void setDs_numEnd(short ds_numEnd) {
        this.ds_numEnd = ds_numEnd;
    }

    /**
     * @return the ds_bairro
     */
    public String getDs_bairro() {
        return ds_bairro;
    }

    /**
     * @param ds_bairro the ds_bairro to set
     */
    public void setDs_bairro(String ds_bairro) {
        this.ds_bairro = ds_bairro;
    }

    /**
     * @return the ds_cep
     */
    public String getDs_cep() {
        return ds_cep;
    }

    /**
     * @param ds_cep the ds_cep to set
     */
    public void setDs_cep(String ds_cep) {
        this.ds_cep = ds_cep;
    }

    /**
     * @return the ds_complemento
     */
    public String getDs_complemento() {
        return ds_complemento;
    }

    /**
     * @param ds_complemento the ds_complemento to set
     */
    public void setDs_complemento(String ds_complemento) {
        this.ds_complemento = ds_complemento;
    }

    /**
     * @return the num_tel
     */
    public String getNum_tel() {
        return num_tel;
    }

    /**
     * @param num_tel the num_tel to set
     */
    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    /**
     * @return the num_cel
     */
    public String getNum_cel() {
        return num_cel;
    }

    /**
     * @param num_cel the num_cel to set
     */
    public void setNum_cel(String num_cel) {
        this.num_cel = num_cel;
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