package com.suriosity.basketballscorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAPts=0;
    int teamBPts=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointsA(View view){
        teamAPts+=3;
        setAScore(teamAPts);
    }

    public void twoPointsA(View view){
        teamAPts+=2;
        setAScore(teamAPts);
    }

    public void freeThrowA(View view){
        teamAPts+=1;
        setAScore(teamAPts);
    }

    public void threePointsB(View view){
        teamBPts+=3;
        setBScore(teamBPts);
    }

    public void twoPointsB(View view){
        teamBPts+=2;
        setBScore(teamBPts);
    }

    public void freeThrowB(View view){
        teamBPts+=1;
        setBScore(teamBPts);
    }

    public void reset(View view){
        int score=0;
        setAScore(score);
        setBScore(score);
    }

    private void setAScore(int score){
        TextView teamA= (TextView) findViewById(R.id.team_a_score);
        teamA.setText("" + score);
    }

    private void setBScore(int score){
        TextView teamB= (TextView) findViewById(R.id.team_b_score);
        teamB.setText("" + score);
    }
}
