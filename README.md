# Spring-Maven

****SPRING************************************************************************************************************************************************
 Spring es un framework poderoso y ampliamente utilizado en el desarrollo de aplicaciones empresariales en Java. Proporciona una infraestructura completa 
 y flexible para simplificar el desarrollo de aplicaciones, promoviendo la modularidad, la flexibilidad y la reutilización del código.
 Algunos de los principales componentes y características de Spring incluyen:
- Contenedor de Spring: es el núcleo del framework y se encarga de gestionar y configurar los objetos de la aplicación. Utiliza el principio de IoC para 
invertir el control de la creación y gestión de objetos en el contenedor de Spring, lo que facilita la reutilización y el mantenimiento del código.
- Inyección de dependencias: es un patrón de diseño utilizado por Spring para administrar las dependencias entre los objetos de una aplicación. 
En lugar de que los objetos creen y administren sus propias dependencias, Spring se encarga de inyectar las dependencias necesarias en los objetos, lo 
que promueve la modularidad y la flexibilidad del código.
- Spring MVC: es un framework de desarrollo web basado en el patrón Modelo-Vista-Controlador (MVC). Proporciona una estructura para desarrollar aplicaciones
web de manera modular y escalable. Spring MVC se integra con otros componentes de Spring, como el contenedor de Spring y la inyección de dependencias,
lo que facilita el desarrollo de aplicaciones web robustas.
- Spring Data: es un subproyecto de Spring que proporciona una capa de abstracción para acceder y manipular datos en aplicaciones. Spring Data simplifica 
el acceso a diferentes fuentes de datos, como bases de datos relacionales, bases de datos NoSQL y servicios web, utilizando APIs consistentes y declarativas.
- Spring Security: es un módulo de Spring que proporciona características de seguridad para aplicaciones web. Permite autenticar y autorizar usuarios, 
proteger recursos y gestionar sesiones de usuario de manera segura.
- Spring Boot: es una extensión de Spring que simplifica la configuración y el despliegue de aplicaciones basadas en Spring. Spring Boot proporciona una
configuración automática basada en convenciones y un servidor web embebido, lo que facilita el desarrollo y la ejecución de aplicaciones Spring.
************************************************************************************************************************************************************ 

- Ejercicio Spring y Maven
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

Convertiremos esta aplicación en una APIO RISTRA:
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

 Para usar Spring Initializr y crear un proyecto de Spring Boot, puedes seguir los siguientes pasos:

1 Accede a la página web del Spring Initializr, que es una herramienta web proporcionada por Pivotal Web Service. Puedes acceder a ella a través de este enlace: Spring Initializr.
2 En la página del Spring Initializr, verás diferentes opciones para configurar tu proyecto. Aquí puedes especificar los siguientes detalles:
  -Project: Elige el tipo de proyecto que deseas crear, ya sea Maven o Gradle.
  -Language: Selecciona el lenguaje de programación que utilizarás en tu proyecto, por ejemplo, Java.
  -Spring Boot: Elige la versión de Spring Boot que deseas utilizar.
  -Group: Especifica el identificador del grupo para tu proyecto.
  -Artifact: Define el nombre del artefacto para tu proyecto.
  -Dependencies: Selecciona las dependencias que deseas incluir en tu proyecto. Puedes elegir entre una amplia variedad de dependencias, como Spring Web, Spring Data JPA, Spring Security, entre otras.
3 Una vez que hayas configurado los detalles de tu proyecto, haz clic en el botón "Generate" para generar la estructura del proyecto.
4 Después de hacer clic en "Generate", se descargará un archivo ZIP que contiene la estructura del proyecto con la configuración especificada.
5 Extrae el archivo ZIP descargado en la ubicación deseada de tu sistema de archivos.
6 Abre tu IDE preferido, como IntelliJ IDEA o Eclipse, y selecciona la opción para abrir un proyecto existente.
7 Navega hasta la carpeta donde extrajiste el archivo ZIP y selecciona la carpeta del proyecto.
8 Importa el proyecto en tu IDE y espera a que se resuelvan las dependencias y se configuren las configuraciones del proyecto.
9 Una vez importado el proyecto, puedes comenzar a desarrollar tu aplicación de Spring Boot según tus necesidades.
