package fiap.rm31500.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmActivity extends AppCompatActivity {

    private TextView tvTextoConfirmacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        tvTextoConfirmacao = (TextView) findViewById(R.id.tvTextoConfirmacao);

        Intent intent = getIntent();
        if (intent != null) {
            String nome = intent.getStringExtra("NOME");
            String idade = intent.getStringExtra("IDADE");
            String time = intent.getStringExtra("TIME");

            String confirmacao = getString(R.string.confirmacao_cadastro, nome, time, idade);

            tvTextoConfirmacao.setText(confirmacao);
        }

    }
}
