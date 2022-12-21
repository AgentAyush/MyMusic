package com.example.mymusic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.karumi.dexter.listener.single.PermissionListener;

public class MusicAdapter extends ArrayAdapter<String> {
    private String[] items;

    public MusicAdapter(@NonNull PermissionListener Permission, int resource, @NonNull String[] items) {
        super((Context) Permission, resource, items);
        this.items = items;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return items[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_layotu, parent, false);
        TextView t = convertView.findViewById(R.id.textView3);
        t.setText(position);

        return convertView;
    }
}
