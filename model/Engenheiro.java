package model;

public class Engenheiro extends Pessoa implements Trabalhador {

    private String funcao;
    private int anosDeServico;

    public Engenheiro(String nome, int idade, String funcao, int anosDeServico) {
        super(nome, idade);
        this.funcao = funcao;
        this.anosDeServico = anosDeServico;
    }

    public Engenheiro(String nome, int idade, String funcao) {
        super(nome, idade);
        this.funcao = funcao;
        this.anosDeServico = 0;
    }

    public String getFuncao() {
        return funcao;
    }

    public int getAnosDeServico() {
        return anosDeServico;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está trabalhando como " + funcao + " com " + anosDeServico + " anos de serviço.");
    }

}