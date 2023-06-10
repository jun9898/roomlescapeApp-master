package com.example.roomln;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SubActivity extends AppCompatActivity {



    class Point { // 포인ㄴ트 클래스 선언.
        float x;
        float y;
        boolean check;
        int color;


        public Point(float x, float y, boolean check, int color) {
            this.x = x;
            this.y = y;
            this.check = check;
            this.color = color;
        }
    }
    class MyView extends View
    {
        public MyView(Context context) { super(context); }
        @Override
        protected void onDraw(Canvas canvas) {
            Paint p = new Paint();
            p.setStrokeWidth(15);
            for (int i = 1; i < points.size(); i++) {
                p.setColor(points.get(i).color);
                if (!points.get(i).check)
                    continue;
                canvas.drawLine(points.get(i - 1).x, points.get(i - 1).y, points.get(i).x, points.get(i).y, p);
            }
        }
        @Override
        public boolean onTouchEvent(MotionEvent event) {
            float x = event.getX();
            float y = event.getY();

            switch (event.getAction())
            {
                case MotionEvent.ACTION_DOWN:
                    points.add(new Point(x,y,false, color));
                case MotionEvent.ACTION_MOVE :
                    points.add(new Point(x,y,true, color));
                    break;
                case MotionEvent.ACTION_UP :
                    break;
            }
            invalidate();
            return true;
        }
    }
    ArrayList<Point> points = new ArrayList<Point>();
    ImageButton draw_red_btn,draw_blue_btn,draw_black_btn,clearbtn,eraser_btn;
    LinearLayout drawlinear;
    int color = Color.BLACK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        final MyView m = new MyView(this);
        /* ----- 색 변경 ------ */
        findViewById(R.id.draw_red_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = Color.RED;
            }
        });
        findViewById(R.id.draw_blue_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = Color.BLUE;
            }
        });
        findViewById(R.id.draw_black_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = Color.BLACK;
            }
        });
        findViewById(R.id.eraser_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = Color.WHITE;
            }
        });

        clearbtn = findViewById(R.id.clear_btn);
        drawlinear = findViewById(R.id.draw_linear);
        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                points.clear();
                m.invalidate();
            }
        });
        drawlinear.addView(m);
    }
}