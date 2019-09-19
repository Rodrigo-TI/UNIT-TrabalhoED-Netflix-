package main;

import classes.pessoas.Profissional;
import classes.titulo.Titulo;
import java.util.Scanner;

public class Main {

    // MENUS
    static void menu() {
        System.out.println("1 - Cadastrar título");
        System.out.println("2 - Buscar título");
        System.out.println("3 - Avaliar título");
        System.out.println("4 - Remover título");
        System.out.println("5 - Cadastrar categoria");
        System.out.println("6 - Buscar categoria");
        System.out.println("7 - Remover categoria");
        System.out.println("8 - Cadastrar sub-categoria");
        System.out.println("9 - Buscar sub-categoria");
        System.out.println("10 - Remover sub-categoria");
        System.out.println("11 - Cadastrar diretor(a)");
        System.out.println("12 - Buscar diretor(a)");
        System.out.println("13 - Remover diretor(a)");
        System.out.println("14 - Cadastrar ator/atriz");
        System.out.println("15 - Buscar ator/atriz");
        System.out.println("16 - Remover ator/atriz");
        System.out.println("0 - Finalizar programa");
        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {
        // PREPARAÇÃO
        Scanner s = new Scanner(System.in);
        Netflix n = new Netflix();

        while (true) {
            try {
                menu();
                System.out.print("Digite sua escolha : ");
                int respMenu = Integer.parseInt(s.nextLine());
                while ((respMenu < 0) || (respMenu > 16)) {
                    System.out.println("\nOpção inválida !\n");
                    menu();
                    System.out.print("Digite sua escolha : ");
                    respMenu = Integer.parseInt(s.nextLine());
                }
                switch (respMenu) {
                    case 0:
                        break;
                    case 1:
                        System.out.print("\nNome : ");
                        String nomeTitulo = s.nextLine();
                        System.out.print("Descrição : ");
                        String descricao = s.nextLine();
                        System.out.print("Classificação indicativa : ");
                        int classfInd = Integer.parseInt(s.nextLine());
                        System.out.print("Ano de lançamento : ");
                        int anoLanc = Integer.parseInt(s.nextLine());
                        System.out.print("Duração em minutos : ");
                        int duracao = Integer.parseInt(s.nextLine());
                        System.out.print("Avaliação : ");
                        int avaliacao = Integer.parseInt(s.nextLine());
                        Titulo t = new Titulo(nomeTitulo, descricao, classfInd, anoLanc, duracao, avaliacao);
                        n.getListaTitulos().add(t);
                        break;
                    case 2:
                        System.out.print("\nNome do título que deseja buscar : ");
                        String nomeTituloBusca = s.nextLine();
                        for (int i = 0; i < n.getListaTitulos().size(); i++) {
                            if (n.getListaTitulos().get(i).getNome().equals(nomeTituloBusca)) {
                                System.out.println("\nNome : " + n.getListaTitulos().get(i).getNome());
                                System.out.println("Descrição :\n" + n.getListaTitulos().get(i).getDescricao());
                                System.out.println("Classificação indicativa : " + n.getListaTitulos().get(i).getClassificacaoIndicativa());
                                System.out.println("Ano de lançamento : " + n.getListaTitulos().get(i).getAnoLancamento());
                                System.out.println("Duração em minutos : " + n.getListaTitulos().get(i).getDuracao());
                                System.out.println("Avaliação : " + n.getListaTitulos().get(i).getAvaliacao());
                                System.out.print("Categorias : ");
                                if (n.getListaTitulos().get(i).getCategorias().size() > 0) {
                                    for (int j = 0; j < n.getListaTitulos().get(i).getCategorias().size(); j++) {
                                        if (j == n.getListaTitulos().get(i).getCategorias().size() - 1) {
                                            System.out.print(n.getListaTitulos().get(i).getCategorias().get(j));
                                        } else {
                                            System.out.print(n.getListaTitulos().get(i).getCategorias().get(j) + ", ");
                                        }
                                    }
                                } else {
                                    System.out.println("- Nenhuma categoria cadastrada -");
                                }
                                System.out.print("Sub-categorias : ");
                                if (n.getListaTitulos().get(i).getSubCategorias().size() > 0) {
                                    for (int j = 0; j < n.getListaTitulos().get(i).getSubCategorias().size(); j++) {
                                        if (j == n.getListaTitulos().get(i).getSubCategorias().size() - 1) {
                                            System.out.print(n.getListaTitulos().get(i).getSubCategorias().get(j));
                                        } else {
                                            System.out.print(n.getListaTitulos().get(i).getSubCategorias().get(j) + ", ");
                                        }
                                    }
                                } else {
                                    System.out.println("- Nenhuma sub-categoria cadastrada -");
                                }
                                System.out.print("Lista de diretores : ");
                                if (n.getListaTitulos().get(i).getListaDiretores().size() > 0) {
                                    for (int j = 0; j < n.getListaTitulos().get(i).getListaDiretores().size(); j++) {
                                        if (j == n.getListaTitulos().get(i).getListaDiretores().size() - 1) {
                                            System.out.print(n.getListaTitulos().get(i).getListaDiretores().get(j));
                                        } else {
                                            System.out.print(n.getListaTitulos().get(i).getListaDiretores().get(j) + ", ");
                                        }
                                    }
                                } else {
                                    System.out.println("- Nenhum diretor/diretora cadastrado -");
                                }
                                System.out.print("Lista de atores : ");
                                if (n.getListaTitulos().get(i).getListaAtores().size() > 0) {
                                    for (int j = 0; j < n.getListaTitulos().get(i).getListaAtores().size(); j++) {
                                        if (j == n.getListaTitulos().get(i).getListaAtores().size() - 1) {
                                            System.out.print(n.getListaTitulos().get(i).getListaAtores().get(j));
                                        } else {
                                            System.out.print(n.getListaTitulos().get(i).getListaAtores().get(j) + ", ");
                                        }
                                    }
                                } else {
                                    System.out.println("- Nenhum ator/atriz cadastrado -");
                                }
                                break;
                            }
                        }
                        break;
                    case 3:
                        System.out.print("\nNome do título que deseja avaliar : ");
                        String nomeTituloAvaliar = s.nextLine();
                        for (int i = 0; i < n.getListaTitulos().size(); i++) {
                            if (n.getListaTitulos().get(i).getNome().equals(nomeTituloAvaliar)) {
                                System.out.print("Nota de avaliação : ");
                                int notaAvaliacao = Integer.parseInt(s.nextLine());
                                if (n.getListaTitulos().get(i).getAvaliacao() > 0) {
                                    n.getListaTitulos().get(i).setAvaliacao((n.getListaTitulos().get(i).getAvaliacao() + notaAvaliacao) / 2);
                                } else if (n.getListaTitulos().get(i).getAvaliacao() == 0) {
                                    n.getListaTitulos().get(i).setAvaliacao(notaAvaliacao);
                                }
                            }
                            break;
                        }
                        break;
                    case 4:
                        System.out.print("\nNome do título que deseja remover : ");
                        String nomeTituloRemover = s.nextLine();
                        for (int i = 0; i < n.getListaTitulos().size(); i++) {
                            if (n.getListaTitulos().get(i).getNome().equals(nomeTituloRemover)) {
                                n.getListaTitulos().remove(n.getListaTitulos().get(i));

                            }
                        }
                        break;
                    case 9:
                        if (n.getListaSubCategorias().isEmpty()) {
                            System.out.println("Nenhuma SubCategoria cadastrada até o momento!");
                        } else {
                            System.out.println("Digite o nome da SubCategoria: ");
                            String subCat = s.nextLine();
                            for (int i = 0; i < n.getListaSubCategorias().size(); i++) {
                                if (n.getListaSubCategorias().get(i).getNome().equals(subCat)) {
                                    for (int j = 0; j < n.getListaSubCategorias().get(i).getListaTitulos().size(); j++) {
                                        System.out.println(n.getListaSubCategorias().get(i).getListaTitulos().get(j).getNome());
                                    }
                                }
                            }
                        }
                        break;
                    case 10:
                        if (n.getListaSubCategorias().isEmpty()) {
                            System.out.println("Nenhuma SubCategoria cadastrada até o momento!");
                        } else {
                            System.out.println("Digite a SubCategoria a ser removida: ");
                            String subCat = s.nextLine();
                            for (int i = 0; i < n.getListaSubCategorias().size(); i++) {
                                if (n.getListaSubCategorias().get(i).getNome().equals(subCat)) {
                                    n.getListaSubCategorias().remove(n.getListaSubCategorias().get(i));
                                }
                            }
                            for (int i = 0; i < n.getListaTitulos().size(); i++) {
                                for (int j = 0; j < n.getListaTitulos().get(i).getSubCategorias().size(); j++) {
                                    if (n.getListaTitulos().get(i).getSubCategorias().get(j).getNome().equals(subCat)) {
                                        n.getListaTitulos().get(i).getSubCategorias().remove(n.getListaTitulos().get(i).getSubCategorias().get(j));
                                    }
                                }
                            }
                        }
                        break;
                    case 11:
                        if (n.getListaTitulos().isEmpty()) {
                            System.out.println("Nenhum título cadastrado! Impossível realizar o cadastro de diretor!");
                        } else {
                            System.out.println("Informe o nome do(a) Diretor(a): ");
                            String nomeDiretor = s.nextLine();
                            System.out.println("Informe a idade do(a) Diretor(a): ");
                            int idadeDiretor = Integer.parseInt(s.nextLine());
                            System.out.println("Informe o sexo do(a) Diretor(a): ");
                            String sexoDiretor = s.nextLine();
                            System.out.println("Informe a nacionalidade do(a) Diretor(a): ");
                            String nacionalidadeDiretor = s.nextLine();
                            System.out.println("Informe os anos de carreira do(a) Diretor(a): ");
                            int carreiraDiretor = Integer.parseInt(s.nextLine());
                            System.out.println("Digite a biografia do(a) Diretor(a): ");
                            String biografiaDiretor = s.nextLine();
                            Profissional diretor = new Profissional("Diretor(a)", carreiraDiretor, biografiaDiretor,
                                    nomeDiretor, idadeDiretor, sexoDiretor, nacionalidadeDiretor);
                            System.out.println("O(a) Diretor(a) tem prêmios? (Responda com sim ou nao) ");
                            String resp = s.nextLine();
                            if (resp.equals("sim")) {
                                System.out.println("Quantos prêmios ele(a) possui?");
                                int numPremios = Integer.parseInt(s.nextLine());
                                for (int i = 0; i < numPremios; i++) {
                                    System.out.println("Digite o nome do prêmio: ");
                                    String premio = s.nextLine();
                                    diretor.getPremios().add(premio);
                                }
                            }
                            System.out.println("Informe a quantidade de titulos que o diretor participou: ");
                            int quant = Integer.parseInt(s.nextLine());
                            for (int i = 0; i < quant; i++) {
                                System.out.println("Opções: ");
                                for (int j = 0; j < n.getListaTitulos().size(); j++) {
                                    System.out.println(j + "- " + n.getListaTitulos().get(j));
                                }
                                System.out.println("Digite o número do filme: ");
                                int numFilme = Integer.parseInt(s.nextLine());
                                diretor.getTitulosQueParticipou().add(n.getListaTitulos().get(numFilme));
                            }

                        }
                    case 12:
                        boolean existe = false;
                        for (int i = 0; i < n.getListaTitulos().size(); i++) {
                            if (!n.getListaTitulos().get(i).getListaDiretores().isEmpty()) {
                                existe = true;
                                break;
                            }
                        }
                        if (existe = false) {
                            System.out.println("Nenhum(a) diretor(a) cadastrado(a) no momento!");
                        } else {
                            System.out.println("Digite o nome do diretor: ");
                            String nomeDiretor = s.nextLine();
                            for (int i = 0; i < n.getListaTitulos().size(); i++) {
                                for (int j = 0; j < n.getListaTitulos().get(i).getListaDiretores().size(); j++) {
                                    if (n.getListaTitulos().get(i).getListaDiretores().get(j).getNome().equals(nomeDiretor)) {
                                        System.out.println("Nome: " + n.getListaTitulos().get(i).getListaDiretores().get(j).getNome());
                                        System.out.println("Biografia: " + n.getListaTitulos().get(i).getListaDiretores().get(j).getBiografia());
                                        System.out.println("Anos de carreira: " + n.getListaTitulos().get(i).getListaDiretores().get(j).getAnosCarreira());
                                        System.out.println("Títulos que participou: ");
                                        for (int k = 0; k < n.getListaTitulos().get(i).getListaDiretores().get(j).getTitulosQueParticipou().size(); k++) {
                                            System.out.println(n.getListaTitulos().get(i).getListaDiretores().get(j).getTitulosQueParticipou().get(k).getNome());
                                        }
                                        System.out.println("Prêmios: ");
                                        for(int k = 0; k < n.getListaTitulos().get(i).getListaDiretores().get(j).getPremios().size(); k++){
                                            System.out.println(n.getListaTitulos().get(i).getListaDiretores().get(j).getPremios().get(k));
                                        }
                                        
                                        break;
                                    }
                                }
                            }
                        }
                    case 13:
                        boolean test = false;
                        for (int i = 0; i < n.getListaTitulos().size(); i++) {
                            if (!n.getListaTitulos().get(i).getListaDiretores().isEmpty()) {
                                test = true;
                                break;
                            }
                        }
                        if (test = false) {
                            System.out.println("Nenhum(a) diretor(a) cadastrado(a) no momento!");
                        }else{
                            System.out.println("Digite o nome do diretor: ");
                            String nomeDiretor = s.nextLine();
                            for (int i = 0; i < n.getListaTitulos().size(); i++) {
                                for (int j = 0; j < n.getListaTitulos().get(i).getListaDiretores().size(); j++) {
                                    if(n.getListaTitulos().get(i).getListaDiretores().get(j).getNome().equals(nomeDiretor)){
                                        n.getListaTitulos().get(i).getListaDiretores().remove(n.getListaTitulos().get(i).getListaDiretores().get(j));
                                    }
                                }
                            }
                        }
                    case 14:
                        if (n.getListaTitulos().isEmpty()) {
                            System.out.println("Nenhum título cadastrado! Impossível realizar o cadastro de ator!");
                        } else {
                            System.out.println("Informe o nome do(a) ator/atriz: ");
                            String nomeAtor = s.nextLine();
                            System.out.println("Informe a idade do(a) ator/atriz: ");
                            int idadeAtor = Integer.parseInt(s.nextLine());
                            System.out.println("Informe o sexo do(a) ator/atriz: ");
                            String sexoAtor = s.nextLine();
                            System.out.println("Informe a nacionalidade do(a) ator/atriz: ");
                            String nacionalidadeAtor = s.nextLine();
                            System.out.println("Informe os anos de carreira do(a) ator/atriz: ");
                            int carreiraAtor = Integer.parseInt(s.nextLine());
                            System.out.println("Digite a biografia do(a) ator/atriz: ");
                            String biografiaAtor = s.nextLine();
                            Profissional ator = new Profissional("ator/atriz", carreiraAtor, biografiaAtor,
                                    nomeAtor, idadeAtor, sexoAtor, nacionalidadeAtor);
                            System.out.println("O(a) ator/atriz tem prêmios? (Responda com sim ou nao) ");
                            String resp = s.nextLine();
                            if (resp.equals("sim")) {
                                System.out.println("Quantos prêmios ele(a) possui?");
                                int numPremios = Integer.parseInt(s.nextLine());
                                for (int i = 0; i < numPremios; i++) {
                                    System.out.println("Digite o nome do prêmio: ");
                                    String premio = s.nextLine();
                                    ator.getPremios().add(premio);
                                }
                            }
                            System.out.println("Informe a quantidade de titulos que o(a) ator/atriz participou: ");
                            int quant = Integer.parseInt(s.nextLine());
                            for (int i = 0; i < quant; i++) {
                                System.out.println("Opções: ");
                                for (int j = 0; j < n.getListaTitulos().size(); j++) {
                                    System.out.println(j + "- " + n.getListaTitulos().get(j));
                                }
                                System.out.println("Digite o número do filme: ");
                                int numFilme = Integer.parseInt(s.nextLine());
                                ator.getTitulosQueParticipou().add(n.getListaTitulos().get(numFilme));
                            }

                        }
                    case 15:
                        existe = false;
                        for (int i = 0; i < n.getListaTitulos().size(); i++) {
                            if (!n.getListaTitulos().get(i).getListaAtores().isEmpty()) {
                                existe = true;
                                break;
                            }
                        }
                        if (existe = false) {
                            System.out.println("Nenhum(a) ator/atriz cadastrado(a) no momento!");
                        } else {
                            System.out.println("Digite o nome do ator/atriz: ");
                            String nomeAtor = s.nextLine();
                            for (int i = 0; i < n.getListaTitulos().size(); i++) {
                                for (int j = 0; j < n.getListaTitulos().get(i).getListaAtores().size(); j++) {
                                    if (n.getListaTitulos().get(i).getListaAtores().get(j).getNome().equals(nomeAtor)) {
                                        System.out.println("Nome: " + n.getListaTitulos().get(i).getListaAtores().get(j).getNome());
                                        System.out.println("Biografia: " + n.getListaTitulos().get(i).getListaAtores().get(j).getBiografia());
                                        System.out.println("Anos de carreira: " + n.getListaTitulos().get(i).getListaAtores().get(j).getAnosCarreira());
                                        System.out.println("Títulos que participou: ");
                                        for (int k = 0; k < n.getListaTitulos().get(i).getListaAtores().get(j).getTitulosQueParticipou().size(); k++) {
                                            System.out.println(n.getListaTitulos().get(i).getListaAtores().get(j).getTitulosQueParticipou().get(k).getNome());
                                        }
                                        System.out.println("Prêmios: ");
                                        for(int k = 0; k < n.getListaTitulos().get(i).getListaAtores().get(j).getPremios().size(); k++){
                                            System.out.println(n.getListaTitulos().get(i).getListaAtores().get(j).getPremios().get(k));
                                        }
                                        
                                        break;
                                    }
                                }
                            }
                        }
                    case 16:
                        test = false;
                        for (int i = 0; i < n.getListaTitulos().size(); i++) {
                            if (!n.getListaTitulos().get(i).getListaAtores().isEmpty()) {
                                test = true;
                                break;
                            }
                        }
                        if (test = false) {
                            System.out.println("Nenhum(a) ator/atriz cadastrado(a) no momento!");
                        }else{
                            System.out.println("Digite o nome do(a) ator/atriz: ");
                            String nomeAtor = s.nextLine();
                            for (int i = 0; i < n.getListaTitulos().size(); i++) {
                                for (int j = 0; j < n.getListaTitulos().get(i).getListaAtores().size(); j++) {
                                    if(n.getListaTitulos().get(i).getListaAtores().get(j).getNome().equals(nomeAtor)){
                                        n.getListaTitulos().get(i).getListaAtores().remove(n.getListaTitulos().get(i).getListaAtores().get(j));
                                    }
                                }
                            }
                        }
                    default:
                        break;
                }
                menu();
                System.out.print("\nDigite sua escolha : ");
                respMenu = Integer.parseInt(s.nextLine());
                while ((respMenu < 0) || (respMenu > 16)) {
                    System.out.println("\nOpção inválida !\n");
                    menu();
                    System.out.print("Digite sua escolha : ");
                    respMenu = Integer.parseInt(s.nextLine());
                }
                break;
            } catch (NumberFormatException error) {
                System.out.println("\nComando inválido !\n");
            }
        }
    }
}
