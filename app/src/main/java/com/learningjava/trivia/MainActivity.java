package com.learningjava.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.learningjava.trivia.controller.AppController;
import com.learningjava.trivia.data.AnswerListAsyncResponse;
import com.learningjava.trivia.data.Repository;
import com.learningjava.trivia.model.Question;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Question> questions =  new Repository().getQuestions(questionArrayList ->
                Log.d("QUESTION-LIST", "onCreate(): " + questionArrayList));
    }

}