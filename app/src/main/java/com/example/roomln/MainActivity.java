package com.example.roomln;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
public class MainActivity extends AppCompatActivity {
    private static final long START_TIME_IN_MILLIS = 4200000;
    private TextView mTextViewCountDown;
    private Button mButtonStartPause,reset1,reset2,reset3,reset4;
    private ImageButton eheqhrl,pen;
    private CountDownTimer mCountDownTimer;
    private EditText hint;
    private boolean mTimerRunning;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    private static final long hintnumber = 5;
    private TextView hint5;
    int a = (int) (hintnumber);
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextViewCountDown = findViewById(R.id.text_view_countdown);
        mButtonStartPause = findViewById(R.id.button_start_pause);
        eheqhrl = findViewById(R.id.eheqhrl);
        pen = findViewById(R.id.pen);
        hint = findViewById(R.id.hint);
        hint5 = findViewById(R.id.hint5);
        reset1 = findViewById(R.id.reset_button1);
        reset2 = findViewById(R.id.reset_button2);
        reset3 = findViewById(R.id.reset_button3);
        reset4 = findViewById(R.id.reset_button4);

        reset1.setEnabled(false);
        reset2.setEnabled(false);
        reset4.setEnabled(false);

        pen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent= new Intent( MainActivity.this, SubActivity.class );
                startActivity(intent);

            }
        });

        reset3.setOnClickListener(new View.OnClickListener() { // 구석에 숨겨진 버튼 3번 누르면 앱 초기화.
            @Override
            public void onClick(View view) {
                reset4.setEnabled(true);
                reset3.setEnabled(false);
            }
        });

        reset4.setOnClickListener(new View.OnClickListener() { // 구석에 숨겨진 버튼 3번 누르면 앱 초기화.
            @Override
            public void onClick(View view) {
                reset2.setEnabled(true);
                reset4.setEnabled(false);
            }
        });

        reset2.setOnClickListener(new View.OnClickListener() { // 구석에 숨겨진 버튼 3번 누르면 앱 초기화.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"3", Toast.LENGTH_SHORT).show();
                reset1.setEnabled(true);
                reset2.setEnabled(false);
            }
        });

        reset1.setOnClickListener(new View.OnClickListener() {  // 구석에 숨겨진 버튼 3번 누르면 앱 초기화.
            @Override
            public void onClick(View view) {
                mCountDownTimer.cancel();
                mCountDownTimer = null;
                mTimerRunning = false;
                mTimeLeftInMillis = 4200000;
                mButtonStartPause.setText("Start");
                mButtonStartPause.setVisibility(View.VISIBLE);
                hint5.setText("5");
                hint.setText(null);
                a = 5;
                mTextViewCountDown.setText("00:70:00");
                reset1.setEnabled(false);
                reset3.setEnabled(true);




            }
        });

        hint.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == event.KEYCODE_ENTER)
                    return true;
                return false;
            }
        });


        eheqhrl.setOnClickListener(new View.OnClickListener() {

            /**************** 힌트코드 입력하면 해당하는 힌트 띄우는 코드 및 힌트 1개 차감. ********************/
            @Override
            public void onClick(View view) {
                String hintdata = hint.getText().toString();

                if (a > 0) {


                    if ("1010".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);
                        a--;


                        Intent intent = new Intent(MainActivity.this, A001.class);
                        startActivity(intent);
                    } else if ("1108".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A002.class);
                        startActivity(intent);
                        a--;


                    } else if ("1111".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A003.class);
                        startActivity(intent);
                        a--;


                    } else if ("1222".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A004.class);
                        startActivity(intent);
                        a--;


                    } else if ("1621".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A005.class);
                        startActivity(intent);
                        a--;


                    }

                    else if ("2721".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A006.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("3122".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A007.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("3381".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A008.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("4875".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A009.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("5155".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A010.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("5999".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A011.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("6107".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A012.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("6421".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A013.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("7174".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A014.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("8138".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A015.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("8711".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A016.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("9001".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A017.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("9199".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A018.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("9209".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A019.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("2500".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A020.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("7092".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a - 1);
                        hint5.setText(hintn);


                        Intent intent = new Intent(MainActivity.this, A021.class);
                        startActivity(intent);
                        a--;


                    }
                    else if ("0000".equals(hintdata)) {
                        Intent intent = new Intent(MainActivity.this, A022.class);
                        startActivity(intent);
                    }
                    else if ("a11111".equals(hintdata)) {


                        String hintn = String.format(Locale.getDefault(), "%d", a + 1);
                        hint5.setText(hintn);
                        a++;


                    }


                } else {

                }

            }
        });




        mButtonStartPause.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 때 타이머 흐르게하기.
            @Override
            public void onClick(View v) {
                if (mTimerRunning) {
                    pauseTimer();
                } else {
                    startTimer();
                }
            }
        });
        updateCountDownText();
    }
    private void startTimer() { // 시작버튼 눌렀을때
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }
            @Override
            public void onFinish() {
                mTimerRunning = false;
                mButtonStartPause.setText("Start"); // 시작버튼 눌렀을때 버튼 숨기기.
                mButtonStartPause.setVisibility(View.INVISIBLE);
            }
        }.start();
        mTimerRunning = true;
        mButtonStartPause.setText("pause"); // 타이머 멈춤버튼 눌렀을때 버튼 숨기기.
        mButtonStartPause.setVisibility(View.INVISIBLE);
    }
    private void pauseTimer() {
        mCountDownTimer.cancel();
        mTimerRunning = false;
        mButtonStartPause.setText("Start");
        mButtonStartPause.setVisibility(View.INVISIBLE);
    }

    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;
        int hour = (int) (mTimeLeftInMillis * 0);
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d:%02d", hour, minutes, seconds);
        mTextViewCountDown.setText(timeLeftFormatted);
    }
}
