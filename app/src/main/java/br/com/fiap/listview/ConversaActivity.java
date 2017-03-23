package br.com.fiap.listview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ConversaActivity extends AppCompatActivity {

    ImageView imgContato;
    TextView nomeContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversa);
        Contatos contatos = (Contatos) getIntent().getExtras().get("contato");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(contatos.getNome());

        imgContato = (ImageView) findViewById(R.id.imgContato);
        nomeContato = (TextView) findViewById(R.id.txtNome);

        imgContato.setImageResource(contatos.getImg());
        nomeContato.setText(contatos.getNome());
    }
}
