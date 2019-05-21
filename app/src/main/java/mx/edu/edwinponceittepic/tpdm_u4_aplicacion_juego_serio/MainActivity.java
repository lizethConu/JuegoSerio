    package mx.edu.edwinponceittepic.tpdm_u4_aplicacion_juego_serio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

    public class MainActivity extends AppCompatActivity {
    ImageButton play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        play = findViewById(R.id.play);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent principal = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(principal);
            }
        });
    }

}
