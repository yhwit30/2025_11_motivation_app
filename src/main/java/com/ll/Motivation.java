package com.ll;

public class Motivation {

    int id;
    String motiv;
    String writer;

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
}
