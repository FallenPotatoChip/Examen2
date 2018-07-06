package pe.edu.pucp.examen2.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pe.edu.pucp.examen2.Presenter.UserPresenter;

public class Pantalla3 extends AppCompatActivity {

    private UserPresenter presenter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);
        presenter = new UserPresenter(this);
        setupFields();

        presenter.getUsers();

    }
}
