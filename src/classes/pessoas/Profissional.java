package classes.pessoas;
import classes.titulo.Titulo;
import java.util.ArrayList;
public class Profissional extends Pessoa {
    // ATRIBUTOS
    private String cargo;
    private int anosCarreira;
    private ArrayList<Titulo> titulosQueParticipou;
    private ArrayList<String> premios;
    private String biografia;
    
    // CONSTRUTOR
    public Profissional(String cargo, int anosCarreira, String biografia, String nome, int idade, String sexo, String nacionalidade) {
        super(nome, idade, sexo, nacionalidade);
        this.cargo = cargo;
        this.anosCarreira = anosCarreira;
        this.titulosQueParticipou = new ArrayList();
        this.premios = new ArrayList();
        this.biografia = biografia;
    }

    // GETTERS E SETTERS
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getAnosCarreira() {
        return anosCarreira;
    }
    public void setAnosCarreira(int anosCarreira) {
        this.anosCarreira = anosCarreira;
    }
    public ArrayList<Titulo> getTitulosQueParticipou() {
        return titulosQueParticipou;
    }
    public void setTitulosQueParticipou(ArrayList<Titulo> titulosQueParticipou) {
        this.titulosQueParticipou = titulosQueParticipou;
    }
    public ArrayList<String> getPremios() {
        return premios;
    }
    public void setPremios(ArrayList<String> premios) {
        this.premios = premios;
    }
    public String getBiografia() {
        return biografia;
    }
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}
