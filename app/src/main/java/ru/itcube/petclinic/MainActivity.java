package ru.itcube.petclinic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ru.itcube.petclinic.view.SomeView;

public class MainActivity extends AppCompatActivity {

//    EditText in1;
//    EditText in2;
//    TextView result;
//    Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(new SomeView(this));


//        setContentView(R.layout.activity_main);
//
//        in1 = findViewById(R.id.in1);
//        in2 = findViewById(R.id.in2);
//        result = findViewById(R.id.result);
//
//        calc = findViewById(R.id.calc);
//        calc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int a = Integer.valueOf(in1.getText().toString());
//                int b = Integer.valueOf(in2.getText().toString());
//
//                result.setText(String.format("%d", a + b));
//            }
//        });
    }
}