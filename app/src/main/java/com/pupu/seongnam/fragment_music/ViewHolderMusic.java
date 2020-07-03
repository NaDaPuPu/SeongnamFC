package com.pupu.seongnam.fragment_music;

import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pupu.seongnam.R;

public class ViewHolderMusic extends RecyclerView.ViewHolder {
    private TextView title, lyrics;
    private LinearLayout selectItem;
    private LinearLayout linearItem;
    private OnViewHolderItemClickListener onViewHolderItemClickListener;

    public ViewHolderMusic(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.title);
        lyrics = itemView.findViewById(R.id.lyrics);
        selectItem = itemView.findViewById(R.id.selectItem);
        linearItem = itemView.findViewById(R.id.linearItem);

        linearItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onViewHolderItemClickListener.onViewHolderItemClick();
            }
        });
    }

    public void onBind(RecyclerItemMusic item, int position, SparseBooleanArray selectedItems) {
        title.setText(item.getTitleStr());
        lyrics.setText(item.getLyricsStr());

        changeVisibility(selectedItems.get(position));
    }

    private void changeVisibility(final boolean isExpanded) {
        selectItem.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
    }

    public void setOnViewHolderItemClickListener(OnViewHolderItemClickListener onViewHolderItemClickListener) {
        this.onViewHolderItemClickListener = onViewHolderItemClickListener;
    }
}
