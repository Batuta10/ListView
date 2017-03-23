package br.com.fiap.listview;

import java.io.Serializable;

public class Contatos implements Serializable {

    private String nome;
    private String telefone;
    private String sobre;
    private int img;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Contatos(String nome, String telefone, String sobre, int img) {
        this.nome = nome;
        this.telefone = telefone;
        this.sobre = sobre;
        this.img = img;
    }

}
