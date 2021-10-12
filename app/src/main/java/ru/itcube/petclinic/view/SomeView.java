package ru.itcube.petclinic.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.view.View;

public class SomeView extends View {
    public SomeView(Context context) {
        super(context);
        Counter counter = new Counter(100000000, 100);
        counter.start();
    }

    int x = 0;
    double y = 0;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint red = new Paint();
        red.setColor(Color.RED);
        red.setStyle(Paint.Style.FILL);
        red.setStrokeWidth(5);

        canvas.drawCircle(x, (float)y, 10, red);
    }

    public void refresh() {
        if (x >= getWidth()) {
            x = 0;
        } else {
            x = x + 10;
        }
        y = Math.sin(x * Math.PI / 180) * 200 + getHeight() / 2;
    }

    class Counter extends CountDownTimer {

        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */
        public Counter(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            refresh();
            invalidate();
        }

        @Override
        public void onFinish() {

        }
    }
}
