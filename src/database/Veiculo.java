package database;

import java.util.ArrayList;

public class Veiculo {
    ArrayList<Object> veiculos = new ArrayList<>();

    private String modelo;
    private int ano;
    private float valorDiario;
    private float valorTotal;

    //CONSTRUCTORS

    public Veiculo(){
        super();
    }

    public Veiculo(String modelo, int ano, float valorDiario, float valorTotal) {
    this.modelo = modelo;
    this.ano = ano;
    this.valorDiario = valorDiario;
    this.valorTotal = valorTotal;
    }

    // GETTERS E SETTERS

    public String getModelo() {return modelo;}

    public int getAno() {return ano;}

    public float getValorDiario() {return valorDiario;}

    public float getValorTotal() {return valorTotal;}

    public ArrayList<Object> getVeiculos() {return veiculos;}

    //METHOD

    public void inserir(){
        
    }


}
