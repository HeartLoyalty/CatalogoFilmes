package br.com.etecia.myapp;

public class Movies {
private String tittle;
private int sinopse;
private int ImgMovie;

    public Movies(String tittle, int sinopse, int imgMovie) {
        this.tittle = tittle;
        this.sinopse = sinopse;
        this.ImgMovie = imgMovie;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getSinopse() {
        return sinopse;
    }

    public void setSinopse(int sinopse) {
        this.sinopse = sinopse;
    }

    public int getImgMovie() {
        return ImgMovie;
    }

    public void setImgMovie(int imgMovie) {
        ImgMovie = imgMovie;
    }
}
