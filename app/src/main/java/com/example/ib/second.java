package com.example.ib;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClick(View view){
        Intent intent = new Intent(this,MainActivity.class);

        final EditText applesInput = (EditText)findViewById(R.id.applesInput);
        String userMessage = applesInput.getText().toString(); // take anything the types and change into a string variable

        intent.putExtra("appleMessage",userMessage); //any time you need to pass extra info to another activity use the putExtra method
        startActivity(intent);
    }
}
