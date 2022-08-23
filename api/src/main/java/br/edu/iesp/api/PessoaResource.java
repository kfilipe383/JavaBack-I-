package br.edu.iesp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaResource {
    @GetMapping("/consultar")
    public Pessoa getPessoa(){
        Pessoa p = new Pessoa();
        p.setNome("kauã");
        p.setIdade(18);
        return  p;

    }
}