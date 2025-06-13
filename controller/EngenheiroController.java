package controller;

import model.Engenheiro;

import java.util.ArrayList;
import util.ArquivoSalvos;

public class EngenheiroController {

    private static ArrayList<Engenheiro> listaEngenheiros = new ArrayList<>();

    public static void cadastrarEngenheiro(String nomeEngenheiroChefe, int idadeEngenheiroChefe, String funcaoEngenheiroChefe, int anosDeServicoEngenheiroChefe) {
        Engenheiro engenheiroChefe = new Engenheiro(nomeEngenheiroChefe, idadeEngenheiroChefe, funcaoEngenheiroChefe, anosDeServicoEngenheiroChefe);
        listaEngenheiros.add(engenheiroChefe);
        ArquivoSalvos.salvarEngenheiros(listaEngenheiros);
    }

    public static ArrayList<Engenheiro> listarEngenheiro() {
        return listaEngenheiros;
    }

    public static void carregarEngenheiros() {
        listaEngenheiros = ArquivoSalvos.carregarEngenheiros();
    }

}