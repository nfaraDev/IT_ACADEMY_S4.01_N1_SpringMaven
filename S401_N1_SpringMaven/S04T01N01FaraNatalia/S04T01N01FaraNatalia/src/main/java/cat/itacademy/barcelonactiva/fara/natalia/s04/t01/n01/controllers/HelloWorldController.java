package cat.itacademy.barcelonactiva.fara.natalia.s04.t01.n01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String helloWorld(@RequestParam(defaultValue = "UNKNOWN")String nombre) {
        return "Hola,"+ nombre + ". Estas ejecutando un projecto MAVEN." ;

    }
    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nombre}"})
    public String saluda2(@PathVariable(required = false) String nombre) {
        if (nombre == null) {
            nombre = "UNKNOWN";
        }
        return "Hola, " + nombre + ". Estás ejecutando un proyecto MAVEN.";
    }

}
