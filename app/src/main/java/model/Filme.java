package model;

public class Filme {

    private String tituloFilme;
    private String genro;
    private String ano;

    public Filme(){

    }

    public Filme(String tituloFilme, String genro, String ano) {
        this.tituloFilme = tituloFilme;
        this.genro = genro;
        this.ano = ano;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public String getGenro() {
        return genro;
    }

    public void setGenro(String genro) {
        this.genro = genro;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
