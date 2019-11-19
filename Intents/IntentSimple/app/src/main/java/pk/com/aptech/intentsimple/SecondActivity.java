package pk.com.aptech.intentsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String extra = intent.getStringExtra("text");
        TextView view = (TextView) findViewById(R.id.textView1);
        view.setText(extra);
    }
}
