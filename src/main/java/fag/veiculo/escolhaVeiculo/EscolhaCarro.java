package fag.veiculo.escolhaVeiculo;

import fag.veiculo.Carro;
import fag.veiculo.DiariaCarro;

import java.util.Scanner;

public class EscolhaCarro {
    public void escolhaCarro(){
        Scanner scanner = new Scanner(System.in);

        Carro[] carros = new Carro[5];
        carros[0] = new Carro("KYS-9812", 20, 0, false, 100, 150);
        carros[1] = new Carro("JHG-5678", 15, 50, true, 120, 200);
        carros[2] = new Carro("QWE-1234", 10, 30, false, 80, 120);
        carros[3] = new Carro("PLM-9876", 25, 100, true, 90, 180);
        carros[4] = new Carro("BNV-6543", 18, 80, false, 110, 160);
        System.out.println("Escolha um dos carros disponíveis:");
        int count = 0;
        for (int i = 0; i < carros.length; i++) {
            if (!carros[i].isAlugado()) {
                count++;
                System.out.println(count + ". Placa: " + carros[i].getPlaca());
                System.out.println("   Combustível no tanque: " + carros[i].getCombustivelNoTanque());
                System.out.println("   Quilometragem: " + carros[i].getQuilometragem());
                System.out.println("   Alugado: " + carros[i].isAlugado());
                System.out.println("   Preço da diária: " + carros[i].getPrecoDiaria());
                System.out.println("   Potência do motor: " + carros[i].getPotenciaDoMotor());
            }
        }

        int escolha = 0;
        boolean escolhaValida = false;
        while (!escolhaValida) {
            System.out.print("Digite o número do carro escolhido (1-" + count + "): ");
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

        int carroIndex = 0;
        int carroEscolhidoIndex = -1;
        while (carroEscolhidoIndex < escolha) {
            if (!carros[carroIndex].isAlugado()) {
                carroEscolhidoIndex++;
            }
            if (carroEscolhidoIndex == escolha - 1) {
                Carro carroEscolhido = carros[carroIndex];
                System.out.println("Carro escolhido: " + carroEscolhido.getPlaca());
                DiariaCarro diariaCarro = new DiariaCarro();
                double valorAluguel = diariaCarro.calcularValorAluguel(carroEscolhido);
                System.out.println("Valor do aluguel: R$" + valorAluguel);

                System.out.print("Informe a distância em quilômetros que você pretende percorrer: ");
                int distanciaViagem = scanner.nextInt();

                boolean viagemRealizada = carroEscolhido.viajar(distanciaViagem);
                if (viagemRealizada) {
                    System.out.println("Viagem realizada com sucesso!");
                    System.out.println("Combustível restante: " + carroEscolhido.getCombustivelNoTanque() + " litros");
                } else {
                    System.out.println("Não foi possível realizar a viagem. Verifique o combustível disponível.");

                    System.out.print("Deseja abastecer o veículo? (S/N): ");
                    String resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("S")) {
                        System.out.print("Informe a quantidade de litros para abastecer: ");
                        int litrosAbastecidos = scanner.nextInt();
                        carroEscolhido.abastecer(litrosAbastecidos);

                        System.out.println("Veículo abastecido com sucesso!");
                        System.out.println("Combustível atual: " + carroEscolhido.getCombustivelNoTanque() + " litros");
                        System.out.println("Safe travel!");
                    }else{
                        System.out.println("você não consegue realizar a viagem teste");
                    }
                }
                break;
            }
            carroIndex++;
        }

    }
}

