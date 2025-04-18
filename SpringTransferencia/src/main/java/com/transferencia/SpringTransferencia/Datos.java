package com.transferencia.SpringTransferencia;

import com.transferencia.SpringTransferencia.model.Cuenta;
import com.transferencia.SpringTransferencia.repositorio.CuentaRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class Datos {

    @Bean
    CommandLineRunner init(CuentaRepositorio repo) {
        return args -> {
            if (repo.count() == 0) {
                repo.save(new Cuenta(null, "Juan", new BigDecimal("1000.00")));
                repo.save(new Cuenta(null, "Ana", new BigDecimal("500.00")));
            }
        };
    }
}