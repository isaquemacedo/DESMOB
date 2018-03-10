package br.usjt.meuprimeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Isaque Alves de Macedo
 * R.A: 201413286
 */
public class MainActivity extends AppCompatActivity {

    //constante static para identifcar a mensaaem
    public final static String EXTRA_MESSAGE =
            "br.usjt.meuprimeiroapp.MESSAGE";

    /**
     * Isaque Alves de Macedo
     * R.A: 201413286
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Isaque Alves de Macedo
     * R.A: 201413286
     */
    //será chamado quando o usuário clicar em Enviar
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
