package controller;

import model.Equipe;
import util.ArquivoSalvos;
import java.util.ArrayList;
import java.util.List;

public class EquipeController {

    private static ArrayList<Equipe> listaEquipe = new ArrayList<>();

    public static void cadastrarEquipe(Equipe equipe) {
        listaEquipe.add(equipe);
        ArquivoSalvos.salvarEquipes(listaEquipe);
    }

    public static ArrayList<Equipe> listarEquipe() {
        return listaEquipe;
    }

    public static void removerEquipe(String nomeEquipe) {
        for (int i = 0; i < listaEquipe.size(); i++) {
            if (listaEquipe.get(i).getNomeEquipe().equalsIgnoreCase(nomeEquipe)) {
                listaEquipe.remove(i);
                System.out.println("Equipe removida com sucesso!!");
                ArquivoSalvos.salvarEquipes(listaEquipe);
                return;
            }
        }
        System.out.println("Equipe não encontrada.");
    }

    public static void atualizarEquipe(String nomeEquipeAntigo, String novoNome, String novosPatrocinadores) {
        for (Equipe equipe : listaEquipe) {
            if (equipe.getNomeEquipe().equalsIgnoreCase(nomeEquipeAntigo)) {
                equipe.setNomeEquipe(novoNome);
                equipe.setPatrocinadoresEquipe(novosPatrocinadores);
                System.out.println("Equipe atualizada com sucesso!");
                ArquivoSalvos.salvarEquipes(listaEquipe);
                return;
            }
        }
        System.out.println("Equipe não encontrada.");
    }
    public List<Equipe> listarEquipes() {
        return listarEquipe();
    }

    public static void carregarEquipes() {
        listaEquipe = ArquivoSalvos.carregarEquipes();
    }
}

