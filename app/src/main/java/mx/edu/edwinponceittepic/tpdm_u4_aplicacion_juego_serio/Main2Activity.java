package mx.edu.edwinponceittepic.tpdm_u4_aplicacion_juego_serio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {
    Main3Activity m3=new Main3Activity();
    //Obtener el valor
    Double altura=m3.getAltura();
    Double peso = m3.getPeso();
    Double imc;
    Niño niño;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void setNiño(Niño niño) {
        this.niño = niño;
        imc=niño.getIMC(altura,peso);
    }

    public int escalaIMC(Double imc){
        if(imc<=20){
            return 0;
        }
        if(imc>20 && imc<=28){
            return 1;
        }
        if(imc>29){
            return 2;
        }
        return 3;
    } 

    public void evaluar(int ban){
        if(ban==0){

        }
        if(ban==1){

        }
        if(ban==2){

        }
        if(ban==3){

        }

    }



}
