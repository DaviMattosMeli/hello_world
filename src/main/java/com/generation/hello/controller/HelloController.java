package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/")
public class HelloController {


    @GetMapping
    public String hello() {
        return "<h1>Hello World</h1>";
    }

    @GetMapping("/lista-bsm")
    public ArrayList<String> bsm() {
        ArrayList<String> listasBSM = new ArrayList<>();

        listasBSM.add("Listas BSM");
        listasBSM.add("Introdução às habilidades comportamentais e mentalidades");
        listasBSM.add("Mentalidade de Crescimento");
        listasBSM.add("Persistência");
        listasBSM.add("Responsabilidade Pessoal");
        listasBSM.add("Orientação ao Futuro");
        listasBSM.add("Comunicação");
        listasBSM.add("Orientação ao Detalhe");
        listasBSM.add("Proatividade");

        return listasBSM;
    }

    @GetMapping("/objetivos")
    public ArrayList<String> objetivos() {
        ArrayList<String> objetivos = new ArrayList<>();

        objetivos.add("Objetivos: ");
        objetivos.add("Estudar Java e Spring");
        objetivos.add("Ser mais proativo");
        objetivos.add("Ter mais persistência");
        objetivos.add("Trabalhar mais em equipe visto que vamos ter um bom trabalho pela frente");

        return objetivos;
    }


}
