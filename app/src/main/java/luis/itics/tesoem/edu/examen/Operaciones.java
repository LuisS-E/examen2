package luis.itics.tesoem.edu.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Operaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
    }

    public void llamarbtn(View v){
        Intent cargar = new Intent(this, Suma.class);
        startActivity(cargar);

    }


    public void llamarbtnresta(View v){
        Intent cargar = new Intent(this, resta.class);
        startActivity(cargar);
    }


    public void llamarbtnpotencia(View v){
        Intent cargar = new Intent(this, potencia.class);
        startActivity(cargar);
    }
    public void llamarbtnsalida(View v){

        Intent cargar = new Intent(this, salida.class);
        startActivity(cargar);

    }
}

