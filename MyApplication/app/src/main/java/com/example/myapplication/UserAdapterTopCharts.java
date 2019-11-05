package com.example.myapplication;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class UserAdapterTopCharts extends RecyclerView.Adapter<UserAdapterTopCharts.UserItemViewHolder> {
    private List<User> users;
    private Context context;

    public UserAdapterTopCharts(List<User> users, Context c) {
        this.users = users;
        this.context = c;
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    @Override
    public UserItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_user_top_charts, parent, false);

        return new UserItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserItemViewHolder holder, int position) {
        User u = users.get(position);
        Picasso.with(context)
                .load(u.avatar_url)
                .into(holder.ivAvatar);
        holder.tvLoginName.setText(u.login);
        holder.tv_diem_cao_nhat.setText(String.valueOf(u.diem_cao_nhat));
    }

    public static class UserItemViewHolder extends RecyclerView.ViewHolder {
        public TextView tvLoginName;
        public TextView tv_diem_cao_nhat;
        public ImageView ivAvatar;

        public UserItemViewHolder(View itemView) {
            super(itemView);
            tvLoginName = (TextView) itemView.findViewById(R.id.tv_login_name);
            tv_diem_cao_nhat = (TextView) itemView.findViewById(R.id.tv_diem_cao_nhat);
            ivAvatar = (ImageView) itemView.findViewById(R.id.iv_avatar);
        }
    }
}