package com.example.objectdetection.Helper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

@SuppressLint("ViewConstructor")
public class DrawGraphic extends View {

    Paint borderPaint, textPaint;
    Rect rect;
    String text;


    public DrawGraphic(Context context, Rect rect, String text) {
        super(context);
        this.rect = rect;
        this.text = text;

        borderPaint = new Paint();
        borderPaint.setColor(Color.WHITE);
        borderPaint.setStrokeWidth(10f);
        borderPaint.setStyle(Paint.Style.STROKE);

        textPaint = new Paint();
        textPaint.setColor(Color.WHITE);
        textPaint.setStrokeWidth(50f);
        textPaint.setTextSize(32f);
        textPaint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText(text, rect.centerX(), rect.centerY(), textPaint);
        canvas.drawRect(rect.left, rect.top, rect.right, rect.bottom, borderPaint);
    }
}
