package com.example.ib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle appleData = getIntent().getExtras();
        if (appleData==null){
            return;
        }
        String appleMessage = appleData.getString("appleMessage");
        final TextView textBox = (TextView)findViewById(R.id.textBox);
        textBox.setText(appleMessage);

        Button btn = (Button)findViewById(R.id.btn); //it references the design (XML) to the java function


        btn.setOnClickListener(  //Setting up the event listener so the button listens for a click
                                    //setOnClickListener will tell it what to do if the button is clicked
                new Button.OnClickListener(){ // Interface
                    public void onClick(View view)
                    {
                        TextView textBox = (TextView)findViewById(R.id.textBox); // what has to react
                        textBox.setText("GOOD JOB"); //how it reacts
                    }//Callback method
                }
        );

        btn.setOnLongClickListener( // this is for long clicks.... needs a return statement

                new Button.OnLongClickListener(){
                    public boolean onLongClick (View view){
                        TextView textBox = (TextView)findViewById(R.id.textBox);
                        textBox.setText("LONG CLICK BITCH");
                        return true; // to return true that the long click was done and does'nt initiate the click listener

                    }
                }
        );

    }
    public void onClick(View view){
        Intent intent = new Intent(this,second.class);
        startActivity(intent);
    }
}
