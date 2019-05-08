package br.com.acinil.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class GenericDoMain implements serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

    public Long getCodigo(){
        return codigo;
    }

    public Long setCodigo(){
        Long codigo2 = codigo;
        this.codigo2 = codigo2;
    }

}