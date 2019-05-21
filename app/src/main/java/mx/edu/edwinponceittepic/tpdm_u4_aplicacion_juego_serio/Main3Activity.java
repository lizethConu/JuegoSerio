package mx.edu.edwinponceittepic.tpdm_u4_aplicacion_juego_serio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Main3Activity extends AppCompatActivity {
EditText alt,p;
ImageButton play;
double altura,peso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        alt=findViewById(R.id.altura);
        p=findViewById(R.id.peso);
        play=findViewById(R.id.play);

        altura=Double.parseDouble(alt.getText().toString());
        peso=Double.parseDouble(p.getText().toString());

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
