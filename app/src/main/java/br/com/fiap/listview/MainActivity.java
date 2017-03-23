package br.com.fiap.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lstContatos;
    List<Contatos> lContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lContato = GeraContato.listaContatos();
        ContatoAdapter contatoAdapter = new ContatoAdapter(this, lContato);
        lstContatos = (ListView) findViewById(R.id.lstContatos);
        lstContatos.setAdapter(contatoAdapter);
        lstContatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Contatos contato = lContato.get(i);

                Intent it = new Intent(MainActivity.this, ConversaActivity.class);
                it.putExtra("contato", contato);
                startActivity(it);
            }
        });

    }
}