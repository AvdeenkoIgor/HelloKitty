package com.example.root.hellokitty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mHelloTextView;
    private EditText mNameEditText;
    private Button mCrowsCounterButton;
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCrowsCounterButton = (Button)findViewById(R.id. ButtonCrowsCounter);
        mHelloTextView = (TextView)findViewById(R.id.textViewHello);
        mNameEditText = (EditText) findViewById(R.id.editText);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHelloTextView.setText("Я насчитал " + ++mCount + " ворон");
            }
        });
    }

    public void onClick(View view) {
        if (mNameEditText.getText().length() == 0){
            mHelloTextView.setText("Hello Kitty!");
        } else {
            mHelloTextView.setText("Привет, " + mNameEditText.getText());
        }
    }

    public void onClick2(View view) {
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("Hello Kitty!");
    }
}

