# Spring-Maven

****SPRING BOOT ************************************************************************************************************************************************
Es un marco de trabajo de desarrollo de aplicaciones Java que simplifica y agiliza el proceso de creación de aplicaciones basadas en Spring. Proporciona una 
configuración predeterminada inteligente, integración con Spring Framework y herramientas para la gestión de dependencias, lo que permite a los desarrolladores
centrarse en el desarrollo de la lógica de la aplicación sin tener que preocuparse por la configuración y la infraestructura subyacente

Algunas características y beneficios clave de Spring Boot son:
 -Facilidad de configuración: Spring Boot proporciona una configuración automática basada en convenciones y propiedades predeterminadas. Esto significa que los 
desarrolladores no tienen que realizar una configuración manual compleja, lo que les permite concentrarse en el desarrollo de la lógica de la aplicación.
 -Despliegue sencillo: Spring Boot permite empaquetar una aplicación como un archivo JAR autocontenido, lo que facilita su despliegue y ejecución en cualquier
entorno compatible con Java.
 -Integración con Spring Framework: Spring Boot se basa en el popular marco de trabajo Spring Framework, lo que significa que los desarrolladores pueden aprovechar
todas las características y beneficios de Spring, como la inversión de control (IoC) y la inyección de dependencias (DI).
 -Gestión de dependencias simplificada: Spring Boot utiliza Maven o Gradle como sistemas de construcción y proporciona una forma sencilla de gestionar dependencias
a través de su herramienta de gestión de dependencias incorporada.
 -Monitoreo y administración: Spring Boot ofrece características integradas para el monitoreo y la administración de aplicaciones, como el inicio rápido, el ajuste
de propiedades en tiempo de ejecución y la exposición de métricas y puntos de enlace de administración.
************************************************************************************************************************************************************ 

- Ejercicio Spring y Maven
- 
Este ejercicio es un primer contacto con Spring y Maven.

Accede en la página ->https://start.spring.io/, y genera un proyecto Spring boot con las siguientes características:
PROJECT (gestor de dependencias): Maven.
LANGUAGE:                         Java.
SPRING BOOT:                     La última versión estable.
PROJECT METADATA Group:          cat.itacademy.barcelonactiva.apellidos.nombre.s04.t01.n01
Artifact:                        S04T01N01GognomsNom
Name:                            S04T01N01GognomsNom
Description:                     S04T01N01GognomsNom
Package name:                    cat.itacademy.barcelonactiva.apellidos.nombre.s04.t01.n01
PACKAGIN:                        Jar
JAVA:                            Mínimo versión 11
Dependencias:
                                 Spring Boot DevTools
                                 Spring Web

Impórtalo a un IDE (Eclipse/IntelliJ/Visual Basic) con la opción Hilo > Importe > Existing Maven Project.
Al archivo application.properties, configura la variable server.puerto con el valor 9000.

Convertiremos esta aplicación en una API REST:
Dependiendo del package principal, crea otro subpackage denominado Controllers, y para sus adentros, añade la clase HelloWorldController.
Tendrá que tener dos métodos:
String saluda
String saluda2
Estos dos métodos recibirán un parámetro String llamado nombre, y devolverán la frase:
“Hola, “ + nombre + “. Estás ejecutando un proyecto Maven”.

1-El primer método responderá a una petición GET, y tendrá que ser configurado para recibir el parámetro como un RequestParam. El parámetro "nombre" tendrá el valor por defecto “UNKNOWN”.
Tendrá que responder a:
http://localhost:9000/HelloWorld
http://localhost:9000/HelloWorld?nombre=Mi nombre

2- El segundo método responderá a una petición GET, y tendrá que ser configurado para recibir el parámetro como una PathVariable. El parámetro "nombre" será opcional.
Tendrá que responder a:

http://localhost:9000/HelloWorld2
http://localhost:9000/HelloWorld2/mi nombre

## Enlaces
   - [Enlace  Spring-Maven]([(https://www.youtube.com/watch?v=2tUHNRp7Auo)pi)]
   - [Enlace Readme GitHub]([(https://www.aluracursos.com/blog/como-escribir-un-readme-increible-en-tu-github)]
       
## Uso

 Para usar Spring Boot, puedes seguir los siguientes pasos:

Para utilizar Spring Boot, puedes seguir los siguientes pasos:
 1-Crear un proyecto de Spring Boot: Puedes utilizar Spring Initializr para generar un proyecto de Spring Boot. Spring Initializr es una herramienta en línea
 que te permite seleccionar las dependencias y configuraciones que deseas para tu proyecto. Puedes acceder a Spring Initializr a través de su sitio web o mediante
 plugins en tu IDE favorito, como IntelliJ IDEA o Eclipse. Durante la creación del proyecto, puedes seleccionar las dependencias y configuraciones específicas que 
 necesitas para tu aplicación.
 2-Estructura del proyecto: Después de generar el proyecto de Spring Boot, tendrás una estructura de directorios y archivos organizados de manera convencional.
 La estructura típica de un proyecto de Spring Boot incluye un directorio raíz, directorios para el código fuente principal y de prueba, un archivo pom.xml para 
 la configuración de Maven, y otros directorios y archivos relacionados con la configuración y recursos de la aplicación. Puedes consultar la estructura detallada
 en la respuesta anterior.
 3-Clase principal: En el proyecto de Spring Boot, tendrás una clase principal que actúa como punto de entrada de la aplicación. Esta clase generalmente se anota 
 con la anotación @SpringBootApplication, que combina varias anotaciones de configuración de Spring en una sola. La clase principal también contiene un método main
 que inicia la aplicación. Aquí es donde puedes ejecutar tu aplicación Spring Boot.
 4-Configuración: Puedes configurar tu aplicación Spring Boot mediante el archivo application.properties o application.yml. Estos archivos contienen propiedades de
 configuración que afectan el comportamiento de la aplicación. Puedes personalizar diferentes aspectos de tu aplicación, como la configuración del servidor, la
 s bases de datos, la internacionalización, la seguridad, entre otros. Puedes encontrar una lista completa de las propiedades de configuración en la documentación
 oficial de Spring Boot.
 5-Desarrollo de la aplicación: Una vez que hayas configurado tu proyecto de Spring Boot, puedes comenzar a desarrollar tu aplicación. Puedes crear controladores,
 servicios, repositorios y otros componentes de Spring para implementar la lógica de negocio de tu aplicación. Puedes utilizar las anotaciones de Spring, 
 como @Controller, @Service, @Repository, para marcar tus componentes y permitir que Spring los gestione automáticamente.
 6-Ejecución y pruebas: Para ejecutar tu aplicación de Spring Boot, puedes ejecutar el método main en la clase principal. Esto iniciará el servidor incorporado de
 Spring Boot y desplegará tu aplicación en él. Puedes acceder a tu aplicación a través de la URL proporcionada por el servidor. También puedes realizar pruebas
 unitarias y de integración en tu aplicación utilizando herramientas como JUnit y Mockito.
