package br.com.fiap.listview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContatoAdapter extends BaseAdapter {

    private Context cont;
    private List<Contatos> contatos;


    public ContatoAdapter(Context cont, List<Contatos> contatos) {
        this.cont = cont;
        this.contatos = contatos;
    }

    @Override
    public int getCount() {
        return this.contatos.size();
    }

    @Override
    public Object getItem(int i) {
        return this.contatos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(this.cont);

        Contatos contatos = this.contatos.get(i);

        View v = layoutInflater.inflate(R.layout.listview_contatos,null);
        ImageView imgContato = (ImageView) v.findViewById(R.id.imgContato);
        TextView txtNome = (TextView) v.findViewById(R.id.txtNome);
        TextView txtStatus = (TextView) v.findViewById(R.id.txtSobre);

        imgContato.setImageResource(contatos.getImg());
        txtNome.setText(contatos.getNome());
        txtStatus.setText(contatos.getSobre());
        return v;
    }
}
