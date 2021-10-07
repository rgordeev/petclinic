package ru.itcube.petclinic.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class SomeView extends View {
    public SomeView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint defaultPaint = new Paint();

        canvas.drawLine(0, 0, canvas.getWidth(), canvas.getHeight(), defaultPaint);

        int i = 0;

        while (i < canvas.getHeight()) {
            i = i + 30;
            canvas.drawLine(0, i, canvas.getWidth(), i, defaultPaint);
        }

        Paint red = new Paint();
        red.setColor(Color.RED);
        red.setStyle(Paint.Style.FILL);

        canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, canvas.getWidth() / 3, red);

        Paint yellow = new Paint();
        yellow.setColor(Color.YELLOW);
        yellow.setStyle(Paint.Style.STROKE);
        yellow.setStrokeWidth(20);

        canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, canvas.getWidth() / 3 + 10, yellow);
    }
}
