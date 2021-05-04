package kr.hs.emirim.ohyoonseo.chapter4_8ex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.edit1);
        edit1.setOnKeyListener(keyListener);
    }

    View.OnKeyListener keyListener = new View.OnKeyListener() {
        @Override
        public boolean onKey(View v, int keyCode, KeyEvent event) {
            if (event.getAction() == KeyEvent.ACTION_UP) {
                Toast.makeText(getApplicationContext(), edit1.getText().toString(), Toast.LENGTH_SHORT).show();
            }
            return false;
        }
    };
}