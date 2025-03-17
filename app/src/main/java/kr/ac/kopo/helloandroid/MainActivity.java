package kr.ac.kopo.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);

        Button btn1 = findViewById(R.id.btn1);
        TextView text1 = findViewById(R.id.text1);
        EditText edit1 = findViewById(R.id.edit1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                                        "버튼을 클릭하셨네요.",
                                            Toast.LENGTH_SHORT);

                toast.show();
                String name = edit1.getText().toString();
                text1.setText(name + "입니다.");


            }
        });

    }
}