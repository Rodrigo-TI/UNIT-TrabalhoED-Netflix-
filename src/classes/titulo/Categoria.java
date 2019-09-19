package classes.titulo;
import java.util.ArrayList;
public class Categoria {
    // ATRIBUTOS
    private String nome;
    private ArrayList<Titulo> listaTitulos;
    private ArrayList<Titulo> listaTitulosNota1;
    private ArrayList<Titulo> listaTitulosNota2;
    private ArrayList<Titulo> listaTitulosNota3;
    private ArrayList<Titulo> listaTitulosNota4;
    private ArrayList<Titulo> listaTitulosNota5;
    
    // CONSTRUTOR
    public Categoria(String nome) {
        this.nome = nome;
        this.listaTitulos = new ArrayList();
        this.listaTitulosNota1 = new ArrayList();
        this.listaTitulosNota2 = new ArrayList();
        this.listaTitulosNota3 = new ArrayList();
        this.listaTitulosNota4 = new ArrayList();
        this.listaTitulosNota5 = new ArrayList();
    }
    
    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
        
    }

    public ArrayList<Titulo> getListaTitulos() {
        return listaTitulos;
    }

    public void setListaTitulos(ArrayList<Titulo> listaTitulos) {
        this.listaTitulos = listaTitulos;
    }
    public ArrayList<Titulo> getListaTitulosNota1() {
        return listaTitulosNota1;
    }
    public void setListaTitulosNota1(ArrayList<Titulo> listaTitulosNota1) {
        this.listaTitulosNota1 = listaTitulosNota1;
    }
    public ArrayList<Titulo> getListaTitulosNota2() {
        return listaTitulosNota2;
    }
    public void setListaTitulosNota2(ArrayList<Titulo> listaTitulosNota2) {
        this.listaTitulosNota2 = listaTitulosNota2;
    }
    public ArrayList<Titulo> getListaTitulosNota3() {
        return listaTitulosNota3;
    }
    public void setListaTitulosNota3(ArrayList<Titulo> listaTitulosNota3) {
        this.listaTitulosNota3 = listaTitulosNota3;
    }
    public ArrayList<Titulo> getListaTitulosNota4() {
        return listaTitulosNota4;
    }
    public void setListaTitulosNota4(ArrayList<Titulo> listaTitulosNota4) {
        this.listaTitulosNota4 = listaTitulosNota4;
    }
    public ArrayList<Titulo> getListaTitulosNota5() {
        return listaTitulosNota5;
    }
    public void setListaTitulosNota5(ArrayList<Titulo> listaTitulosNota5) {
        this.listaTitulosNota5 = listaTitulosNota5;
    }
}
