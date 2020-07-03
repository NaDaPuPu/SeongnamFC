package com.pupu.seongnam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pupu.seongnam.fragment_music.RecyclerAdapterMusic;
import com.pupu.seongnam.fragment_music.RecyclerItemMusic;

public class MusicFragment extends Fragment {
    private View v;
    private RecyclerAdapterMusic adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_music, container, false);
        init();
        setup();
        return v;
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
        RecyclerItemMusic item;
        item = new RecyclerItemMusic(getString(R.string.musictitle1), getString(R.string.musiclyrics1));
        adapter.addItem(item);
        item = new RecyclerItemMusic(getString(R.string.musictitle2), getString(R.string.musiclyrics2));
        adapter.addItem(item);
        item = new RecyclerItemMusic(getString(R.string.musictitle3), getString(R.string.musiclyrics3));
        adapter.addItem(item);
        item = new RecyclerItemMusic(getString(R.string.musictitle4), getString(R.string.musiclyrics4));
        adapter.addItem(item);
        item = new RecyclerItemMusic(getString(R.string.musictitle5), getString(R.string.musiclyrics5));
        adapter.addItem(item);
        item = new RecyclerItemMusic(getString(R.string.musictitle6), getString(R.string.musiclyrics6));
        adapter.addItem(item);
        item = new RecyclerItemMusic(getString(R.string.musictitle7), getString(R.string.musiclyrics7));
        adapter.addItem(item);
        item = new RecyclerItemMusic(getString(R.string.musictitle8), getString(R.string.musiclyrics8));
        adapter.addItem(item);
        item = new RecyclerItemMusic(getString(R.string.musictitle9), getString(R.string.musiclyrics9));
        adapter.addItem(item);
        item = new RecyclerItemMusic(getString(R.string.musictitle10), getString(R.string.musiclyrics10));
        adapter.addItem(item);
        item = new RecyclerItemMusic(getString(R.string.musictitle11), getString(R.string.musiclyrics11));
        adapter.addItem(item);
        item = new RecyclerItemMusic(getString(R.string.musictitle12), getString(R.string.musiclyrics12));
        adapter.addItem(item);
    }
}