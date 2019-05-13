package com.example.molly.database;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //Button button;

    //    NAME: GALENDA SUZAN CARO
//    REGNO:   2017/BIT/166
//    COURSE:  MOBILE APPLICATION PROGRAMMING
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intt = new Intent(Home.this,employer.class);
                startActivity(intt);
            }
        });

    }
    public void next(View view){
        Intent ioo = new Intent(this,employer.class);
        startActivity(ioo);

    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"the app is started",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
