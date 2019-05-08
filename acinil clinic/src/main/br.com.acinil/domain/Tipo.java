package br.com.acinil.domain;

import java.math.BigDecimal;

import javax.persistence.Column;

public class Tipo extends GenericDoMain {
    @Column(length = 30 , nullable = false)
    private String nm_tipoConsulta;

    @Column(nullable = false , precision = 7 , scale = 2)
    private BigDecimal nr_valor;

    /**
     * @return the nm_tipoConsulta
     */
    public String getNm_tipoConsulta() {
        return nm_tipoConsulta;
    }

    /**
     * @param nm_tipoConsulta the nm_tipoConsulta to set
     */
    public void setNm_tipoConsulta(String nm_tipoConsulta) {
        this.nm_tipoConsulta = nm_tipoConsulta;
    }

    /**
     * @return the nr_valor
     */
    public BigDecimal getNr_valor() {
        return nr_valor;
    }

    /**
     * @param nr_valor the nr_valor to set
     */
    public void setNr_valor(BigDecimal nr_valor) {
        this.nr_valor = nr_valor;
    }

}