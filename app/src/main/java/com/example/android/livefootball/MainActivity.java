package com.example.android.livefootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int scoreRedTeamA = 0;
    int scoreRedTeamB = 0 ;
    int scoreFoulTeamA = 0;
    int scoreFoulTeamB = 0;


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

    public void addGoalTeamA (View V){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA (scoreTeamA);


    }

    /**
     * Add +1 Red Card score for Team A.
     */
    public void redForTeamA (View V){
        scoreRedTeamA = scoreRedTeamA + 1;
        displayRedForTeamA (scoreRedTeamA);

    }

    /**
     * Add +1 Foul score for Team A.
     */
    public void addFoulForTeamA (View V){
        scoreFoulTeamA = scoreFoulTeamA + 1;
        displayFoulForTeamA (scoreFoulTeamA);


    }
    /**
     * Add +1 Goal score for Team B.
     */
    public void addGoalTeamB (View V){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB (scoreTeamB);

    }
    /**
     * Add +1 Red Card score for Team B.
     */
    public void redForTeamB (View V){
        scoreRedTeamB = scoreRedTeamB + 1;
        displayRedForTeamB (scoreRedTeamB);


    }
    /**
     * Add +1 Foul score for Team B.
     */
    public void addFoulForTeamB (View V){
        scoreFoulTeamB = scoreFoulTeamB + 1;
        displayFoulForTeamB (scoreFoulTeamB);

    }

    /**
     * Reset Score.
     */
    public void resetScore (View V){
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
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Goal score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Red Card score for Team A.
     */
    public void displayRedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Red Card score for Team B.
     */
    public void displayRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Foul score for Team A.
     */
    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Foul score for Team B.
     */
    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul_score);
        scoreView.setText(String.valueOf(score));
    }
}
