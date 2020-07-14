package com.pupu.seongnam.fragment_player;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pupu.seongnam.R;

public class ViewHolderPlayer extends RecyclerView.ViewHolder {
    private TextView name, num;
    private LinearLayout linearItem;
    private OnViewHolderItemClickListener onViewHolderItemClickListener;

    public ViewHolderPlayer(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.player_name);
        num = itemView.findViewById(R.id.player_num);
        linearItem = itemView.findViewById(R.id.linearItem);

        linearItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onViewHolderItemClickListener.onViewHolderItemClick();
            }
        });
    }

    public void onBind(RecyclerItemPlayer item, int position) {
        name.setText(item.getNameStr());
        num.setText(item.getB_numInt() + "");
    }

    public void setOnViewHolderItemClickListener(OnViewHolderItemClickListener onViewHolderItemClickListener) {
        this.onViewHolderItemClickListener = onViewHolderItemClickListener;
    }
}
