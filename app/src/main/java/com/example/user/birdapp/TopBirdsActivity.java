package com.example.user.birdapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopBirdsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birds_list);

        TopBirds topBirds = new TopBirds();
        ArrayList<Bird> list = topBirds.getList();

        TopBirdsAdapter birdAdapter = new TopBirdsAdapter(this,list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(birdAdapter);
    }

    public void onListItemClick(View listItem) {
        Bird bird = (Bird) listItem.getTag();
        Log.d("Bird Family ", bird.getFamily());

        Intent intent = new Intent(this, BirdActivity.class);
        intent.putExtra("bird", bird );
        startActivity(intent);
    }
}
