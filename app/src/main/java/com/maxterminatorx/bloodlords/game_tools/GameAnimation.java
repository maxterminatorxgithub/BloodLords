package com.maxterminatorx.bloodlords.game_tools;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by maxterminatorx on 15-Nov-17.
 */

public class GameAnimation extends Drawable{

    private int xcenter,ycenter;
    private Bitmap[] data;
    private int currentScene;

    public GameAnimation(Bitmap data[]){
        this.data=data;
        xcenter = ycenter = currentScene = 0;
    }


    public synchronized void next(){
        currentScene++;
        if(currentScene >= data.length)
            currentScene = 0;
    }



    @Override
    public void draw(@NonNull Canvas canvas) {
        float x = xcenter - data[currentScene].getWidth()/2
                ,y = ycenter - data[currentScene].getHeight()/2;
        canvas.drawBitmap(data[currentScene],x,y,null);
    }

    @Override
    public void setAlpha(int i) {

    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return 0;
    }
}
