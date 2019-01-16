package com.example.shruti.besa_application_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;

    CSVFileWriter csv;
    StringBuffer filePath;
    File file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Save button
        button = (Button)findViewById(R.id.enter_button_1);
        //Edit Text
        editText = (EditText)findViewById(R.id.name);

        filePath = new StringBuffer();
        //filePath.append("/sdcard/abc.csv");
        filePath.append("/StudentInfo.csv");
        //filePath.append("/Users/Shruti/Desktop/BESA-App-Project/StudentInfo.csv");
        file = new File(filePath.toString());

        csv = new CSVFileWriter(file);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                csv.writeHeader(editText.getText().toString());
                openActivity2();
            }

        });
    }

    public void openActivity2(){
        Intent intent = new Intent(this, Page2.class);
        startActivity(intent);
    }
}
