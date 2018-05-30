package com.example.user.birdapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TopBirdsAdapter extends ArrayAdapter<Bird> {

    public TopBirdsAdapter(Context context, ArrayList<Bird> birds) {
        super(context, 0, birds);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.birds_item, parent, false);
        }
        Bird currentBird = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentBird.getRanking().toString());

        TextView species = (TextView) listItemView.findViewById(R.id.species);
        species.setText(currentBird.getSpecies());

        TextView family = (TextView) listItemView.findViewById(R.id.family);
        family.setText(currentBird.getFamily());

        listItemView.setTag(currentBird);

        return listItemView;
    }
}




