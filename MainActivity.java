package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


// MainActivity.java
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NoteAdapter noteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        noteAdapter = new NoteAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(noteAdapter);



        // 더미 데이터 추가 (실제 앱에서는 데이터베이스 또는 다른 소스에서 데이터를 가져옵니다.)
        List<Note> dummyData = getDummyData();
        noteAdapter.setNotes(dummyData);
    }

    private List<Note> getDummyData() {
        List<Note> dummyData = new ArrayList<>();
        dummyData.add(new Note("제목 1", "내용 1"));
        dummyData.add(new Note("제목 2", "내용 2"));
        // 추가적인 더미 데이터 추가
        return dummyData;
    }
}
