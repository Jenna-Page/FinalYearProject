package com.example.xpb11160.helloagain;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static Button fact_button_clicked;
    private static Button home_button_clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButtonListener();
        onClickButtonListener2();
    }
        public void onClickButtonListener() {
            fact_button_clicked = (Button) findViewById(R.id.button2);
            fact_button_clicked.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent("com.example.xpb11160.helloagain.FactOfTheDay");
                    startActivity(intent);
                }
            });
        }

        public void onClickButtonListener2(){
            home_button_clicked = (Button) findViewById(R.id.button4);
            home_button_clicked.setOnClickListener(new View.OnClickListener(){
                public void onClick(View y){
                    Intent intent = new Intent(getApplicationContext(),HomePage.class);
                    startActivity(intent);
                }
            });

        }


       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);

       // final TextView firstTextView = (TextView) findViewById(R.id.textView);}

      //  Button button2 = (Button) findViewById (R.id.button2); //these correspond with the variable names on content

       // button2.setOnClickListener(new View.OnClickListener(){
                         //public void onClick(View view){

                             // firstTextView.setText("Page 2!"); //this changes the text when the user clicks the button

                        // }

     //   });

/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
