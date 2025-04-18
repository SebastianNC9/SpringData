# Aplicación de Transferencias en Spring Boot

## Descripción General

Esta es una aplicación desarrollada con Spring Boot que simula un sistema de **transferencia de dinero** entre cuentas. Cuenta con las siguientes funcionalidades:

- Persistencia de datos con **MySQL** usando Spring Data JPA.
- Realizar transferencias entre cuentas.
- Consultar el estado de todas las cuentas.

---

## Estructura del Proyecto

- `model/Cuenta.java`  
  Entidad que representa una cuenta con ID, nombre del propietario y saldo.

- `repositorio/CuentaRepositorio.java`  
  Interfaz que extiende `JpaRepository`, permitiendo operaciones CRUD directamente con la base de datos MySQL.

- `servicio/TransferenciaService.java`  
  Contiene la lógica de negocio para realizar transferencias y consultar cuentas.

- `TransferenciaDTO.java`  
  Clase para recibir los datos del cuerpo JSON en la transferencia.

- `controlador/TransferenciaController.java`  
  Controlador REST que maneja las peticiones HTTP relacionadas con transferencias y consultas.

---

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

---

## Requisitos

- Java 17+
- Maven
- Spring Boot

---

## Para correr el proyecto

- MySQL esté corriendo (por ejemplo, en XAMPP).
- Crea la base de datos transferencias_db desde phpMyAdmin.
- Ejecuta la aplicación con Maven
- Usa Postman para probar los endpoints.

**En application.properties esta parte debe ir con su usuario y contraseña**

- spring.datasource.username=
- spring.datasource.password=