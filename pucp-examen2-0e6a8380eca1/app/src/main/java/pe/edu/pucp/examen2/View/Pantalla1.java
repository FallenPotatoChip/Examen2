package pe.edu.pucp.examen2.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Pantalla1 extends AppCompatActivity {

    Button buttonPant2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);
        buttonPant2 =  findViewById(R.id.botonGuardarCalificar);
    }
}
