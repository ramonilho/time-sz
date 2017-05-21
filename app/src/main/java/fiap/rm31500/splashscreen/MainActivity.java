package fiap.rm31500.splashscreen;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout tilNome;
    private TextInputLayout tilIdade;
    private Spinner spTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Muda o titulo da actionBar (compativel praticamente com todos os devices)
        getSupportActionBar().setTitle("Time S2");

        setContentView(R.layout.activity_main);
    }

    public void cadastrar(View view) {
        Intent intent = new Intent(this, ConfirmActivity.class);

        tilNome = (TextInputLayout) findViewById(R.id.tilNome);
        tilIdade = (TextInputLayout) findViewById(R.id.tilIdade);
        spTimes = (Spinner) findViewById(R.id.spTimes);

        intent.putExtra("NOME", tilNome.getEditText().getText().toString());
        intent.putExtra("IDADE", tilIdade.getEditText().getText().toString());
        intent.putExtra("TIME", spTimes.getSelectedItem().toString());

        startActivity(intent);

    }
}
