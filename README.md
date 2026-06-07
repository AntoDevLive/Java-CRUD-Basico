# Java-CRUD-Basico

Proyecto educativo para enseñar cómo funciona un CRUD básico utilizando Java, Spring Boot y MySQL.

El objetivo de este proyecto es mostrar la estructura mínima necesaria para crear una API REST capaz de realizar operaciones de creación, lectura, actualización y eliminación de datos, evitando añadir complejidad innecesaria como arquitecturas multicapa, manejo avanzado de excepciones o patrones más complejos.

## Tecnologías utilizadas

- Java 21
- Spring Boot 4.0.6
- Maven
- MySQL
- MySQL Workbench
- Postman

## Dependencias incluidas

El proyecto fue generado con Spring Initializr e incluye las siguientes dependencias:

- Lombok
- Spring Web
- Spring Data JPA
- MySQL Driver

## Objetivos de aprendizaje

Con este proyecto aprenderás:

- Qué es una API REST.
- Cómo crear una entidad con JPA.
- Cómo funciona un Repository.
- Cómo crear endpoints mediante un Controller.
- Cómo conectar Spring Boot con MySQL.
- Cómo generar automáticamente tablas a partir de las entidades.
- Cómo probar una API utilizando Postman.

## Estructura del proyecto

```text
src
└── main
    ├── java
    │   └── ac.java.crud
    │       ├── controller
    │       ├── entity
    │       └── repository
    └── resources
        └── application.properties
