package fag.veiculo;
import fag.veiculo.Carro;
import java.util.Scanner;
public class DiariaCarro {
    public double calcularValorAluguel(Carro carro) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos dias você deseja ficar com o carro? ");
        int quantidadeDias = scanner.nextInt();

        double valorTotal = carro.getPrecoDiaria() * quantidadeDias;
        return valorTotal;
    }
}
