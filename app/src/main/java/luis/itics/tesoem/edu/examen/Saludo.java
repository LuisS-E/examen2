package luis.itics.tesoem.edu.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {

    TextView saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        saludo = (TextView) findViewById(R.id.txtsaludanombre);

        Bundle parametro = this.getIntent().getExtras();

        saludo.setText("Bienvenido " + parametro.getString("nombre").toString());
    }
}
