package fag.veiculo;
import fag.veiculo.Moto;
import java.util.Scanner;
public class DiariaMoto {
        public double calcularValorAluguel(Moto moto) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Quantos dias você deseja ficar com a moto? ");
            int quantidadeDias = scanner.nextInt();

            double valorTotal = moto.getPrecoDiaria() * quantidadeDias;
            return valorTotal;
        }
    }

