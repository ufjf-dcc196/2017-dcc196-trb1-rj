package br.com.oak.ifeira;

/**
 * Created by Guilherme on 17/11/2017.
 */

class Reserva {

    private Pessoa pessoa;
    private Livro livro;

    public Reserva(Pessoa pessoa, Livro livro) {
        this.pessoa = pessoa;
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
