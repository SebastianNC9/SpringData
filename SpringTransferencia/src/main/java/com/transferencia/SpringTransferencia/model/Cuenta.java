package com.transferencia.SpringTransferencia.model;

import java.math.BigDecimal;

public class Cuenta {
    private Long id;
    private String propietario;
    private BigDecimal cantidad;

    public Cuenta() {}

    public Cuenta(Long id, String propietario, BigDecimal cantidad) {
        this.id = id;
        this.propietario = propietario;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public String getPropietario() {
        return propietario;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
}
