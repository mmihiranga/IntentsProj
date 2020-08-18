package com.example.intentsproj2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public static String EXTRA_MESSAGE1;
    public static String EXTRA_MESSAGE2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


    }
    public void SendMessage(View View) {
        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";

        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();

        Intent intent=new Intent(this, com.example.intentsproj2.SecondActivity.class);
        EditText EText1=(EditText)findViewById(R.id.num11);
        EditText EText2=(EditText)findViewById(R.id.num12);

        String  message1 =EText1.getText().toString();
        String  message2 =EText1.getText().toString();

        intent.putExtra(EXTRA_MESSAGE1,message1 );
        intent.putExtra(EXTRA_MESSAGE2,message2 );

        startActivity(intent);

    }
}