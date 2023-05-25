package fag.veiculo.escolhaVeiculo;

import fag.veiculo.DiariaMoto;
import fag.veiculo.Moto;

import java.util.Scanner;

public class EscolhaMoto {
    public void escolhaMoto(){
        Scanner scanner = new Scanner(System.in);

        Moto[] motos = new Moto[5];
        motos[0] = new Moto("ABC-1234", 15, 0, false, 50, 250);
        motos[1] = new Moto("DEF-5678", 10, 50, true, 60, 150);
        motos[2] = new Moto("GHI-9012", 20, 30, false, 40, 200);
        motos[3] = new Moto("JKL-3456", 25, 100, false, 70, 180);
        motos[4] = new Moto("MNO-7890", 18, 80, true, 55, 300);

        System.out.println("Escolha uma das motos disponíveis:");
        int count = 0;
        for (int i = 0; i < motos.length; i++) {
            if (!motos[i].isAlugado()) {
                count++;
                System.out.println(count + ". Placa: " + motos[i].getPlaca());
                System.out.println("   Combustível no tanque: " + motos[i].getCombustivelNoTanque());
                System.out.println("   Quilometragem: " + motos[i].getQuilometragem());
                System.out.println("   Alugado: " + motos[i].isAlugado());
                System.out.println("   Preço da diária: " + motos[i].getPrecoDiaria());
                System.out.println("   Cilindradas: " + motos[i].getCilindradas());
            }
        }

        int escolha = 0;
        boolean escolhaValida = false;
        while (!escolhaValida) {
            System.out.print("Digite o número da moto escolhida (1-" + count + "): ");
            String entrada = scanner.next();
            if (entrada.matches("\\d+")) {
                escolha = Integer.parseInt(entrada);
                if (escolha >= 1 && escolha <= count) {
                    escolhaValida = true;
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        int motoIndex = 0;
        int motoEscolhidaIndex = -1;
        while (motoEscolhidaIndex < escolha) {
            if (!motos[motoIndex].isAlugado()) {
                motoEscolhidaIndex++;
            }
            if (motoEscolhidaIndex < escolha) {
                motoIndex++;
            }
        }
        Moto motoEscolhida = motos[motoIndex];
        System.out.println("Moto escolhida: " + motoEscolhida.getPlaca());

        DiariaMoto diariaMoto = new DiariaMoto();
        double valorAluguel = diariaMoto.calcularValorAluguel(motoEscolhida);
        System.out.println("Valor do aluguel: R$" + valorAluguel);

        boolean resultado = motoEscolhida.viajar(100);
        System.out.println("A moto escolhida conseguiu viajar 100 km? " + resultado);
        System.out.println("Combustível restante na moto escolhida: " + motoEscolhida.getCombustivelNoTanque());

                    // Outras operações com a motoEscolhida...
            }
        }



