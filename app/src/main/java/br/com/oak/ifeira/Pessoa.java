package br.com.oak.ifeira;

/**
 * Created by Teco on 31/10/2017.
 */

public class Pessoa {

    private String nome;
    private String email;

    public Pessoa() {
        this(null,null);
    }

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
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
}
