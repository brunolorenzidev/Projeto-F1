package model;

public class Piloto extends Pessoa {


    private int numero;


    public Piloto(String nome, int idade, int numero) {
        super(nome, idade);
        this.numero = numero;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " Idade:  " + getIdade() + " numero " + getNumero());

    }
}
