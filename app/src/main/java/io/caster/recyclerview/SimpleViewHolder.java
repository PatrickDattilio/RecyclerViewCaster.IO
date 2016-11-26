package io.caster.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class SimpleViewHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public SimpleViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.textView);
    }

    public void bindData(String data) {
        textView.setText(data);
    }
}
