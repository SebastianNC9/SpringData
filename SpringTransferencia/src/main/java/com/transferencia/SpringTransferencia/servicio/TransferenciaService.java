package com.transferencia.SpringTransferencia.servicio;

import com.transferencia.SpringTransferencia.model.Cuenta;
import com.transferencia.SpringTransferencia.repositorio.CuentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransferenciaService {

    @Autowired
    private CuentaRepositorio repo;

    public boolean transferir(Long origen, Long destino, BigDecimal cantidad) {
        Cuenta cuentaOrigen = repo.findById(origen).orElseThrow();
        Cuenta cuentaDestino = repo.findById(destino).orElseThrow();

        BigDecimal saldoOrigen = cuentaOrigen.getCantidad();
        BigDecimal saldoDestino = cuentaDestino.getCantidad();

        if (saldoOrigen.compareTo(cantidad) < 0) {
            return false;
        }

        cuentaOrigen.setCantidad(saldoOrigen.subtract(cantidad));
        cuentaDestino.setCantidad(saldoDestino.add(cantidad));

        repo.save(cuentaOrigen);
        repo.save(cuentaDestino);

        return true;
    }

    public List<Cuenta> obtenerTodasLasCuentas() {
        return repo.findAll();
    }
}


