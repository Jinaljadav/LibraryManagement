package com.example.librarymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Define a textview
        TextView textView = findViewById(R.id.textView);

        //Define a buttons
        Button borrow = findViewById(R.id.BorrowBook);

        //Another buttons defined
        Button returnbook = findViewById(R.id.ReturnBook);


        //Borrow activity
        borrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Naviagte to borrow a book page

                Intent intent= new Intent(MainActivity.this,BorrowActivity.class);
                startActivity(intent);
            }
        });

        //Returnbook activity

        returnbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReturnBook.class);
                startActivity(intent);
            }
        });

    }
}