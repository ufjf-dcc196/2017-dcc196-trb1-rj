package br.com.oak.ifeira;

public class Pessoa {

    private int id;

    private String nome;
    private String email;

    public Pessoa() {
        this(0,null,null);
    }

    public Pessoa(int id, String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nome;
    }
}
