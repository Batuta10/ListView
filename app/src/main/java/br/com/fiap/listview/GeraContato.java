package br.com.fiap.listview;

import java.util.ArrayList;
import java.util.List;

public class GeraContato {
    public static List<Contatos> listaContatos(){
        List<Contatos> contatos = new ArrayList<>();

        contatos.add(new Contatos("João","(11)1111-1111","Hello There,I'm using Fiap Zap",R.drawable.user1));
        contatos.add(new Contatos("Maria","(11)2222-2222","Olá",R.drawable.user2));
        contatos.add(new Contatos("Batuta","(11)3333-3333","Aceita que dois menos.",R.drawable.user3));

        return contatos;
    }
}
