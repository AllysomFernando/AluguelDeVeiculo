package fag.veiculo;

public abstract class Veiculo {
    private String placa;
    private int combustivelNoTanque;
    private int quilometragem;
    private boolean alugado;
    private int precoDiaria;

    public Veiculo(String placa, int combustivelNoTanque, int quilometragem, boolean alugado, int precoDiaria) {
        this.placa = placa;
        this.combustivelNoTanque = combustivelNoTanque;
        this.quilometragem = quilometragem;
        this.alugado = alugado;
        this.precoDiaria = precoDiaria;
    }

    public Veiculo() {

    }


    public void abastecer(int litros) {
        setCombustivelNoTanque(getCombustivelNoTanque() + litros);
    }

    public boolean equals(Veiculo veiculo) {
        return getPlaca().equals(veiculo.getPlaca());
    }

    public abstract boolean viajar(int distancia);

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCombustivelNoTanque() {
        return combustivelNoTanque;
    }

    public void setCombustivelNoTanque(int combustivelNoTanque) {
        this.combustivelNoTanque = combustivelNoTanque;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public int getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(int precoDiaria) {
        this.precoDiaria = precoDiaria;
    }


}