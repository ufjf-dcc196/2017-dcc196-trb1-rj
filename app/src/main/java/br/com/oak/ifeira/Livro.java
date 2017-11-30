package br.com.oak.ifeira;

/**
 * Created by Teco on 31/10/2017.
 */

public class Livro {

    private String titulo;
    private String editora;
    private Integer ano;

    public Livro() {
        this(null,null,null);
    }

    public Livro(String titulo, String editora, Integer ano) {
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

    @Override
    public String toString() {
        return titulo;
    }

}
