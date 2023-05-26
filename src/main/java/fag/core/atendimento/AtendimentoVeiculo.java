package fag.core.atendimento;

import fag.veiculo.escolhaVeiculo.EscolhaCarro;
import fag.veiculo.escolhaVeiculo.EscolhaMoto;

import java.util.Scanner;

public class AtendimentoVeiculo {
    public void atendimentoVeiculo(){

        Scanner inputScanner = new Scanner(System.in);
        int leitorTipo;

        do {
            System.out.println("Você vai querer alugar uma:\n1 - moto\n2 - carro");
            String input = inputScanner.next();
            if (input.matches("[1-2]")) {
                leitorTipo = Integer.parseInt(input);
                break;
            }
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        } while (true);

        if (leitorTipo == 1) {
            EscolhaMoto escolhaMoto = new EscolhaMoto();
            System.out.println("Selecionada a opção de moto...");
            escolhaMoto.escolhaMoto();
        } else if (leitorTipo == 2) {
            EscolhaCarro escolhaCarro = new EscolhaCarro();
            System.out.println("Selecionada a opção de carro...");
            escolhaCarro.escolhaCarro();
        }
    }
}
