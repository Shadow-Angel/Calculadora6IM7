package a6im7.calculadora6im7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // String Usr = "Gera";
    // String Pasw = "Ola k ase";
    String SMsj = "Bienvenido oki";

    public void onClickMsj(View vista){
        TextView Msj = (TextView) findViewById(R.id.TextViewBien);
        Msj.setText(SMsj);
    }
}

