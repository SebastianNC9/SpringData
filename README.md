# Aplicación de Transferencias en Spring Boot

## Descripción General

Esta es una aplicación desarrollada con Spring Boot que simula un sistema de **transferencia de dinero** entre cuentas. Cuenta con las siguientes funcionalidades:

- Crear cuentas simuladas en memoria.
- Realizar transferencias entre cuentas (verificación de saldo).
- Consultar el estado de todas las cuentas.

---

## 🧱 Estructura del Proyecto

- repositorio/**CuentaRepositorio.java** = Simula una base de datos en memoria con dos cuentas precargadas
- servicio/**TransferenciaService.java** = Contiene la logica de negocio para realizar transferencias y consultar cuentas
- **TransferenciaDTO.java** = Clase para recibir los datos del cuerpo JSON en la transferencia
- controlador/**TransferenciaController.java** = Maneja las peticiones HTTP relacionadas con transferencias y consultas

## EP

1. Realizar transferencia
POST http://localhost:8080/transferencia

Body JSON:
{
  "origen": 1,
  "destino": 2,
  "cantidad": 200.00
}

2. Consultar todas las cuentas

GET http://localhost:8080/transferencia

## Requisitos

- Java 17+
- Maven
- Spring Boot
