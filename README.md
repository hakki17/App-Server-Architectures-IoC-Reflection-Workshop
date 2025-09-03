# App-Server-Architectures-IoC-Reflection-Workshop

## Autor:

María Paula Sánchez Macías

## Universidad:

Escuela Colombiana de Ingeniería Julio Garavito

## Materia:

Arquitecturas Empresariales

---

# Taller de Arquitecturas de Servidores de Aplicaciones, Meta protocolos de objetos, Patrón IoC, Reflexión

Microframework Java ligero inspirado en Spring Boot, que utiliza anotaciones propias para crear controladores REST y manejar rutas HTTP.

---

## Descripción

Este proyecto implementa un servidor HTTP con anotaciones personalizadas como `@RestController`, `@GetMapping` y `@RequestParam` para definir rutas y parámetros en métodos estáticos.

El servidor utiliza reflexión para registrar rutas y asociarlas con métodos, similar a cómo funciona Spring Boot.

---

## Estructura del proyecto

![](https://github.com/hakki17/App-Server-Architectures-IoC-Reflection-Workshop/blob/main/img/tree1.png)

![](https://github.com/hakki17/App-Server-Architectures-IoC-Reflection-Workshop/blob/main/img/tree2.png)

- **annotations**  
  Contiene las anotaciones personalizadas que definen comportamientos específicos para los controladores, métodos y parámetros, como `@GetMapping`, `@RequestParam` y `@RestController`. Estas anotaciones facilitan la creación de rutas HTTP y la configuración de servicios.

- **examples**  
  Aquí se encuentran las clases que utilizan las anotaciones y la infraestructura del framework. `GreetingController.java` es un controlador que maneja solicitudes HTTP y responde con mensajes.

- **httpServer**  
  Esta carpeta contiene las clases que implementan la lógica del servidor HTTP, como `HttpServer.java` (el servidor principal), `HttpRequest.java`, `HttpResponse.java`, y `Service.java`. Aquí está el núcleo que maneja las peticiones y respuestas.

- **MicroSpringBoot.java**  
  La clase principal que arranca la aplicación.


## Requisitos

- Java 17
- Maven 3.6+
- JUnit 5 (`junit-jupiter` incluido como dependencia)

## Cómo ejecutar

Para clonar el repositorio:

```bash
git clone https://github.com/hakki17/App-Server-Architectures-IoC-Reflection-Workshop
``` 

Para compilar el proyecto:

```bash
mvn clean compile
```

Para ejecutar:

```bash
java -cp target/classes co.escuelaing.arep.microspringboot.MicroSpringBoot
```

Para ejecutar los test:

```bash
mvn test
```

---

## Tests

El test principal es **HttpServerTest**, que verifica que el método `HttpServer.loadServices()` registre correctamente los controladores y rutas.

- Respuesta Test

![](https://github.com/hakki17/App-Server-Architectures-IoC-Reflection-Workshop/blob/main/img/test.png)

## Pruebas de aceptación

- Respuesta en Terminal al ejecutar el programa

![](https://github.com/hakki17/App-Server-Architectures-IoC-Reflection-Workshop/blob/main/img/respuestaTerminal.png)

- Respuesta a peticiones en Formularios.html

![](https://github.com/hakki17/App-Server-Architectures-IoC-Reflection-Workshop/blob/main/img/respuestaFront.png)

- Respuestas con url

![](https://github.com/hakki17/App-Server-Architectures-IoC-Reflection-Workshop/blob/main/img/respi.png)
![](https://github.com/hakki17/App-Server-Architectures-IoC-Reflection-Workshop/blob/main/img/resname.png)
![](https://github.com/hakki17/App-Server-Architectures-IoC-Reflection-Workshop/blob/main/img/reshelloworld.png)

