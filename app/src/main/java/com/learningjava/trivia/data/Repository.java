package com.learningjava.trivia.data;

import com.android.volley.Request;
import com.android.volley.toolbox.JsonArrayRequest;
import com.learningjava.trivia.controller.AppController;
import com.learningjava.trivia.model.Question;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    ArrayList<Question> questionArraylist = new ArrayList<>();
    private final String url = "https://raw.githubusercontent.com/curiousily/simple-quiz/master/script/statements-data.json";

    public List<Question> getQuestions(final AnswerListAsyncResponse callBack){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url,
                null, response -> {

            for (int i = 0; i < response.length(); i++) {
                try {
                    Question question = new Question(response.getJSONArray(i).getString(0),
                            response.getJSONArray(i).getBoolean(1));
                    questionArraylist.add(question);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (null != callBack) callBack.processFinished(questionArraylist);

        }, error -> {

        });
        AppController.getInstance().addToRequestQueue(jsonArrayRequest);



        return null;
    };
}
