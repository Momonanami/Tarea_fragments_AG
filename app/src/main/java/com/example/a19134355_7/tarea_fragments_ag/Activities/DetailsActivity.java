package com.example.a19134355_7.tarea_fragments_ag.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.a19134355_7.tarea_fragments_ag.Fragments.DetailsFragment;
import com.example.a19134355_7.tarea_fragments_ag.R;

public class DetailsActivity  extends AppCompatActivity
{
    private String text;
    private String para1;
    private String de1;
    private String cuerpo1;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        if(getIntent().getExtras() != null)
        {
            text = getIntent().getStringExtra("text");
        }
        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
        detailsFragment.renderText(text);

    }
}
