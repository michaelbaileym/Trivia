package com.learningjava.trivia.model;

import androidx.annotation.NonNull;

public class Question {
    private String answer;
    private Boolean answerTrue;

    public Question() {
    }

    public Question(String answer, Boolean answerTrue) {
        this.answer = answer;
        this.answerTrue = answerTrue;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Boolean getAnswerTrue() {
        return answerTrue;
    }

    public void setAnswerTrue(Boolean answerTrue) {
        this.answerTrue = answerTrue;
    }

    @NonNull
    @Override
    public String toString() {
        return "Question {" +
                "\nanswer='" + answer + '\'' +
                "\nanswerTrue='" + answerTrue + "\n" +
                '}'+"\n";
    }
}
