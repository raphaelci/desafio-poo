package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final Double XP_PADRAO = 10d;

    private String titulo;
    private String conteudo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public abstract Double calcularXp();



}
