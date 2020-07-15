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
        String pos = intent.getStringExtra("pos");

        switch (pos) {
            case "GK":
                image.setImageDrawable(playerFragment.goalkeepers.get(p_num).getImage());
                name.setText(playerFragment.goalkeepers.get(p_num).getName());
                num.setText(playerFragment.goalkeepers.get(p_num).getB_num() + "");
                nation.setText("국적 : " + playerFragment.goalkeepers.get(p_num).getNation());
                position.setText("포지션 : " + playerFragment.goalkeepers.get(p_num).getPosition());
                birth.setText("생년월일 : " + playerFragment.goalkeepers.get(p_num).getBirth() + " / " + playerFragment.goalkeepers.get(p_num).getAge() + "세");
                body.setText("신장 : " + playerFragment.goalkeepers.get(p_num).getHeight() + "cm / 체중 : " + playerFragment.goalkeepers.get(p_num).getWeight() + "kg");
                if (playerFragment.goalkeepers.get(p_num).getSchool() == null) {
                    school.setText("출신교 : - ");
                } else {
                    school.setText("출신교 : " + playerFragment.goalkeepers.get(p_num).getSchool());
                }
                break;

            case "DF":
                image.setImageDrawable(playerFragment.defences.get(p_num).getImage());
                name.setText(playerFragment.defences.get(p_num).getName());
                num.setText(playerFragment.defences.get(p_num).getB_num() + "");
                nation.setText("국적 : " + playerFragment.defences.get(p_num).getNation());
                position.setText("포지션 : " + playerFragment.defences.get(p_num).getPosition());
                birth.setText("생년월일 : " + playerFragment.defences.get(p_num).getBirth() + " / " + playerFragment.defences.get(p_num).getAge() + "세");
                body.setText("신장 : " + playerFragment.defences.get(p_num).getHeight() + "cm / 체중 : " + playerFragment.defences.get(p_num).getWeight() + "kg");
                if (playerFragment.defences.get(p_num).getSchool() == null) {
                    school.setText("출신교 : - ");
                } else {
                    school.setText("출신교 : " + playerFragment.defences.get(p_num).getSchool());
                }
                break;

            case "MF":
                image.setImageDrawable(playerFragment.midfielders.get(p_num).getImage());
                name.setText(playerFragment.midfielders.get(p_num).getName());
                num.setText(playerFragment.midfielders.get(p_num).getB_num() + "");
                nation.setText("국적 : " + playerFragment.midfielders.get(p_num).getNation());
                position.setText("포지션 : " + playerFragment.midfielders.get(p_num).getPosition());
                birth.setText("생년월일 : " + playerFragment.midfielders.get(p_num).getBirth() + " / " + playerFragment.midfielders.get(p_num).getAge() + "세");
                body.setText("신장 : " + playerFragment.midfielders.get(p_num).getHeight() + "cm / 체중 : " + playerFragment.midfielders.get(p_num).getWeight() + "kg");
                if (playerFragment.midfielders.get(p_num).getSchool() == null) {
                    school.setText("출신교 : - ");
                } else {
                    school.setText("출신교 : " + playerFragment.midfielders.get(p_num).getSchool());
                }
                break;

            case "FW":
                image.setImageDrawable(playerFragment.forwards.get(p_num).getImage());
                name.setText(playerFragment.forwards.get(p_num).getName());
                num.setText(playerFragment.forwards.get(p_num).getB_num() + "");
                nation.setText("국적 : " + playerFragment.forwards.get(p_num).getNation());
                position.setText("포지션 : " + playerFragment.forwards.get(p_num).getPosition());
                birth.setText("생년월일 : " + playerFragment.forwards.get(p_num).getBirth() + " / " + playerFragment.forwards.get(p_num).getAge() + "세");
                body.setText("신장 : " + playerFragment.forwards.get(p_num).getHeight() + "cm / 체중 : " + playerFragment.forwards.get(p_num).getWeight() + "kg");
                if (playerFragment.forwards.get(p_num).getSchool() == null) {
                    school.setText("출신교 : - ");
                } else {
                    school.setText("출신교 : " + playerFragment.forwards.get(p_num).getSchool());
                }
                break;
        }

    }
}