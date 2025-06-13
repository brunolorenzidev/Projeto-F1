package view;

import model.Equipe;

import java.util.ArrayList;

public class MenuDisplay {

    public static void exibirMenu() {

        System.out.println("---------------------------------------------");
        System.out.println("                 MENU PRINCIPAL             ");
        System.out.println("---------------------------------------------");

        System.out.println("  1:  Gerenciar pilotos");
        System.out.println("  2:  Gerenciar equipes");
        System.out.println("  3:  Cadastrar corrida");
        System.out.println("  4:  Ranking F1 ");
        System.out.println("  0:  Sair");

        System.out.println("---------------------------------------------");
    }

    public static void exibirPiloto() {
        System.out.println("---------------------------------------------");
        System.out.println("               MENU DE PILOTOS            ");
        System.out.println("---------------------------------------------");

        System.out.println(" 1:  Cadastrar Piloto");
        System.out.println(" 2:  Listar Pilotos");
        System.out.println(" 3:  Remover Piloto");
        System.out.println(" 4:  Editar Piloto");
        System.out.println(" 0:  Sair");

        System.out.println("---------------------------------------------");
    }

    public static void exibirMenuCorrida() {
        System.out.println("---------------------------------------------");
        System.out.println("               MENU DE CORRIDA            ");
        System.out.println("---------------------------------------------");

        System.out.println("1. Cadastrar Corrida ");
        System.out.println("2. Listar Corridas ");
        System.out.println("3. Remover Corrida");
        System.out.println("4. Editar Corrida ");
        System.out.println("0. Sair ");

        System.out.println("---------------------------------------------");

    }

    public static void exibirEquipe() {
        System.out.println("-----MENU EQUIPES------");
        System.out.println("1. Cadastrar Engenheiro");
        System.out.println("2. Listar Engenheiro");
        System.out.println("3. Cadastrar Equipe");
        System.out.println("4. Listar Equipe");
        System.out.println("5. Atualizar Equipe");
        System.out.println("6. Remover Equipe ");
        System.out.println("0. Voltar ");
    }

    public static void menuRemoverEquipe() {
        System.out.println("-----------------------------------------------");
        System.out.println("              REMOVER  EQUIPE                  ");
        System.out.println("-----------------------------------------------");
    }

    public static void menuAtualizarEquipe() {
        System.out.println("-----------------------------------------------");
        System.out.println("              ATUALIZAR  EQUIPE                ");
        System.out.println("-----------------------------------------------");
    }


    public static void menuCadastroPiloto() {
        System.out.println("-----------------------------------------------");
        System.out.println("             CADASTRAR PILOTO               ");
        System.out.println("-----------------------------------------------");
    }

    public static void menuListaPiloto() {
        System.out.println("-----------------------------------------------");
        System.out.println("             LISTA DE PILOTOS               ");
        System.out.println("-----------------------------------------------");
    }

    public static void menuRemoverPiloto() {
        System.out.println("-----------------------------------------------");
        System.out.println("              REMOVER  PILOTO               ");
        System.out.println("-----------------------------------------------");
    }

    public static void menuAtualizarPiloto() {
        System.out.println("-----------------------------------------------");
        System.out.println("              ATUALIZAR  PILOTO               ");
        System.out.println("-----------------------------------------------");
    }

    public static void menuCadastrarPista() {
        System.out.println("-----------------------------------------------");
        System.out.println("              CADASTRAR  PISTA               ");
        System.out.println("-----------------------------------------------");
    }

    public static void menuListarCorrida() {
        System.out.println("-----------------------------------------------");
        System.out.println("              LISTAR  PISTA               ");
        System.out.println("-----------------------------------------------");
    }

    public static void menuRemoverPista() {
        System.out.println("-----------------------------------------------");
        System.out.println("              REMOVER  PISTA               ");
        System.out.println("-----------------------------------------------");
    }

    public static void menuAtualizarCorrida() {
        System.out.println("-----------------------------------------------");
        System.out.println("              ATUALIZAR  CORRIDA               ");
        System.out.println("-----------------------------------------------");
    }

    public static void exibirRelatorios(ArrayList<Equipe> equipes) {
        System.out.println("\n--- RELATÓRIOS ---");
        System.out.println("1 - Ranking de Piloto");
        System.out.println("0 - Voltar");
    }
}







