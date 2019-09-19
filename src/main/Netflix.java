package main;
import classes.titulo.Categoria;
import classes.titulo.Titulo;
import java.util.ArrayList;
public class Netflix {
    // ATRIBUTOS
    private ArrayList<Titulo> listaTitulos;
    private ArrayList<Categoria> listaCategorias;
    private ArrayList<Categoria> listaSubCategorias;
    
    // CONSTRUTOR
    public Netflix() {
        this.listaTitulos = new ArrayList();
        this.listaCategorias = new ArrayList();
        this.listaSubCategorias = new ArrayList();
    }
    
    // GETTERS E SETTERS
    public ArrayList<Titulo> getListaTitulos() {
        return listaTitulos;
    }
    public void setListaTitulos(ArrayList<Titulo> listaTitulos) {
        this.listaTitulos = listaTitulos;
    }
    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }
    public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }
    public ArrayList<Categoria> getListaSubCategorias() {
        return listaSubCategorias;
    }
    public void setListaSubCategorias(ArrayList<Categoria> listaSubCategorias) {
        this.listaSubCategorias = listaSubCategorias;
    }
    
    // MÉTODOS
    public ArrayList<String> listarTitulosPorAvaliacao(Categoria categoria, int avaliacaoMinima) {
        ArrayList<String> array = new ArrayList();
        switch (avaliacaoMinima) {
            case 5:
                for (int i = 0; i < categoria.getListaTitulosNota5().size(); i++) {
                    array.add(categoria.getListaTitulosNota5().get(i).getNome());
                }
                break;
            case 4:
                for (int i = 0; i < categoria.getListaTitulosNota5().size(); i++) {
                    array.add(categoria.getListaTitulosNota5().get(i).getNome());
                }
                for (int i = 0; i < categoria.getListaTitulosNota4().size(); i++) {
                    array.add(categoria.getListaTitulosNota4().get(i).getNome());
                }
                break;
            case 3:
                for (int i = 0; i < categoria.getListaTitulosNota5().size(); i++) {
                    array.add(categoria.getListaTitulosNota5().get(i).getNome());
                }
                for (int i = 0; i < categoria.getListaTitulosNota4().size(); i++) {
                    array.add(categoria.getListaTitulosNota4().get(i).getNome());
                }
                for (int i = 0; i < categoria.getListaTitulosNota3().size(); i++) {
                    array.add(categoria.getListaTitulosNota3().get(i).getNome());
                }
                break;
            case 2:
                for (int i = 0; i < categoria.getListaTitulosNota5().size(); i++) {
                    array.add(categoria.getListaTitulosNota5().get(i).getNome());
                }
                for (int i = 0; i < categoria.getListaTitulosNota4().size(); i++) {
                    array.add(categoria.getListaTitulosNota4().get(i).getNome());
                }
                for (int i = 0; i < categoria.getListaTitulosNota3().size(); i++) {
                    array.add(categoria.getListaTitulosNota3().get(i).getNome());
                }
                for (int i = 0; i < categoria.getListaTitulosNota2().size(); i++) {
                    array.add(categoria.getListaTitulosNota2().get(i).getNome());
                }
                break;
            case 1:
                for (int i = 0; i < categoria.getListaTitulosNota5().size(); i++) {
                    array.add(categoria.getListaTitulosNota5().get(i).getNome());
                }
                for (int i = 0; i < categoria.getListaTitulosNota4().size(); i++) {
                    array.add(categoria.getListaTitulosNota4().get(i).getNome());
                }
                for (int i = 0; i < categoria.getListaTitulosNota3().size(); i++) {
                    array.add(categoria.getListaTitulosNota3().get(i).getNome());
                }
                for (int i = 0; i < categoria.getListaTitulosNota2().size(); i++) {
                    array.add(categoria.getListaTitulosNota2().get(i).getNome());
                }
                for (int i = 0; i < categoria.getListaTitulosNota1().size(); i++) {
                    array.add(categoria.getListaTitulosNota1().get(i).getNome());
                }
                break;
            default:
                break;
        }
        return array;
    }
    
}