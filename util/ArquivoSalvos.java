package util;

import model.Piloto;
import model.Equipe;
import model.Engenheiro;
import model.Corrida;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArquivoSalvos {

    private static final String ARQUIVO_PILOTOS = "data/pilotos.txt";
    private static final String ARQUIVO_EQUIPES = "data/equipes.txt";
    private static final String ARQUIVO_ENGENHEIROS = "data/engenheiros.txt";
    private static final String ARQUIVO_CORRIDAS = "data/corridas.txt";

    private static void garantirDiretorioData() {
        try {
            Path dataPath = Paths.get("data");
            if (!Files.exists(dataPath)) {
                Files.createDirectory(dataPath);
            }
        } catch (IOException e) {
            System.err.println("Erro ao criar diretório data: " + e.getMessage());
        }
    }

    public static void salvarPilotos(List<Piloto> pilotos) {
        garantirDiretorioData();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO_PILOTOS))) {
            for (Piloto piloto : pilotos) {
                bw.write(piloto.getNome() + "," + piloto.getIdade() + "," + piloto.getNumero());
                bw.newLine();
            }
            System.out.println("Pilotos salvos com sucesso em " + ARQUIVO_PILOTOS);
        } catch (IOException e) {
            System.err.println("Erro ao salvar pilotos: " + e.getMessage());
        }
    }

    public static ArrayList<Piloto> carregarPilotos() {
        ArrayList<Piloto> pilotos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO_PILOTOS))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 3) {
                    String nome = dados[0];
                    int idade = Integer.parseInt(dados[1]);
                    int numero = Integer.parseInt(dados[2]);
                    pilotos.add(new Piloto(nome, idade, numero));
                }
            }
            System.out.println("Pilotos carregados com sucesso de " + ARQUIVO_PILOTOS);
        } catch (IOException e) {
            System.err.println("Arquivo de pilotos não encontrado ou erro de leitura: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro de formato de número ao carregar pilotos: " + e.getMessage());
        }
        return pilotos;
    }


    public static void salvarEquipes(List<Equipe> equipes) {
        garantirDiretorioData();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO_EQUIPES))) {
            for (Equipe equipe : equipes) {
                bw.write(equipe.getNomeEquipe() + "," + equipe.getPatrocinadoresEquipe());
                bw.newLine();
            }
            System.out.println("Equipes salvas com sucesso em " + ARQUIVO_EQUIPES);
        } catch (IOException e) {
            System.err.println("Erro ao salvar equipes: " + e.getMessage());
        }
    }

    public static ArrayList<Equipe> carregarEquipes() {
        ArrayList<Equipe> equipes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO_EQUIPES))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 2) {
                    String nome = dados[0];
                    String patrocinadores = dados[1];
                    equipes.add(new Equipe(nome, patrocinadores));
                }
            }
            System.out.println("Equipes carregadas com sucesso de " + ARQUIVO_EQUIPES);
        } catch (IOException e) {
            System.err.println("Arquivo de equipes não encontrado ou erro de leitura: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro de formato de número ao carregar equipes: " + e.getMessage());
        }
        return equipes;
    }
    public static void salvarEngenheiros(List<Engenheiro> engenheiros) {
        garantirDiretorioData();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO_ENGENHEIROS))) {
            for (Engenheiro engenheiro : engenheiros) {
                bw.write(engenheiro.getNome() + "," + engenheiro.getIdade() + "," + engenheiro.getFuncao() + "," + engenheiro.getAnosDeServico());
                bw.newLine();
            }
            System.out.println("Engenheiros salvos com sucesso em " + ARQUIVO_ENGENHEIROS);
        } catch (IOException e) {
            System.err.println("Erro ao salvar engenheiros: " + e.getMessage());
        }
    }

    public static ArrayList<Engenheiro> carregarEngenheiros() {
        ArrayList<Engenheiro> engenheiros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO_ENGENHEIROS))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 4) {
                    String nome = dados[0];
                    int idade = Integer.parseInt(dados[1]);
                    String funcao = dados[2];
                    int anosDeServico = Integer.parseInt(dados[3]);
                    engenheiros.add(new Engenheiro(nome, idade, funcao, anosDeServico));
                }
            }
            System.out.println("Engenheiros carregados com sucesso de " + ARQUIVO_ENGENHEIROS);
        } catch (IOException e) {
            System.err.println("Arquivo de engenheiros não encontrado ou erro de leitura: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro de formato de número ao carregar engenheiros: " + e.getMessage());
        }
        return engenheiros;
    }

    public static void salvarCorridas(List<Corrida> corridas) {
        garantirDiretorioData();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO_CORRIDAS))) {
            for (Corrida corrida : corridas) {
                bw.write(corrida.getNomeCorrida() + "," + corrida.getDataCorrida() + "," + corrida.getLocalCorrida());
                bw.newLine();
            }
            System.out.println("Corridas salvas com sucesso em " + ARQUIVO_CORRIDAS);
        } catch (IOException e) {
            System.err.println("Erro ao salvar corridas: " + e.getMessage());
        }
    }

    public static ArrayList<Corrida> carregarCorridas() {
        ArrayList<Corrida> corridas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO_CORRIDAS))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 3) {
                    String nome = dados[0];
                    String data = dados[1];
                    String local = dados[2];
                    corridas.add(new Corrida(nome, data, local));
                }
            }
            System.out.println("Corridas carregadas com sucesso de " + ARQUIVO_CORRIDAS);
        } catch (IOException e) {
            System.err.println("Arquivo de corridas não encontrado ou erro de leitura: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro de formato de número ao carregar corridas: " + e.getMessage());
        }
        return corridas;
    }
}
