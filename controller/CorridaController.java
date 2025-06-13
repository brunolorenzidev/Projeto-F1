package controller;

import model.Corrida;

import java.util.ArrayList;
import util.ArquivoSalvos;
import util.Logger;

public class CorridaController {

    private static ArrayList<Corrida> corridas = new ArrayList<>();

    public static void cadastrarCorrida(String nomeCorrida, String dataCorrida, String localCorrida) {
        Corrida novaCorrida = new Corrida(nomeCorrida, dataCorrida, localCorrida);
        corridas.add(novaCorrida);
        ArquivoSalvos.salvarCorridas(corridas);
    }

    public static ArrayList<Corrida> listarCorridas() {
        return corridas;
    }

    public static void removerCorrida(String nomeCorrida) {
        for (int i = 0; i < corridas.size(); i++) {
            if (corridas.get(i).getNomeCorrida().equalsIgnoreCase(nomeCorrida)) {
                corridas.remove(i);
                System.out.println("Corrida removida com sucesso!!");
                ArquivoSalvos.salvarCorridas(corridas);
                return;
            }
        }
        System.out.println("Corrida não encontrada.");
        Logger.logError("Tentativa de remover corrida não encontrada: " + nomeCorrida);
    }

    public static void atualizarCorrida(String nomeCorridaAntiga, String nomeCorridaNova, String novaDataCorrida,
                                        String novoLocalCorrida) {
        for (Corrida corrida : corridas) {
            if (corrida.getNomeCorrida().equalsIgnoreCase(nomeCorridaAntiga)) {
                corrida.setNomePista(nomeCorridaNova);
                corrida.setDataCorrida(novaDataCorrida);
                corrida.setLocalCorrida(novoLocalCorrida);
                System.out.println("Corrida atualizada com sucesso!");
                ArquivoSalvos.salvarCorridas(corridas);
                return;
            }
        }
        System.out.println("Corrida não encontrada.");
        Logger.logError("Tentativa de atualizar corrida não encontrada: " + nomeCorridaAntiga);
    }

    public static void carregarCorridas() {
        corridas = ArquivoSalvos.carregarCorridas();
    }
}