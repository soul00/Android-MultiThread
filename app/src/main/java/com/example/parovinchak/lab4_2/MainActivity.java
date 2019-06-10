package com.example.parovinchak.lab4_2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {


    private TextView mTextView;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Итерации
        final SeekBar SeekBars = (SeekBar)findViewById(R.id.SeekBars);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final Button setting = (Button)findViewById(R.id.button);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        setting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondPage.class);

                // Передаем итерации
                intent.putExtra("iter", textView5.getText().toString());


                //Передаем потоки
                intent.putExtra("potok", spinner.getSelectedItem().toString());

                startActivity(intent);


            }
        });


        SeekBars.setOnSeekBarChangeListener(this);

        mTextView = (TextView)findViewById(R.id.textView5);
        mTextView.setText("1000000");

        mInfoTextView = (TextView)findViewById(R.id.current_pick);


        //Цвета
        RadioButton redRadioButton = (RadioButton)findViewById(R.id.radio_red);
        redRadioButton.setOnClickListener(radioButtonClickListener);

        RadioButton greenRadioButton = (RadioButton)findViewById(R.id.radio_green);
        greenRadioButton.setOnClickListener(radioButtonClickListener);

        RadioButton blueRadioButton = (RadioButton)findViewById(R.id.radio_blue);
        blueRadioButton.setOnClickListener(radioButtonClickListener);

        RadioButton noneRadioButton = (RadioButton)findViewById(R.id.radio_none);
        noneRadioButton.setOnClickListener(radioButtonClickListener);



    }

    View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioButton rb = (RadioButton)v;
            switch (rb.getId()) {
                case R.id.radio_red: mInfoTextView.setBackgroundColor(Color.parseColor("#ff0000"));
                    break;
                case R.id.radio_green: mInfoTextView.setBackgroundColor(Color.parseColor("#0000ff"));
                    break;
                case R.id.radio_blue: mInfoTextView.setBackgroundColor(Color.parseColor("#00ff00"));
                    break;
                case R.id.radio_none: mInfoTextView.setBackgroundColor(Color.parseColor("#ffffff"));
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    public void onProgressChanged(SeekBar SeekBars, int progress, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar SeekBars) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar SeekBars) {
        mTextView.setText(String.valueOf(SeekBars.getProgress()));
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
