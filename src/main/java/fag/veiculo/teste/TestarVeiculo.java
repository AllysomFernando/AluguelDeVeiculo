package fag.veiculo.teste;

import fag.veiculo.Carro;
import fag.veiculo.Moto;

public class TestarVeiculo {
    public static void main(String[] args) {
        Moto moto = new Moto("AXZ-4792", 10, 0, false, 100, 900);
        Carro carro = new Carro("KYS-9812", 40, 0, false, 300, 400 );

        boolean resultado = moto.viajar(100);
        System.out.println("A moto conseguiu viajar 100 km? " + resultado);
        System.out.println("Combustível restante na moto: " + moto.getCombustivelNoTanque());

        resultado = carro.viajar(200);
        System.out.println("O carro conseguiu viajar 200 km? " + resultado);
        System.out.println("Combustível restante no carro: " + carro.getCombustivelNoTanque());

        Moto motoComparacao = new Moto("POC-0900", 20,0, true, 80, 150);

        resultado = motoComparacao.equals(moto);
        System.out.println("A moto é igual a moto comparação? " + resultado);

        resultado = moto.equals(carro);
        System.out.println("A moto comparação é igual ao carro? " + resultado);
    }
}
