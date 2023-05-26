package fag.veiculo;

import java.util.Scanner;

public class Moto extends Veiculo {
  private int cilindradas;

  public Moto(String placa, int combustivelNoTanque, int quilometragem, boolean alugado, int precoDiaria, int cilindradas){
    super(placa, combustivelNoTanque, quilometragem, alugado, precoDiaria);
    this.cilindradas = cilindradas;
  }


  @Override

  public boolean viajar(int distancia) {
    double consumo = distancia / 30.0;

    if (getCombustivelNoTanque() >= consumo) {
      setCombustivelNoTanque((int) (getCombustivelNoTanque() - consumo));
      setQuilometragem(getQuilometragem() + distancia);
      return true;
    } else {
      return false;
    }
  }
  public void setCilindradas(int cilindradas) {
    this.cilindradas = cilindradas;
  }
  public int getCilindradas() {
    return cilindradas;
  }
}
