package sg.edu.rp.c346.s19024292.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tv=findViewById(R.id.textView);
        Intent i3=getIntent();
        double pear=i3.getDoubleExtra("value", 0);
        tv.setText("Double value received is: " + pear);
    }
}
