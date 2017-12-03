package br.com.oak.ifeira;

public class Livro {

    private int id;
    private String titulo;
    private String editora;
    private Integer ano;

    public Livro() {
        this(0,null,null,null);
    }

    public Livro(int id, String titulo, String editora, Integer ano) {
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public Integer getAno() {
        return ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return titulo;
    }

}
