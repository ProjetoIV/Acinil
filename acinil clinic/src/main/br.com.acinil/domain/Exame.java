package br.com.acinil.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Exame extends GeericDoMain {
    @Column(length = 50 , nullable = false)
    private String tp_exame;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dt_exate;

    @Column(length = 100 , nullable = false)
    private String ds_resultado;

    @Column(length = 100)
    private String ds_observacao;

    /**
     * @return the tp_exame
     */
    public String getTp_exame() {
        return tp_exame;
    }

    /**
     * @param tp_exame the tp_exame to set
     */
    public void setTp_exame(String tp_exame) {
        this.tp_exame = tp_exame;
    }

    /**
     * @return the dt_exate
     */
    public Date getDt_exate() {
        return dt_exate;
    }

    /**
     * @param dt_exate the dt_exate to set
     */
    public void setDt_exate(Date dt_exate) {
        this.dt_exate = dt_exate;
    }

    /**
     * @return the ds_resultado
     */
    public String getDs_resultado() {
        return ds_resultado;
    }

    /**
     * @param ds_resultado the ds_resultado to set
     */
    public void setDs_resultado(String ds_resultado) {
        this.ds_resultado = ds_resultado;
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