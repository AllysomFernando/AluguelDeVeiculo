package fag.veiculo;

import java.util.Scanner;

public class Carro extends Veiculo {
    private int potenciaDoMotor;

    public Carro(String placa, int combustivelNoTanque, int quilometragem, boolean alugado, int precoDiaria, int potenciaDoMotor) {
        super(placa, combustivelNoTanque, quilometragem, alugado, precoDiaria);
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public Carro() {
    }


    @Override
    public boolean viajar(int distancia) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a distância em quilômetros que você pretende percorrer: ");
         distancia = scanner.nextInt();

        double consumo = distancia / 10.0;
        if (getCombustivelNoTanque() <= 0) {
            System.out.println("O combustível acabou. Realizando abastecimento...");
            abastecer(30);
        }
        if (getCombustivelNoTanque() >= consumo) {
            setCombustivelNoTanque((int) (getCombustivelNoTanque() - consumo));
            setQuilometragem(getQuilometragem() + distancia);
            return true;
        } else {
            return false;
        }
    }

    public void setPotenciaDoMotor(int potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public int getPotenciaDoMotor() {
        return potenciaDoMotor;
    }
}