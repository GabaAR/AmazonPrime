package com.simple.netflix;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void startactivity_main (View view) {
        
        Intent MainActivity = new Intent(this, MainActivity.class);
        startActivity(MainActivity);
    }

}