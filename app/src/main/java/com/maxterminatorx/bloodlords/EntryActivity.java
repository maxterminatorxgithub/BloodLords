package com.maxterminatorx.bloodlords;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.maxterminatorx.bloodlords.game_tools.GameAnimation;
import com.maxterminatorx.bloodlords.game_tools.GameLayout;

public class EntryActivity extends AppCompatActivity implements View.OnClickListener{



    private Button btnStart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);




        btnStart = findViewById(R.id.btn_start_game);
        btnStart.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_start_game:

                Intent intent = new Intent(this, GameActivity.class);
                startActivity(intent);

                finish();

                return;
        }
    }
}
