package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnIniciar;
    TextView txtM1, txtM2, txtEmpate;
    ImageView img1, img2;
    int paper = 1;
    int rock = 2;
    int scissor = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = findViewById(R.id.btnIniciar);
        txtM1 = findViewById(R.id.txtM1);
        txtM2 = findViewById(R.id.txtM2);
        txtEmpate = findViewById(R.id.txtEmpates);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int statusMaquina1 = (int) (3* Math.random()) + 1;
                int statusMaquina2 = (int) (3* Math.random()) + 1;

                if (statusMaquina1 == paper){
                    img1.setImageResource(R.drawable.papel);
                }

                else if (statusMaquina1 == rock){
                    img1.setImageResource(R.drawable.pedra);

                }

                else if (statusMaquina1 == scissor){
                    img1.setImageResource(R.drawable.tesoura);

                }

                if (statusMaquina2 == paper){
                    img2.setImageResource(R.drawable.papel);
                }

                else if (statusMaquina2 == rock){
                    img2.setImageResource(R.drawable.pedra);

                }

                else if (statusMaquina2 == scissor){
                    img2.setImageResource(R.drawable.tesoura);

                }

                if(statusMaquina1 == statusMaquina2){
                    int timesScore = Integer.parseInt(txtM1.getText().toString());
                    int score = timesScore + 1;

                    txtEmpate.setText(score+"");
                }

                else if(statusMaquina1 == paper && statusMaquina2 == rock){
                    int timesScore = Integer.parseInt(txtM1.getText().toString());
                    int score = timesScore + 1;

                    txtM1.setText(score+"");
                }

                else if(statusMaquina1 == rock && statusMaquina2 == scissor){
                    int timesScore = Integer.parseInt(txtM1.getText().toString());
                    int score = timesScore + 1;

                    txtM1.setText(score+"");
                }

                else if(statusMaquina1 == scissor && statusMaquina2 == paper){
                    int timesScore = Integer.parseInt(txtM1.getText().toString());
                    int score = timesScore + 1;

                    txtM1.setText(score+"");
                }

                else if(statusMaquina2 == paper && statusMaquina1 == rock){
                    int timesScore = Integer.parseInt(txtM2.getText().toString());
                    int score = timesScore + 1;

                    txtM2.setText(score+"");
                }

                else if(statusMaquina2 == rock && statusMaquina1 == scissor){
                    int timesScore = Integer.parseInt(txtM2.getText().toString());
                    int score = timesScore + 1;

                    txtM2.setText(score+"");
                }

                else if(statusMaquina2 ==scissor && statusMaquina1 == paper){
                    int timesScore = Integer.parseInt(txtM2.getText().toString());
                    int score = timesScore + 1;

                    txtM2.setText(score+"");
                }

            }
        });
    }
}