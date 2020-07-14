package com.pupu.seongnam.fragment_music;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pupu.seongnam.R;

public class ViewHolderMusic extends RecyclerView.ViewHolder {
    private TextView title;
    private OnViewHolderItemClickListener onViewHolderItemClickListener;

    public ViewHolderMusic(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.title);

        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onViewHolderItemClickListener.onViewHolderItemClick();
            }
        });
    }

    public void onBind(RecyclerItemMusic item, int position) {
        title.setText(item.getTitleStr());
    }

    public void setOnViewHolderItemClickListener(OnViewHolderItemClickListener onViewHolderItemClickListener) {
        this.onViewHolderItemClickListener = onViewHolderItemClickListener;
    }
}
