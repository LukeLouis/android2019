package pk.com.aptech.intentsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText editText = (EditText) findViewById(R.id.editText1);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("text", editText.getText().toString());
        startActivity(intent);
    }
}
