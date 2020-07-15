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

import com.pupu.seongnam.fragment_music.RecyclerItemMusic;
import com.pupu.seongnam.fragment_player.Defence;
import com.pupu.seongnam.fragment_player.Forward;
import com.pupu.seongnam.fragment_player.Goalkeeper;
import com.pupu.seongnam.fragment_player.Midfielder;
import com.pupu.seongnam.fragment_player.Player;
import com.pupu.seongnam.fragment_player.RecyclerAdapterPlayer;
import com.pupu.seongnam.fragment_player.RecyclerItemPlayer;

import java.time.LocalDate;
import java.util.ArrayList;

public class PlayerFragment extends Fragment {
    private View v;
    private RecyclerAdapterPlayer adapter1, adapter2, adapter3, adapter4;
    public static ArrayList<Player> goalkeepers = new ArrayList<>();
    public static ArrayList<Player> defences = new ArrayList<>();
    public static ArrayList<Player> forwards = new ArrayList<>();
    public static ArrayList<Player> midfielders = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_player, container, false);
        init();
        setup();
        return v;
    }

    private void init() {
        RecyclerView gkView = v.findViewById(R.id.gkView);
        RecyclerView dfView = v.findViewById(R.id.dfView);
        RecyclerView mfView = v.findViewById(R.id.mfView);
        RecyclerView fwView = v.findViewById(R.id.fwView);

        GridLayoutManager gridLayoutManager1 = new GridLayoutManager(v.getContext(), 3);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(v.getContext(), 3);
        GridLayoutManager gridLayoutManager3 = new GridLayoutManager(v.getContext(), 3);
        GridLayoutManager gridLayoutManager4 = new GridLayoutManager(v.getContext(), 3);

        gkView.setLayoutManager(gridLayoutManager1);
        dfView.setLayoutManager(gridLayoutManager2);
        mfView.setLayoutManager(gridLayoutManager3);
        fwView.setLayoutManager(gridLayoutManager4);

        adapter1 = new RecyclerAdapterPlayer();
        adapter2 = new RecyclerAdapterPlayer();
        adapter3 = new RecyclerAdapterPlayer();
        adapter4 = new RecyclerAdapterPlayer();

        gkView.setAdapter(adapter1);
        dfView.setAdapter(adapter2);
        mfView.setAdapter(adapter3);
        fwView.setAdapter(adapter4);

        gkView.addItemDecoration(new DividerItemDecoration(getContext(), 1));
        dfView.addItemDecoration(new DividerItemDecoration(getContext(), 1));
        mfView.addItemDecoration(new DividerItemDecoration(getContext(), 1));
        fwView.addItemDecoration(new DividerItemDecoration(getContext(), 1));
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void setup() {
        if (goalkeepers.size() == 0) {
            goalkeepers.add(new Goalkeeper(1, "전종혁", "대한민국",
                    LocalDate.of(1996, 3, 21), 24, 186, 80, "연세대", getResources().getDrawable(R.drawable.num_1)));
            goalkeepers.add(new Goalkeeper(31, "허지웅", "대한민국",
                    LocalDate.of(1998, 5, 12), 22, 185, 70, "청주대", getResources().getDrawable(R.drawable.num_31)));
            goalkeepers.add(new Goalkeeper(41, "김영광", "대한민국",
                    LocalDate.of(1983, 6, 28), 37, 184, 86, "한려대", getResources().getDrawable(R.drawable.num_41)));
        }

        if (defences.size() == 0) {
            defences.add(new Defence(2, "요바노비치", "독일",
                    LocalDate.of(1989, 5, 3), 31, 185, 77, null, getResources().getDrawable(R.drawable.num_2)));
            defences.add(new Defence(4, "이창용", "대한민국",
                    LocalDate.of(1990, 8, 27), 30, 180, 76, "용인대", getResources().getDrawable(R.drawable.num_4)));
            defences.add(new Defence(6, "안영규", "대한민국",
                    LocalDate.of(1989, 12, 4), 31, 185, 79, "울산대", getResources().getDrawable(R.drawable.num_6)));
            defences.add(new Defence(13, "박태민", "대한민국",
                    LocalDate.of(1986, 1, 21), 34, 180, 74, "연세대", getResources().getDrawable(R.drawable.num_13)));
            defences.add(new Defence(20, "연제운", "대한민국",
                    LocalDate.of(1994, 8, 28), 26, 185, 78, "선문대", getResources().getDrawable(R.drawable.num_20)));
            defences.add(new Defence(32, "이태희", "대한민국",
                    LocalDate.of(1992, 6, 16), 28, 181, 66, "숭실대", getResources().getDrawable(R.drawable.num_32)));
            defences.add(new Defence(34, "최지묵", "대한민국",
                    LocalDate.of(1998, 10, 9), 22, 178, 70, "울산대", getResources().getDrawable(R.drawable.num_34)));
            defences.add(new Defence(35, "마상훈", "대한민국",
                    LocalDate.of(1991, 7, 25), 29, 183, 79, "순천고", getResources().getDrawable(R.drawable.num_35)));
            defences.add(new Defence(40, "임승겸", "대한민국",
                    LocalDate.of(1995, 4, 26), 25, 185, 78, "현대고", getResources().getDrawable(R.drawable.num_40)));
        }

        if (midfielders.size() == 0) {
            midfielders.add(new Midfielder(3, "박수일", "대한민국",
                    LocalDate.of(1996, 2, 22), 24, 178, 68, "광주대", getResources().getDrawable(R.drawable.num_3)));
            midfielders.add(new Midfielder(5, "임선영", "대한민국",
                    LocalDate.of(1988, 3, 21), 32, 185, 78, "수원대", getResources().getDrawable(R.drawable.num_5)));
            midfielders.add(new Midfielder(7, "권순형", "대한민국",
                    LocalDate.of(1986, 6, 16), 34, 176, 73, "고려대", getResources().getDrawable(R.drawable.num_7)));
            midfielders.add(new Midfielder(11, "서보민", "대한민국",
                    LocalDate.of(1990, 6, 22), 30, 175, 64, "관동대", getResources().getDrawable(R.drawable.num_11)));
            midfielders.add(new Midfielder(14, "김동현", "대한민국",
                    LocalDate.of(1997, 6, 11), 23, 182, 72, "포항제철고", getResources().getDrawable(R.drawable.num_14)));
            midfielders.add(new Midfielder(16, "이스칸데로프", "우즈베키스탄",
                    LocalDate.of(1993, 10, 16), 27, 171, 65, null, getResources().getDrawable(R.drawable.num_16)));
            midfielders.add(new Midfielder(17, "최오백", "대한민국",
                    LocalDate.of(1992, 3, 10), 28, 177, 69, "조선대", getResources().getDrawable(R.drawable.num_17)));
            midfielders.add(new Midfielder(22, "윤용호", "대한민국",
                    LocalDate.of(1996, 3, 6), 24, 173, 68, "한양대", getResources().getDrawable(R.drawable.num_22)));
            midfielders.add(new Midfielder(25, "김기열", "대한민국",
                    LocalDate.of(1998, 11, 14), 22, 176, 65, "풍생고", getResources().getDrawable(R.drawable.num_25)));
            midfielders.add(new Midfielder(27, "유인수", "대한민국",
                    LocalDate.of(1994, 12, 28), 24, 177, 69, "광운대", getResources().getDrawable(R.drawable.num_27)));
            midfielders.add(new Midfielder(28, "박태준", "대한민국",
                    LocalDate.of(1999, 1, 19), 21, 175, 62, "풍생고", getResources().getDrawable(R.drawable.num_28)));
            midfielders.add(new Midfielder(30, "전승민", "대한민국",
                    LocalDate.of(2000, 12, 15), 21, 174, 69, "용인대", getResources().getDrawable(R.drawable.num_30)));
            midfielders.add(new Midfielder(33, "최병찬", "대한민국",
                    LocalDate.of(1996, 4, 4), 24, 179, 69, "부경고", getResources().getDrawable(R.drawable.num_33)));
            midfielders.add(new Midfielder(37, "홍시후", "대한민국",
                    LocalDate.of(2001, 1, 8), 19, 175, 65, "상문고", getResources().getDrawable(R.drawable.num_37)));
        }

        if (forwards.size() == 0) {
            forwards.add(new Forward(9, "김현성", "대한민국",
                    LocalDate.of(1989, 9, 27), 31, 186, 77, "동북고", getResources().getDrawable(R.drawable.num_9)));
            forwards.add(new Forward(10, "토미", "크로아티아",
                    LocalDate.of(1994, 4, 4), 26, 180, 75, null, getResources().getDrawable(R.drawable.num_10)));
            forwards.add(new Forward(18, "양동현", "대한민국",
                    LocalDate.of(1986, 3, 28), 34, 186, 80, "동북고", getResources().getDrawable(R.drawable.num_18)));
            forwards.add(new Forward(19, "이재원", "대한민국",
                    LocalDate.of(1997, 2, 21), 23, 173, 66, "경희대", getResources().getDrawable(R.drawable.num_19)));
            forwards.add(new Forward(23, "나상호", "대한민국",
                    LocalDate.of(1996, 8, 12), 25, 173, 70, "단국대", getResources().getDrawable(R.drawable.num_23)));
            forwards.add(new Forward(29, "김소웅", "대한민국",
                    LocalDate.of(1999, 6, 17), 21, 180, 65, "풍생고", getResources().getDrawable(R.drawable.num_29)));
            forwards.add(new Forward(36, "김현성", "대한민국",
                    LocalDate.of(1999, 11, 3), 21, 186, 79, "광주대", getResources().getDrawable(R.drawable.num_36)));
            forwards.add(new Forward(42, "전성수", "대한민국",
                    LocalDate.of(2000, 7, 13), 20, 181, 70, "계명고", getResources().getDrawable(R.drawable.num_42)));
        }

        for (int i = 0; i < goalkeepers.size(); i++) {
            RecyclerItemPlayer item = new RecyclerItemPlayer(goalkeepers.get(i).getName(), goalkeepers.get(i).getB_num(), goalkeepers.get(i).getPosition());
            adapter1.additem(item);
        }

        for (int i = 0; i < defences.size(); i++) {
            RecyclerItemPlayer item = new RecyclerItemPlayer(defences.get(i).getName(), defences.get(i).getB_num(), defences.get(i).getPosition());
            adapter2.additem(item);
        }

        for (int i = 0; i < midfielders.size(); i++) {
            RecyclerItemPlayer item = new RecyclerItemPlayer(midfielders.get(i).getName(), midfielders.get(i).getB_num(), midfielders.get(i).getPosition());
            adapter3.additem(item);
        }

        for (int i = 0; i < forwards.size(); i++) {
            RecyclerItemPlayer item = new RecyclerItemPlayer(forwards.get(i).getName(), forwards.get(i).getB_num(), forwards.get(i).getPosition());
            adapter4.additem(item);
        }
    }
}