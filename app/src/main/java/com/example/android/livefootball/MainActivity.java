package com.example.android.livefootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int scoreTeamB;
    int scoreRedTeamA;
    int scoreRedTeamB;
    int scoreFoulTeamA;
    int scoreFoulTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayRedForTeamA(0);
        displayRedForTeamB(0);
        displayFoulForTeamA(0);
        displayFoulForTeamB(0);
    }

    /**
     * Add +1 Goal score for Team A.
     */
    public void addGoalTeamA(View V) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add +1 Red Card score for Team A.
     */
    public void redForTeamA(View V) {
        scoreRedTeamA += 1;
        displayRedForTeamA(scoreRedTeamA);
    }

    /**
     * Add +1 Foul score for Team A.
     */
    public void addFoulForTeamA(View V) {
        scoreFoulTeamA += 1;
        displayFoulForTeamA(scoreFoulTeamA);
    }

    /**
     * Add +1 Goal score for Team B.
     */
    public void addGoalTeamB(View V) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add +1 Red Card score for Team B.
     */
    public void redForTeamB(View V) {
        scoreRedTeamB += 1;
        displayRedForTeamB(scoreRedTeamB);
    }

    /**
     * Add +1 Foul score for Team B.
     */
    public void addFoulForTeamB(View V) {
        scoreFoulTeamB += 1;
        displayFoulForTeamB(scoreFoulTeamB);
    }

    /**
     * Reset Score.
     */
    public void resetScore(View V) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        scoreRedTeamA = 0;
        scoreRedTeamB = 0;
        scoreFoulTeamA = 0;
        scoreFoulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayRedForTeamA(scoreRedTeamA);
        displayRedForTeamB(scoreRedTeamB);
        displayFoulForTeamA(scoreRedTeamA);
        displayFoulForTeamB(scoreRedTeamB);
    }

    /**
     * Displays the given Goal score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreViewGoalTeamA = (TextView) findViewById(R.id.team_a_score);
        scoreViewGoalTeamA.setText(String.valueOf(score));
    }

    /**
     * Displays the given Goal score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreViewGoalTeamB = (TextView) findViewById(R.id.team_b_score);
        scoreViewGoalTeamB.setText(String.valueOf(score));
    }

    /**
     * Displays the given Red Card score for Team A.
     */
    public void displayRedForTeamA(int score) {
        TextView scoreViewRedTeamA = (TextView) findViewById(R.id.team_a_red_score);
        scoreViewRedTeamA.setText(String.valueOf(score));
    }

    /**
     * Displays the given Red Card score for Team B.
     */
    public void displayRedForTeamB(int score) {
        TextView scoreViewRedTeamB = (TextView) findViewById(R.id.team_b_red_score);
        scoreViewRedTeamB.setText(String.valueOf(score));
    }

    /**
     * Displays the given Foul score for Team A.
     */
    public void displayFoulForTeamA(int score) {
        TextView scoreViewFoulTeamA = (TextView) findViewById(R.id.team_a_foul_score);
        scoreViewFoulTeamA.setText(String.valueOf(score));
    }

    /**
     * Displays the given Foul score for Team B.
     */
    public void displayFoulForTeamB(int score) {
        TextView scoreViewFoulTeamB = (TextView) findViewById(R.id.team_b_foul_score);
        scoreViewFoulTeamB.setText(String.valueOf(score));
    }
}
