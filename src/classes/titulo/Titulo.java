package classes.titulo;
import classes.pessoas.Profissional;
import java.util.ArrayList;
public class Titulo {
    // ATRIBUTOS
    private String nome;
    private String descricao;
    private int classificacaoIndicativa;
    private int anoLancamento;
    private int duracao;
    private int avaliacao;
    private ArrayList<Categoria> categorias;
    private ArrayList<Categoria> subCategorias;
    private ArrayList<Profissional> listaAtores;
    private ArrayList<Profissional> listaDiretores;
    
    // CONSTRUTOR
    public Titulo(String nome, String descricao, int classificacaoIndicativa, int anoLancamento, int duracao) {
        this.nome = nome;
        this.descricao = descricao;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.avaliacao = 0;
        this.categorias = new ArrayList();
        this.subCategorias = new ArrayList();
        this.listaAtores = new ArrayList();
        this.listaDiretores = new ArrayList();
    }

    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }
    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }
    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }
    public ArrayList<Categoria> getSubCategorias() {
        return subCategorias;
    }
    public void setSubCategorias(ArrayList<Categoria> subCategorias) {
        this.subCategorias = subCategorias;
    }
    public ArrayList<Profissional> getListaAtores() {
        return listaAtores;
    }
    public void setListaAtores(ArrayList<Profissional> listaAtores) {
        this.listaAtores = listaAtores;
    }
    public ArrayList<Profissional> getListaDiretores() {
        return listaDiretores;
    }
    public void setListaDiretores(ArrayList<Profissional> listaDiretores) {
        this.listaDiretores = listaDiretores;
    }
    
    // MÉTODOS
    public void receberAvaliacao(int avaliacao) {
        if (this.avaliacao == 0) {
            this.avaliacao = avaliacao;
        } else {
            this.avaliacao = (this.avaliacao + avaliacao)/2;
        }
    }
}