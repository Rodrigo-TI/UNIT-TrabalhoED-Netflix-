package main;
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

        while(true) {
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
                        Titulo t = new Titulo(nomeTitulo,descricao,classfInd,anoLanc,duracao);
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
                                        if (j == n.getListaTitulos().get(i).getCategorias().size()-1) {
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
                                        if (j == n.getListaTitulos().get(i).getSubCategorias().size()-1) {
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
                                        if (j == n.getListaTitulos().get(i).getListaDiretores().size()-1) {
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
                                        if (j == n.getListaTitulos().get(i).getListaAtores().size()-1) {
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
                                    n.getListaTitulos().get(i).setAvaliacao((n.getListaTitulos().get(i).getAvaliacao() + notaAvaliacao)/2);
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
                        int i;
                        for (i = 0; i < n.getListaTitulos().size(); i++) {
                            if (n.getListaTitulos().get(i).getNome().equals(nomeTituloRemover)) {
                                n.getListaTitulos().remove(n.getListaTitulos().get(i));
                                
                            }
                        }
                        break;
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