package com.maxterminatorx.bloodlords;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.WindowManager;

import com.maxterminatorx.bloodlords.game_tools.GameLayout;

/**
 * Created by maxterminatorx on 20-Dec-17.
 */

public class GameActivity extends AppCompatActivity {



    private GameLayout gameLayout;

    private static class ScreenSize{

        static int screenWidth,screenHeight;

        static void initSize(AppCompatActivity c){
            Display d = c.getWindowManager().getDefaultDisplay();
            screenHeight = d.getWidth();
            screenHeight = d.getHeight();
        }
    }

    @Override
    public void onCreate(Bundle b){
        super.onCreate(b);

        ScreenSize.initSize(this);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        gameLayout = new GameLayout(this);

        setContentView(gameLayout);
        gameLayout.setGameSize(ScreenSize.screenWidth,ScreenSize.screenHeight);



        //gameLayout.draw(new Canvas(Bitmap.createBitmap(500,500, Bitmap.Config.ARGB_8888)));




    }

}
