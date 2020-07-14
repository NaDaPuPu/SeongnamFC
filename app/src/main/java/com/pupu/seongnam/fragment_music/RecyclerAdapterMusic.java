package com.pupu.seongnam.fragment_music;

import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pupu.seongnam.MusicDetailActivity;
import com.pupu.seongnam.PlayerDetailActivity;
import com.pupu.seongnam.R;

import java.util.ArrayList;

public class RecyclerAdapterMusic extends RecyclerView.Adapter {
    private View v;
    private ArrayList<RecyclerItemMusic> mData = new ArrayList<>();
    public MediaPlayer mediaPlayer;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false);
        return new ViewHolderMusic(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ViewHolderMusic viewHolderMusic = (ViewHolderMusic) holder;
        viewHolderMusic.onBind(mData.get(position), position);
        viewHolderMusic.setOnViewHolderItemClickListener(new OnViewHolderItemClickListener() {
            @Override
            public void onViewHolderItemClick() {
                Intent intent = new Intent(v.getContext(), MusicDetailActivity.class);
                intent.putExtra("position", position);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void addItem(RecyclerItemMusic item) {
        mData.add(item);
    }
}
