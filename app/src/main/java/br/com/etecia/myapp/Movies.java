package br.com.etecia.myapp;

public class Movies {
private String tittle;
private String sinopse;
private int ImgMovie;

    public Movies(String tittle, String sinopse, int imgMovie) {
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

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getImgMovie() {
        return ImgMovie;
    }

    public void setImgMovie(int imgMovie) {
        ImgMovie = imgMovie;
    }
}
