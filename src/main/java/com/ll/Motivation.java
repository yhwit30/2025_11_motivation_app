package com.ll;

public class Motivation {

    private int id;
    private String motiv;
    private String writer;

    @Override
    public String toString() {
        return "Motivation{" +
                "id=" + id +
                ", motiv='" + motiv + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }

    public Motivation(int id, String motiv, String writer) {
        this.id = id;
        this.motiv = motiv;
        this.writer = writer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotiv() {
        return motiv;
    }

    public void setMotiv(String motiv) {
        this.motiv = motiv;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
