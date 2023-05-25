package fag.pessoa.teste;

import fag.pessoa.PessoaFisica;
import fag.pessoa.PessoaJuridica;

public class TestarPessoa {

    public static void main(String[] args) {
      PessoaFisica pessoaFisica = new PessoaFisica("Allysom", "45 99916-1429", "Rua Alcdies Paese", "110.765.908.90");
      PessoaJuridica pessoaJuridica = new PessoaJuridica("FAG", "45 3321-3900", "Av das Torres", "02.203.539/0001-73");
      System.out.println(pessoaFisica);
      System.out.println(pessoaJuridica);
     }
  }