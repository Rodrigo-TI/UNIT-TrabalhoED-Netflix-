package main;
import classes.titulo.Categoria;
import classes.titulo.Titulo;
import java.util.Scanner;
public class Main {
    // MENUS
    static void menu() {
        System.out.println("1 - Cadastrar título");
        System.out.println("2 - Buscar título");
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
                        System.out.print("Avaliação : ");
                        int avaliacao = Integer.parseInt(s.nextLine());
                        System.out.print("Quantidade de categorias : ");
                        int qtdCat = Integer.parseInt(s.nextLine());
                        Titulo t = new Titulo(nomeTitulo,descricao,classfInd,anoLanc,duracao,avaliacao);
                        for (int i = 0; i < qtdCat; i++) {
                            System.out.print("\n" + (i+1) + "ª categoria : ");
                            String nomeCategoria = s.nextLine();
                            for (int j = 0; j < n.getListaCategorias().size(); j++) {
                                if (n.getListaCategorias().get(j).getNome().equals(nomeCategoria)) {
                                    t.getCategorias().add(n.getListaCategorias().get(j));
                                    switch (avaliacao) {
                                        case 1:
                                            n.getListaCategorias().get(j).getListaTitulosNota1().add(t);
                                            break;
                                        case 2:
                                            n.getListaCategorias().get(j).getListaTitulosNota2().add(t);
                                            break;
                                        case 3:
                                            n.getListaCategorias().get(j).getListaTitulosNota3().add(t);
                                            break;
                                        case 4:
                                            n.getListaCategorias().get(j).getListaTitulosNota4().add(t);
                                            break;
                                        case 5:
                                            n.getListaCategorias().get(j).getListaTitulosNota5().add(t);
                                            break;
                                    }
                                    break;
                                }
                            }
                        }
                        
                        System.out.print("Quantidade de sub-categorias : ");
                        int qtdSubCat = Integer.parseInt(s.nextLine());
                        for (int i = 0; i < qtdSubCat; i++) {
                            System.out.print("\n" + (i+1) + "ª sub-categoria : ");
                            String nomeSubCategoria = s.nextLine();
                            for (int j = 0; j < n.getListaSubCategorias().size(); j++) {
                                if (n.getListaSubCategorias().get(j).getNome().equals(nomeSubCategoria)) {
                                    t.getSubCategorias().add(n.getListaCategorias().get(j));
                                    switch (avaliacao) {
                                        case 1:
                                            n.getListaCategorias().get(j).getListaTitulosNota1().add(t);
                                            break;
                                        case 2:
                                            n.getListaCategorias().get(j).getListaTitulosNota2().add(t);
                                            break;
                                        case 3:
                                            n.getListaCategorias().get(j).getListaTitulosNota3().add(t);
                                            break;
                                        case 4:
                                            n.getListaCategorias().get(j).getListaTitulosNota4().add(t);
                                            break;
                                        case 5:
                                            n.getListaCategorias().get(j).getListaTitulosNota5().add(t);
                                            break;
                                    }
                                    n.getListaCategorias().get(j).getListaTitulos().add(t);
                                    break;
                                }
                            }
                        }
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
                    case 4:
                        System.out.print("\nNome do título que deseja remover : ");
                        String nomeTituloRemover = s.nextLine();
                        for (int i = 0; i < n.getListaTitulos().size(); i++) {
                            if (n.getListaTitulos().get(i).getNome().equals(nomeTituloRemover)) {
                                for (int j = 0; j < n.getListaTitulos().get(i).getListaDiretores().size(); j++) {
                                    for (int k = 0; k < n.getListaTitulos().get(i).getListaDiretores().get(j).getTitulosQueParticipou().size(); k++) {
                                        if (n.getListaTitulos().get(i).getListaDiretores().get(j).getTitulosQueParticipou().get(k).getNome().equals(nomeTituloRemover)) {
                                            n.getListaTitulos().get(i).getListaDiretores().get(j).getTitulosQueParticipou().remove(n.getListaTitulos().get(i).getListaDiretores().get(j).getTitulosQueParticipou().get(k));
                                        }
                                    }
                                }
                                for (int j = 0; j < n.getListaTitulos().get(i).getListaAtores().size(); j++) {
                                    for (int k = 0; k < n.getListaTitulos().get(i).getListaAtores().get(j).getTitulosQueParticipou().size(); k++) {
                                        if (n.getListaTitulos().get(i).getListaAtores().get(j).getTitulosQueParticipou().get(k).getNome().equals(nomeTituloRemover)) {
                                            n.getListaTitulos().get(i).getListaAtores().get(j).getTitulosQueParticipou().remove(n.getListaTitulos().get(i).getListaDiretores().get(j).getTitulosQueParticipou().get(k));
                                        }
                                    }
                                }
                                for (int j = 0; j < n.getListaCategorias().size(); j++) {
                                    if (n.getListaCategorias().get(j).getNome().equals(nomeTituloRemover)) {
                                        n.getListaCategorias().remove(n.getListaCategorias().get(j));
                                        break;
                                    }
                                }
                                for (int j = 0; j < n.getListaSubCategorias().size(); j++) {
                                    if (n.getListaSubCategorias().get(j).getNome().equals(nomeTituloRemover)) {
                                        n.getListaSubCategorias().remove(n.getListaSubCategorias().get(j));
                                        break;
                                    }
                                }
                            }
                            n.getListaTitulos().remove(n.getListaTitulos().get(i));
                            break;
                        }
                        break;
                    case 5:
                        System.out.print("\nNome da categoria que deseja cadastrar : ");
                        String nomeCatCadastrar = s.nextLine();
                        Categoria c = new Categoria(nomeCatCadastrar);
                        n.getListaCategorias().add(c);
                        break;
                    case 9:
                        if(n.getListaSubCategorias().isEmpty()){
                            System.out.println("Nenhuma SubCategoria cadastrada até o momento!");
                        }else{
                            System.out.println("Digite o nome da SubCategoria: ");
                            String subCat = s.nextLine();
                            for(int i = 0; i < n.getListaSubCategorias().size(); i++){
                                if(n.getListaSubCategorias().get(i).getNome().equals(subCat)){
                                    for (int j = 0; j < n.getListaSubCategorias().get(i).getListaTitulos().size(); j++) {
                                        System.out.println(n.getListaSubCategorias().get(i).getListaTitulos().get(j).getNome());
                                    }
                                }
                            }
                        }
                        break;
                    case 10:
                        if(n.getListaSubCategorias().isEmpty()){
                            System.out.println("Nenhuma SubCategoria cadastrada até o momento!");
                        }else{
                            System.out.println("Digite a SubCategoria a ser removida: ");
                            String subCat = s.nextLine();
                            for (int i = 0; i < n.getListaSubCategorias().size(); i++) {
                                if(n.getListaSubCategorias().get(i).getNome().equals(subCat)){
                                    n.getListaSubCategorias().remove(n.getListaSubCategorias().get(i));
                                }
                            }
                            for (int i = 0; i < n.getListaTitulos().size(); i++) {
                                for (int j = 0; j < n.getListaTitulos().get(i).getSubCategorias().size(); j++) {
                                    if(n.getListaTitulos().get(i).getSubCategorias().get(j).getNome().equals(subCat)){
                                        n.getListaTitulos().get(i).getSubCategorias().remove(n.getListaTitulos().get(i).getSubCategorias().get(j));
                                    }
                                }
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