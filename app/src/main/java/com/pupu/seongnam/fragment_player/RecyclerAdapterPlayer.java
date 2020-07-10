package com.pupu.seongnam.fragment_player;

import android.content.Intent;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pupu.seongnam.PlayerDetailActivity;
import com.pupu.seongnam.R;

import java.util.ArrayList;

public class RecyclerAdapterPlayer extends RecyclerView.Adapter {
    private View v;
    private ArrayList<RecyclerItemPlayer> mData = new ArrayList<>();
    private SparseBooleanArray selectedItems = new SparseBooleanArray();

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_player, parent, false);
        return new ViewHolderPlayer(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ViewHolderPlayer viewHolderPlayer = (ViewHolderPlayer) holder;
        viewHolderPlayer.onBind(mData.get(position), position, selectedItems);
        viewHolderPlayer.setOnViewHolderItemClickListener(new OnViewHolderItemClickListener() {
            @Override
            public void onViewHolderItemClick() {
                Intent intent = new Intent(v.getContext(), PlayerDetailActivity.class);
                intent.putExtra("b_num", mData.get(position).getB_numInt());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void additem(RecyclerItemPlayer item) {
        mData.add(item);
    }
}
