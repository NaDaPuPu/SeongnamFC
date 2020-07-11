package com.pupu.seongnam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.pupu.seongnam.fragment_player.Player;

import java.util.ArrayList;

public class PlayerDetailActivity extends AppCompatActivity {
    private ImageView image;
    private TextView name, num, nation, position, birth, body, school;

    PlayerFragment playerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_detail);

        Intent intent = getIntent();

        image = findViewById(R.id.imageView);
        name = findViewById(R.id.player_name);
        num = findViewById(R.id.player_num);
        nation = findViewById(R.id.nationView);
        position = findViewById(R.id.positionView);
        birth = findViewById(R.id.birthView);
        body = findViewById(R.id.bodyView);
        school = findViewById(R.id.schoolView);

        int p_num = intent.getIntExtra("position", 0);

        image.setImageDrawable(playerFragment.players.get(p_num).getImage());
        name.setText(playerFragment.players.get(p_num).getName());
        num.setText(playerFragment.players.get(p_num).getB_num() + "");
        nation.setText("국적 : " + playerFragment.players.get(p_num).getNation());
        position.setText("포지션 : " + playerFragment.players.get(p_num).getPosition());
        birth.setText("생년월일 : " + playerFragment.players.get(p_num).getBirth() + " / " + playerFragment.players.get(p_num).getAge() + "세");
        body.setText("신장 : " + playerFragment.players.get(p_num).getHeight() + "cm / 체중 : " + playerFragment.players.get(p_num).getWeight() + "kg");
        if (playerFragment.players.get(p_num).getSchool() == null) {
            school.setText("출신교 : - ");
        } else {
            school.setText("출신교 : " + playerFragment.players.get(p_num).getSchool());
        }
    }
}