package org.example.service.impl;

import org.example.service.PessoaService;

public class PessoaServiceImpl implements PessoaService {

    @Override
    public int soma(int a, int b) {
        return a + b;
    }

    @Override
    public int subtrai(int a, int b) {
        return a - b;
    }
}
