package com.transferencia.SpringTransferencia.controlador;

import com.transferencia.SpringTransferencia.TransferenciaDTO;
import com.transferencia.SpringTransferencia.servicio.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transferencia")
public class TransferenciaController {

    @Autowired
    private TransferenciaService service;

    @PostMapping
    public ResponseEntity<String> transferir(@RequestBody TransferenciaDTO datos) {
        try {
            boolean resultado = service.transferir(datos.origen, datos.destino, datos.cantidad);
            if (resultado) {
                return ResponseEntity.ok("Transferencia realizada con éxito.");
            } else {
                return ResponseEntity.badRequest().body("Saldo insuficiente.");
            }
        } catch (Exception e) {
            return ResponseEntity.status(404).body("Cuenta no encontrada.");
        }
    }

    @GetMapping
    public ResponseEntity<?> obtenerTodasLasCuentas() {
        return ResponseEntity.ok(service.obtenerTodasLasCuentas());
    }

}