package io.github.controlwear.joystickdemo;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tutorials extends help {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorials);
    }

    public void goToHelp(View view) {
        Intent in = new Intent(Tutorials.this, help.class);
        startActivity(in);
    }
}