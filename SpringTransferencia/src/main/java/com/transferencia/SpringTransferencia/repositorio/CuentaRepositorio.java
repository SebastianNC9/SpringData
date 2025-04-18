package com.transferencia.SpringTransferencia.repositorio;

import com.transferencia.SpringTransferencia.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepositorio extends JpaRepository<Cuenta, Long> {
}