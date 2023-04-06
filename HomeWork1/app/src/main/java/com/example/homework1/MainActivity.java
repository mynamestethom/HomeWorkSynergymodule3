package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton button_ball;
    TextView text;
    ImageView ronaldo;
    boolean clicked = true;
    MotionLayout motion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_ball = findViewById(R.id.button_ball);
        ronaldo = findViewById(R.id.ronaldo);
        motion = findViewById(R.id.motion);

        button_ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clicked){
                    motion.transitionToEnd();
                    clicked = false;
                }else{
                    clicked = true;
                    motion.transitionToStart();
                }

            }
        });

    }
}