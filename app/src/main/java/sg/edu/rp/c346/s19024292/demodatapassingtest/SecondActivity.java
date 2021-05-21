package sg.edu.rp.c346.s19024292.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv=findViewById(R.id.textView);
        Intent intent=getIntent();
        int apple=intent.getIntExtra("value", 0);
        tv.setText("I get back the int value: " + apple);
    }
}
