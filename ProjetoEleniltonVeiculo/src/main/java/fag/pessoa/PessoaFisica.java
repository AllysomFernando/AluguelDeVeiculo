package fag.pessoa;

import java.util.Scanner;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String telefone, String endereco, String cpf) {
      super(nome, telefone, endereco);
      this.cpf = cpf;
    }

    public PessoaFisica() {
        super();
    }


    public void atendimentoPessoaFisica(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");

        String leitor = scanner.nextLine();
        setNome(leitor);

        System.out.println("Qual é o seu telefone?");
        leitor = scanner.nextLine();
        setTelefone(leitor);

        System.out.println("Qual é o seu endereço?");
        leitor = scanner.nextLine();
        setEndereco(leitor);

        System.out.println("Qual é o seu CPF?");
        leitor = scanner.next();
        setCpf(leitor);
    }


    @Override
    public String toString() {
      return "Pessoa Física: \nNome: " + getNome() + "\nTelefone: " + getTelefone() + "\nEndereço: " + getEndereco() + "\nCPF: " + getCpf();
    }
  
    public String getCpf() {
      return cpf;
    }
  
    public void setCpf(String cpf) {
      this.cpf = cpf;
    }
  }
