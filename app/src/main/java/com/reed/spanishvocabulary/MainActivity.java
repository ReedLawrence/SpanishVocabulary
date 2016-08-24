package com.reed.spanishvocabulary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mFlashCardButton;
    private Button mMultipleCButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFlashCardButton = (Button) findViewById(R.id.flashCardButton);
        mMultipleCButton = (Button) findViewById(R.id.multipleCButton);

        mFlashCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Switch to Flash Card Activity
                Intent intent = new Intent(MainActivity.this, FlashCardActivity.class);
                startActivity(intent);
            }
        });

        mMultipleCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Switch to Multiple Choice Activity
                Intent intent = new Intent(MainActivity.this, MultipleChoiceActivity.class);
                startActivity(intent);
            }
        });
    }
}
