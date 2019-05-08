package br.com.acinil.domain;

import javax.persistence.Column;

public class Cargo extends GenericDoMain {
    @Column(length = 50 , nullable = false)
    private String nm_cargo;

    @Column(length = 150 , nullable = false)
    private String ds_cargo;

    /**
     * @return the nm_cargo
     */
    public String getNm_cargo() {
        return nm_cargo;
    }

    /**
     * @param nm_cargo the nm_cargo to set
     */
    public void setNm_cargo(String nm_cargo) {
        this.nm_cargo = nm_cargo;
    }

    /**
     * @return the ds_cargo
     */
    public String getDs_cargo() {
        return ds_cargo;
    }

    /**
     * @param ds_cargo the ds_cargo to set
     */
    public void setDs_cargo(String ds_cargo) {
        this.ds_cargo = ds_cargo;
    }

    
}