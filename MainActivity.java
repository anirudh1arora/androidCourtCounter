package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    int teamAvalue=0;
    int teamBvalue=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void increment3(View view)
    {
        teamAvalue +=3;
        displayForTeamA(teamAvalue);
    }
    public void increment2(View view)
    {   teamAvalue +=2;
        displayForTeamA(teamAvalue);
    }
    public void increment1(View view)
    {
        teamAvalue +=1;
        displayForTeamA(teamAvalue);
    }

    public void increment3B(View view)
    {
        teamBvalue +=3;
        displayForTeamB(teamBvalue);
    }
    public void increment2B(View view)
    {   teamBvalue +=2;
        displayForTeamB(teamBvalue);
    }
    public void increment1B(View view)
    {
        teamBvalue +=1;
        displayForTeamB(teamBvalue);
    }
    public void reset(View view)
    {
        teamBvalue =0;
        teamAvalue =0;
        displayForTeamB(teamBvalue);
        displayForTeamA(teamAvalue);
    }
}
