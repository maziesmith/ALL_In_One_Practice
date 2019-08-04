package com.bikloo.allinonepractice;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class AnimalAdapter extends BaseAdapter {
    Animal array[];

    public AnimalAdapter(Animal[] array) {
        this.array = array;
    }

    @Override
    public int getCount() {
        return array.length;
    }

    @Override
    public Animal getItem(int i) {
        return array[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        
        return null;
    }
}
