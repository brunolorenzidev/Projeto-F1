package controller;
import model.Piloto;
import java.util.ArrayList;
import util.ArquivoSalvos;

public class PilotoController {

    private static ArrayList<Piloto> listaPilotos = new ArrayList<>();

    public static void cadastrarPiloto(String nome, int idade, int numero) {
        Piloto novoPiloto = new Piloto(nome, idade, numero);
        listaPilotos.add(novoPiloto);
        ArquivoSalvos.salvarPilotos(listaPilotos);
    }

    public static ArrayList<Piloto> listarPilotos() {
        return listaPilotos;
    }

    public static void removerPiloto(String nome) {
        for (int i = 0; i < listaPilotos.size(); i++) {
            if (listaPilotos.get(i).getNome().equalsIgnoreCase(nome)) {
                listaPilotos.remove(i);
                System.out.println("Piloto removido com sucesso!!");
                ArquivoSalvos.salvarPilotos(listaPilotos);
                return;
            }
        }
        System.out.println("Piloto não encontrado.");
    }

    public static void atualizarPiloto(String nomePilotoAntigo, String novoNomePiloto, int idadePilotoNova, int numeroPilotoNovo) {
        for (Piloto piloto : listaPilotos) {
            if (piloto.getNome().equalsIgnoreCase(nomePilotoAntigo)) {
                piloto.setNome(novoNomePiloto);
                piloto.setIdade(idadePilotoNova);
                piloto.setNumero(numeroPilotoNovo);
                System.out.println("Piloto atualizado com sucesso!");
                ArquivoSalvos.salvarPilotos(listaPilotos);
                return;
            }
        }
        System.out.println("Piloto não encontrado.");
    }

    public static void carregarPilotos() {
        listaPilotos = ArquivoSalvos.carregarPilotos();
    }
}

