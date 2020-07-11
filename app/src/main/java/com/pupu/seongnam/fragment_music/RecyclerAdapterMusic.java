package com.pupu.seongnam.fragment_music;

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

import com.pupu.seongnam.R;

import java.util.ArrayList;

public class RecyclerAdapterMusic extends RecyclerView.Adapter {
    private final static int MUSIC_COUNT = 12;
    private View v;
    private ArrayList<RecyclerItemMusic> mData = new ArrayList<>();
    private SparseBooleanArray selectedItems = new SparseBooleanArray();
    private int prePosition = -1;
    public MediaPlayer mediaPlayer;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false);

        ViewHolderMusic viewHolderMusic = new ViewHolderMusic(v);

        return viewHolderMusic;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ViewHolderMusic viewHolderMusic = (ViewHolderMusic) holder;
        viewHolderMusic.onBind(mData.get(position), position, selectedItems);
        viewHolderMusic.setOnViewHolderItemClickListener(new OnViewHolderItemClickListener() {
            @Override
            public void onViewHolderItemClick() {
                Log.d("position", position + "");
                if (selectedItems.get(position)) {
                    Log.d("selectedItems.get", "running");
                    // 펼쳐진 Item을 클릭 시
                    selectedItems.delete(position);
                } else {
                    Log.d("else selectedItems.get", "running");
                    // 직전의 클릭됐던 Item의 클릭상태를 지움
                    selectedItems.delete(prePosition);
                    // 클릭한 Item의 position을 저장
                    selectedItems.put(position, true);
                }
                // 해당 포지션의 변화를 알림
                if (prePosition != -1) notifyItemChanged(prePosition);
                notifyItemChanged(position);
                // 클릭된 position 저장
                prePosition = position;

                if (mediaPlayer != null) {
                    mediaPlayer.release();
                    mediaPlayer = null;
                }

                if (selectedItems.get(position)) {
                    Log.d("selectedItems.get2", "running");
                    switch (position) {
                        case 0:
                            mediaPlayer = MediaPlayer.create(v.getContext(), R.raw.music1);
                            break;
                        case 1:
                            mediaPlayer = MediaPlayer.create(v.getContext(), R.raw.music2);
                            break;
                        case 2:
                            mediaPlayer = MediaPlayer.create(v.getContext(), R.raw.music3);
                            break;
                        case 3:
                            mediaPlayer = MediaPlayer.create(v.getContext(), R.raw.music4);
                            break;
                        case 4:
                            mediaPlayer = MediaPlayer.create(v.getContext(), R.raw.music5);
                            break;
                        case 5:
                            mediaPlayer = MediaPlayer.create(v.getContext(), R.raw.music6);
                            break;
                        case 6:
                            mediaPlayer = MediaPlayer.create(v.getContext(), R.raw.music7);
                            break;
                        case 7:
                            mediaPlayer = MediaPlayer.create(v.getContext(), R.raw.music8);
                            break;
                        case 8:
                            mediaPlayer = MediaPlayer.create(v.getContext(), R.raw.music9);
                            break;
                        case 9:
                            mediaPlayer = MediaPlayer.create(v.getContext(), R.raw.music10);
                            break;
                        case 10:
                            mediaPlayer = MediaPlayer.create(v.getContext(), R.raw.music11);
                            break;
                        case 11:
                            mediaPlayer = MediaPlayer.create(v.getContext(), R.raw.music12);
                            break;
                    }
                    mediaPlayer.start();
                }
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
