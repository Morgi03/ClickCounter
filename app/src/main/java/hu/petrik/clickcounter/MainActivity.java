package hu.petrik.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button pluss;
    private TextView showNum;
    private Button minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        pluss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = showNum.getText().toString();
                int valueOfNum = Integer.parseInt(value);
                valueOfNum = valueOfNum + 1;
                value = String.valueOf(valueOfNum);
                showNum.setText(value);
                if (valueOfNum > 0) {
                    showNum.setTextColor(Color.GREEN);
                } else if (valueOfNum == 0) {
                    showNum.setTextColor(Color.BLUE);
                } else {
                    showNum.setTextColor(Color.RED);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = showNum.getText().toString();
                int valueOfNum = Integer.parseInt(value);
                valueOfNum = valueOfNum - 1;
                value = String.valueOf(valueOfNum);
                showNum.setText(value);
                if (valueOfNum > 0) {
                    showNum.setTextColor(Color.GREEN);
                } else if (valueOfNum == 0) {
                    showNum.setTextColor(Color.BLUE);
                } else {
                    showNum.setTextColor(Color.RED);
                }
            }
        });
        showNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNum.setTextColor(Color.BLUE);
                showNum.setText("0");
            }
        });
    }

    private void init() {
        pluss = findViewById(R.id.pluss);
        minus = findViewById(R.id.minus);
        showNum = findViewById(R.id.showNum);
    }
}