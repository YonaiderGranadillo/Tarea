package com.prueba.apirest.api;

import model.Tarea;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class ApiBasic {

    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }




    @PostMapping(path = "/prueba",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String prueba(@RequestBody Tarea tarea){
        return "Hola "+tarea.toString();
    }



}
