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

        int b_num = intent.getIntExtra("b_num", 0);

        for (int i = 0; i < playerFragment.players.size(); i++) {
            if (b_num == playerFragment.players.get(i).getB_num()) {
                image.setImageDrawable(playerFragment.players.get(i).getImage());
                name.setText(playerFragment.players.get(i).getName());
                num.setText(playerFragment.players.get(i).getB_num() + "");
                nation.setText("국적 : " + playerFragment.players.get(i).getNation());
                position.setText("포지션 : " + playerFragment.players.get(i).getPosition());
                birth.setText("생년월일 : " + playerFragment.players.get(i).getBirth() + " / " + playerFragment.players.get(i).getAge() + "세");
                body.setText("신장 : " + playerFragment.players.get(i).getHeight() + "cm / 체중 : " + playerFragment.players.get(i).getWeight() + "kg");
                if (playerFragment.players.get(i).getSchool() == null) {
                    school.setText("출신교 : - ");
                } else {
                    school.setText("출신교 : " + playerFragment.players.get(i).getSchool());
                }
            }
        }
    }
}