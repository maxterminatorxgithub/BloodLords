package com.maxterminatorx.bloodlords.game_tools;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maxterminatorx on 15-Nov-17.
 */

public class GameCharacter extends Drawable{

    public static final String MOVE_FORWORD = "move_f";
    public static final String MOVE_BACKWARD = "move_b";
    public static final String MOVE_FORWORD_WITH_WEAPON = "move_f_weapon";
    public static final String MOVE_BACKWARD_WITH_WEAPON = "move_b_weapon";

    public static final String WEAPON_ON = "weapon_on";
    public static final String WEAPON_OFF = "weapon_off";

    public static final String MELEE_ATTACK = "attack";
    public static final String MELEE_ATTACK_COMBO_1 = "attack_combo_1";
    public static final String MELEE_ATTACK_COMBO_2 = "attack_combo_2";

    public static final String MELEE_ATTACK_WEAPON = "weapon_attack";
    public static final String MELEE_ATTACK_WEAPON_COMBO_1 = "weapon_attack_combo_1";
    public static final String MELEE_ATTACK_WEAPON_COMBO_2 = "weapon_attack_combo_2";



    private Map<String,GameAnimation> moves;

    private GameAnimation state;

    public GameCharacter(){
        moves = new HashMap<>();
    }

    public void addMove(String key,GameAnimation animation){
        moves.put(key,animation);
    }

    public void setState(String key){
        state = moves.get(state);
    }


    @Override
    public void draw(@NonNull Canvas canvas) {

    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return 0;
    }
}
