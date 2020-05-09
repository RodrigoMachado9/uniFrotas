package com.example.unifrotas.pojo;

public class Carro {
    private int idCarro;
    private String fabricante;
    private String modelo;
    private String placa;
    private String cor;
    private boolean alugado;

    public Carro(int idCarro, String fabricante, String modelo, String placa, String cor, boolean alugado) {
        this.idCarro = idCarro;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.alugado = alugado;
    }

    public Carro(){}

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
}
