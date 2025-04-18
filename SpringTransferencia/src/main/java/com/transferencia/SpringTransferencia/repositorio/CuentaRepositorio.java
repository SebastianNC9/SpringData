package com.transferencia.SpringTransferencia.repositorio;

import com.transferencia.SpringTransferencia.model.Cuenta;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class CuentaRepositorio {
    private final Map<Long, Cuenta> cuentas = new HashMap<>();

    public CuentaRepositorio() {
        // Cuentas de ejemplo
        cuentas.put(1L, new Cuenta(1L, "Juan", new BigDecimal("1000.00")));
        cuentas.put(2L, new Cuenta(2L, "Ana", new BigDecimal("500.00")));
    }

    public Optional<Cuenta> findById(Long id) {
        return Optional.ofNullable(cuentas.get(id));
    }
    
    public Collection<Cuenta> findAll() {
    return cuentas.values();
    }

    public void actualizarCantidad(Long id, BigDecimal nuevaCantidad) {
        Cuenta cuenta = cuentas.get(id);
        if (cuenta != null) {
            cuenta.setCantidad(nuevaCantidad);
        }
    }
}

