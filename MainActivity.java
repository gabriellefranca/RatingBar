package com.example.gabi2.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar rb;
    TextView  result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb = (RatingBar)findViewById(R.id.rb1);
        result = (TextView)findViewById(R.id.result);
    }

    public void verificar(View v){
        int quantidadeEstrelas = (int) rb.getRating();
        String message = null;

        switch (quantidadeEstrelas){
            case 1: message = "Poxa, apenas uma estrela"; break;
            case 2: message = "Um pouco abaixo da média, 2 estrelas"; break;
            case 3: message = "Na média"; break;
            case 4: message = "4 estrelas!"; break;
            case 5: message = "Perfeito!"; break;
        }
        result.setText(message);
       // Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
