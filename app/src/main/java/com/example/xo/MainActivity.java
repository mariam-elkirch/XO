package com.example.xo;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //player 1 label x
    //player 2 label o
    int playerCounter=0;

    public void onPlayerClick(View view){
        TextView clickedView = ((TextView) view);
        if(!clickedView.getText().toString().equals("")){
            Toast.makeText(this, "choose another cell", Toast.LENGTH_SHORT).show();
            return;
        }

        if(playerCounter%2==0){
            clickedView.setText("X");
        }else {
            clickedView.setText("O");
        }
        playerCounter++;


    }
}

