package com.reed.spanishvocabulary.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.reed.spanishvocabulary.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private int mChapterNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button flashCardButton = (Button) findViewById(R.id.flashCardButton);
        Button multipleCButton = (Button) findViewById(R.id.multipleChoiceButton);
        Spinner chapterSpinner = (Spinner) findViewById(R.id.chapterSpinner);
        Button hangmanButton = (Button) findViewById(R.id.hangmanButton);

        final List<String> chapters = new ArrayList<>();
        chapters.add("Palabras básicas");
        chapters.add("La iglesia, la casa y el colegio");
        chapters.add("Interrogativos, palabras con ser y estar");
        chapters.add("El centro, los números y adjetivos posesivos");
        chapters.add("Verbos - ar");
        chapters.add("Verbos - er, Verbos - ir");
        chapters.add("El tiempo, el aeropuerto y los deportes");
        chapters.add("¿Qué voy a hacer?, ropa, colores y comida");
        chapters.add("¿Cómo es?, verbos reflexivos y el cuerpo");
        chapters.add("Los quehaceres, el correo, el pretérito");
        chapters.add("el pretérito");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, chapters);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chapterSpinner.setAdapter(dataAdapter);

        chapterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                setChapterNumber(parent.getSelectedItemPosition() + 1);
                //Toast.makeText(MainActivity.this, "Chapter Number: " + getChapterNumber(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                setChapterNumber(1);
            }
        });

        assert flashCardButton != null;
        flashCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Switch to Flash Card Activity
                Intent intent = new Intent(MainActivity.this, FlashCardActivity.class);
                intent.putExtra("chapterNumber", getChapterNumber());
                startActivity(intent);
            }
        });

        assert multipleCButton != null;
        multipleCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Switch to Multiple Choice Activity
                Intent intent = new Intent(MainActivity.this, MultipleChoiceActivity.class);
                intent.putExtra("chapterNumber", getChapterNumber());
                startActivity(intent);
            }
        });

        assert hangmanButton != null;
        hangmanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HangmanActivity.class);
                intent.putExtra("chapterNumber", getChapterNumber());
                //This activity will need to be passed the category when they are inserted
                intent.putExtra("category", chapters.get(getChapterNumber()));
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
