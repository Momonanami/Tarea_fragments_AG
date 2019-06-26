package com.example.a19134355_7.tarea_fragments_ag.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a19134355_7.tarea_fragments_ag.R;

public class DetailsFragment extends Fragment {

    private TextView details;
    private TextView details2;
    private TextView details3;
    private TextView details4;

    public DetailsFragment()
    {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_details,container,false);

        details = (TextView) view.findViewById(R.id.textViewDetails);
        details2 = (TextView) view.findViewById(R.id.textViewPara);
        details3 = (TextView) view.findViewById(R.id.textViewDe);
        details4 = (TextView) view.findViewById(R.id.textViewCuerpo);

        return view;
    }


    public void renderText(String text )
    { details.setText(text);}
    public void renderTextpara(String text )
    { details2.setText(text);}
    public void renderTextde(String text )
    { details3.setText(text);}
    public void renderTextcuerpo(String text )
    { details4.setText(text);}


}
