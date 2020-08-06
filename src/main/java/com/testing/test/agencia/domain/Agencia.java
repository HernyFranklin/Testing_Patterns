package com.testing.test.agencia.domain;

import lombok.Getter;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 31/7/2020
 */
@Getter
public class Agencia {
    private final Long idAgencia;
    private final String nombre;
    private final String direccion;

    public Agencia(Long idAgencia, String nombre, String direccion) {
        this.idAgencia = idAgencia;
        this.nombre = nombre;
        this.direccion = direccion;
    }
}
