package sg.edu.rp.c346.s19024292.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tv=findViewById(R.id.textView);
        Intent i=getIntent();
        char orange=i.getCharExtra("value", '9');
        tv.setText("I get back a char: " + orange);
    }
}
