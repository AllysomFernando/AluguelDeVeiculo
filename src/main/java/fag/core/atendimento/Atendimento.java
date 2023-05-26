package fag.core.atendimento;

import fag.pessoa.PessoaFisica;
import fag.pessoa.PessoaJuridica;

import java.util.Calendar;
import java.util.Scanner;

public class Atendimento {
    public void atendimentoInicial() {
        Calendar time = Calendar.getInstance();
        System.out.println(decodePeriod(time));
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        Scanner inputScanner = new Scanner(System.in);

        int leitorTipo;
        do {
            System.out.println("Você é uma:\n1 - pessoa física\n2 - pessoa jurídica ");
            String input = inputScanner.next();
            if (input.matches("[1-2]")) {
                leitorTipo = Integer.parseInt(input);
                break;
            }
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        } while (true);

        if (leitorTipo == 1) {
            AtendimentoVeiculo atendimentoVeiculo = new AtendimentoVeiculo();
            pessoaFisica.atendimentoPessoaFisica();
            atendimentoVeiculo.atendimentoVeiculo();
        } else if (leitorTipo == 2) {
            AtendimentoVeiculo atendimentoVeiculo = new AtendimentoVeiculo();
            pessoaJuridica.atendimentoPessoaJuridica();
            atendimentoVeiculo.atendimentoVeiculo();
        }
    }

    public static String decodePeriod(final Calendar time) {
        String decodedPeriod = null;
        int hour = time.get(Calendar.HOUR_OF_DAY);
        if (hour >= 18) {
            decodedPeriod = "\nBoa noite!\n";
        } else if (hour >= 12) {
            decodedPeriod = "\nBoa tarde!\n";
        } else {
            decodedPeriod = "\nBom dia!\n";
        }
        return decodedPeriod;
    }
}
