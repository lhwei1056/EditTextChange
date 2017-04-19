package com.example.lhwei.testapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lhwei on 2017/1/24.
 */

public class selfView extends View {

    public selfView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super()之前相当于在画view前 做的准备
        super.onDraw(canvas);
        //super()之后为画view后做的动作
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawColor(Color.RED);
        canvas.drawCircle(350,500,300,paint);
    }
}
