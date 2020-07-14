package com.pupu.seongnam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.pupu.seongnam.fragment_music.Music;
import com.pupu.seongnam.fragment_music.RecyclerAdapterMusic;
import com.pupu.seongnam.fragment_music.RecyclerItemMusic;

import java.util.ArrayList;

public class MusicFragment extends Fragment {
    private View v;
    private RecyclerAdapterMusic adapter;
    public static ArrayList<Music> musics = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_music, container, false);
        init();
        setup();
        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
        if (adapter.mediaPlayer != null) {
            adapter.mediaPlayer.stop();
        }
    }

    private void init() {
        RecyclerView recyclerView = v.findViewById(R.id.musicView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(v.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new RecyclerAdapterMusic();
        recyclerView.setAdapter(adapter);

        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), 1));
    }

    private void setup() {
        if (musics.size() == 0) {
            musics.add(new Music(getString(R.string.musictitle1), getString(R.string.musiclyrics1), R.raw.music1));
            musics.add(new Music(getString(R.string.musictitle2), getString(R.string.musiclyrics2), R.raw.music2));
            musics.add(new Music(getString(R.string.musictitle3), getString(R.string.musiclyrics3), R.raw.music3));
            musics.add(new Music(getString(R.string.musictitle4), getString(R.string.musiclyrics4), R.raw.music4));
            musics.add(new Music(getString(R.string.musictitle5), getString(R.string.musiclyrics5), R.raw.music5));
            musics.add(new Music(getString(R.string.musictitle6), getString(R.string.musiclyrics6), R.raw.music6));
            musics.add(new Music(getString(R.string.musictitle7), getString(R.string.musiclyrics7), R.raw.music7));
            musics.add(new Music(getString(R.string.musictitle8), getString(R.string.musiclyrics8), R.raw.music8));
            musics.add(new Music(getString(R.string.musictitle9), getString(R.string.musiclyrics9), R.raw.music9));
            musics.add(new Music(getString(R.string.musictitle10), getString(R.string.musiclyrics10), R.raw.music10));
            musics.add(new Music(getString(R.string.musictitle11), getString(R.string.musiclyrics11), R.raw.music11));
            musics.add(new Music(getString(R.string.musictitle12), getString(R.string.musiclyrics12), R.raw.music12));
        }

        for (int i = 0; i < musics.size(); i++) {
            RecyclerItemMusic item = new RecyclerItemMusic(musics.get(i).getTitle(), musics.get(i).getLyrics());
            adapter.addItem(item);
        }
    }
}