package fag.pessoa;

import java.util.Scanner;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    public PessoaJuridica(String nome, String telefone, String endereco, String cnpj) {
      super(nome, telefone, endereco);
      this.cnpj = cnpj;
    }

    public PessoaJuridica() {

    }

    public void atendimentoPessoaJuridica(){
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

        System.out.println("Qual é o seu CNPJ?");
        leitor = scanner.nextLine();
        setCnpj(leitor);
    }

    @Override
    public String toString() {
      return "Pessoa Jurídica:\nNome: " + getNome() + "\nTelefone: " + getTelefone() + "\nEndereço: " + getEndereco() + "\nCNPJ: " + getCnpj();
    }



    public String getCnpj() {
      return cnpj;
    }
  
    public void setCnpj(String cnpj) {
      this.cnpj = cnpj;
    }
  }
