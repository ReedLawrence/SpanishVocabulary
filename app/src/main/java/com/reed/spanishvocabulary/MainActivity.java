package com.reed.spanishvocabulary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private int mChapterNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button flashCardButton = (Button) findViewById(R.id.flashCardButton);
        Button multipleCButton = (Button) findViewById(R.id.multipleCButton);
        Spinner chapterSpinner = (Spinner) findViewById(R.id.chapterSpinner);

        //chapterSpinner.setOnClickListener(this);

        List<String> chapters = new ArrayList<String>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");
        chapters.add("Chapter 3");
        chapters.add("Chapter 4");
        chapters.add("Chapter 5");
        chapters.add("Chapter 6");
        chapters.add("Chapter 7");
        chapters.add("Chapter 8");
        chapters.add("Chapter 9");
        chapters.add("Chapter 10");
        chapters.add("Chapter 11");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, chapters);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chapterSpinner.setAdapter(dataAdapter);

        chapterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                setChapterNumber(parent.getSelectedItemPosition());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                setChapterNumber(1);
            }
        });

        flashCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Switch to Flash Card Activity
                Intent intent = new Intent(MainActivity.this, FlashCardActivity.class);
                intent.putExtra("chapterNumber", getChapterNumber());
                startActivity(intent);
            }
        });

        multipleCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Switch to Multiple Choice Activity
                Intent intent = new Intent(MainActivity.this, MultipleChoiceActivity.class);
                intent.putExtra("chapterNumber", getChapterNumber());
                startActivity(intent);
            }
        });
    }

    public int getChapterNumber() {
        return mChapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        mChapterNumber = chapterNumber;
    }
}
