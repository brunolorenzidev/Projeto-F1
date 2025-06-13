package view;

import controller.EngenheiroController;
import model.Engenheiro;
import util.InputHelper;

import java.util.ArrayList;

public class EngenheiroView {


    public static void cadastrarEngenheiro() {
        String nomeEngenheiroChefe = InputHelper.lerString("Qual o nome do engenheiro:");
        int idadeEngenheiroChefe = InputHelper.lerInt("Qual a idade do engenheiro:");
        String funcaoEngenheiroChefe = InputHelper.lerString("Qual a funcao do engenheiro:");
        int anosDeServicoEngenheiroChefe = InputHelper.lerInt("Quantos anos de experiencia tem o engenheiro:");
        EngenheiroController.cadastrarEngenheiro(nomeEngenheiroChefe, idadeEngenheiroChefe, funcaoEngenheiroChefe, anosDeServicoEngenheiroChefe);
    }

    public static void listarEngenheiro() {
        System.out.println("----Lista de Engenheiros-----");

        ArrayList<Engenheiro> listarEngenheiros = EngenheiroController.listarEngenheiro();

        if (listarEngenheiros.isEmpty()) {
            System.out.println("Nenhum engenheiro cadastrada: ");


        } else {
            for (Engenheiro e : listarEngenheiros) {
                System.out.println("Nome do engenheiro: " + e.getNome());
                System.out.println("Idade do engenheiro: " + e.getIdade());
                System.out.println("Função: " + e.getFuncao());
                System.out.println("Anos de experiencia: " + e.getAnosDeServico());

            }
        }
    }
}
