package com.maxterminatorx.bloodlords.game_tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.maxterminatorx.bloodlords.R;

/**
 * Created by maxterminatorx on 20-Dec-17.
 */

public class GameLayout extends View {


    private int width,height;
    private Paint painter;
    private Bitmap background;

    public GameLayout(@NonNull Context context) {
        super(context);
        painter = new Paint();
        painter.setColor(Color.BLUE);
        painter.setAlpha(255);
        painter.setFakeBoldText(true);

        setVisibility(View.VISIBLE);
        background = BitmapFactory.decodeResource(context.getResources(),R.drawable.ic_launcher_background);

    }



    public void setGameSize(int w,int h){
        //super.setMinimumWidth(w);
        //super.setMinimumHeight(h);
        width=w;
        height=h;

    }


    @Override
    protected void onDraw(Canvas graphics){
        super.onDraw(graphics);
        graphics.drawColor(Color.argb(255,0,0,255));
        //graphics.drawRect(45,45,width,height,painter);

        //graphics.drawBitmap(background,500,500,null);


        //graphics.drawText("maxim",150,150,painter);

        Log.i("max","max");

        //invalidate();
    }

}
