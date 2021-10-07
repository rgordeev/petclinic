package ru.itcube.petclinic.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class SomeView extends View {
    public SomeView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint red = new Paint();
        red.setColor(Color.RED);
        red.setStyle(Paint.Style.FILL);
        red.setStrokeWidth(5);

        int w = canvas.getWidth();

        int[] x = new int[w / 2];
        for (int i = 0; i < x.length; i ++) {
            x[i] = (- w / 2) + 2 * i;
        }

        int h = canvas.getHeight();
        int[] y = new int[x.length];

        for(int i = 0; i < y.length; i++) {
            y[i] = h/2 - x[i] * x[i] / 100;
        }

        for (int i = 0; i < x.length; i++) {
            canvas.drawCircle(x[i] + w/2, y[i], 4, red);
        }

    }
}
