package org.example.main;

import org.example.controller.PessoaController;
import org.example.service.PessoaService;
import org.example.service.impl.PessoaServiceImpl;

public class App {

    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaServiceImpl();
        PessoaController pessoaController = new PessoaController(pessoaService);

        int soma = pessoaController.soma(5, 3);
        int subtrai = pessoaController.subtrai(10, 5);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtrai);
    }
}
