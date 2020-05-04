package com.example.p66na.burgerrating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar=findViewById(R.id.ratingBar);
        textView=findViewById(R.id.textView);
    }
    public void submit(View view){
        float ratingValue = ratingBar.getRating();
        if(ratingValue<=1)
        textView.setText("Rating: " + ratingValue + "\n" + "Very bad");
        else if(ratingValue<=2 && ratingValue>=1)
            textView.setText("Rating: " + ratingValue + "\n" + "Bad");
        else if(ratingValue<=3 && ratingValue>=2)
            textView.setText("Rating: " + ratingValue + "\n" + "Average");
        else if(ratingValue<=4 && ratingValue>=3)
            textView.setText("Rating: " + ratingValue + "\n" + "Good");
        else
            textView.setText("Rating: " + ratingValue + "\n" + "Very good");
    }
}
