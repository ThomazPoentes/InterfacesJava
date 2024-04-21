package org.example.controller;

import org.example.service.PessoaService;

public class PessoaController {

    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    public int soma(int a, int b) {
        return pessoaService.soma(a, b);
    }

    public int subtrai(int a, int b) {
        return pessoaService.subtrai(a, b);
    }
}
