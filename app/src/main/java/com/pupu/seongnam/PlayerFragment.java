package com.pupu.seongnam;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pupu.seongnam.fragment_player.Defence;
import com.pupu.seongnam.fragment_player.Player;
import com.pupu.seongnam.fragment_player.RecyclerAdapterPlayer;
import com.pupu.seongnam.fragment_player.RecyclerItemPlayer;

import java.time.LocalDate;
import java.util.ArrayList;

public class PlayerFragment extends Fragment {
    private View v;
    private RecyclerAdapterPlayer adapter;
    public static ArrayList<Player> players = new ArrayList();

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_player, container, false);
        init();
        setup();
        return v;
    }

    private void init() {
        RecyclerView recyclerView = v.findViewById(R.id.playerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(v.getContext(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new RecyclerAdapterPlayer();
        recyclerView.setAdapter(adapter);

        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), 1));
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void setup() {
        players.add(new Defence(2, "요바노비치", "독일",
                LocalDate.of(1989, 5, 3), 31, 185, 77, null, getResources().getDrawable(R.drawable.num_2)));
        players.add(new Defence(4, "이창용", "대한민국",
                LocalDate.of(1990, 8, 27), 30, 180, 76, "용인대", getResources().getDrawable(R.drawable.num_4)));
        players.add(new Defence(6, "안영규", "대한민국",
                LocalDate.of(1989, 12, 4), 31, 185, 79, "울산대", getResources().getDrawable(R.drawable.num_6)));
        players.add(new Defence(13, "박태민", "대한민국",
                LocalDate.of(1986, 1, 21), 34, 180, 74, "연세대", getResources().getDrawable(R.drawable.num_13)));
        players.add(new Defence(20, "연제운", "대한민국",
                LocalDate.of(1994, 8, 28), 26, 185, 78, "선문대", getResources().getDrawable(R.drawable.num_20)));
        players.add(new Defence(32, "이태희", "대한민국",
                LocalDate.of(1992, 6, 16), 28, 181, 66, "숭실대", getResources().getDrawable(R.drawable.num_32)));
        players.add(new Defence(34, "최지묵", "대한민국",
                LocalDate.of(1998, 10, 9), 22, 178, 70, "울산대", getResources().getDrawable(R.drawable.num_34)));
        players.add(new Defence(35, "마상훈", "대한민국",
                LocalDate.of(1991, 7, 25), 29, 183, 79, "순천고", getResources().getDrawable(R.drawable.num_35)));
        players.add(new Defence(40, "임승겸", "대한민국",
                LocalDate.of(1995, 4, 26), 25, 185, 78, "현대고", getResources().getDrawable(R.drawable.num_40)));

        for (int i = 0; i < players.size(); i++) {
            RecyclerItemPlayer item = new RecyclerItemPlayer(players.get(i).getName(), players.get(i).getB_num());
            adapter.additem(item);
        }
    }
}