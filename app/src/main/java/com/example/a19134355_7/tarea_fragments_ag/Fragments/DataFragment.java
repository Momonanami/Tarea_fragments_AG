package com.example.a19134355_7.tarea_fragments_ag.Fragments;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a19134355_7.tarea_fragments_ag.R;

import java.util.ArrayList;
import java.util.List;


public class DataFragment extends Fragment
{

    private TextView textData1;
    private Button btnSend1;
    private TextView textData2;
    private Button btnSend2;
    private Button btnSend4;
    private TextView textData3;
    private TextView textData5;
    private TextView textData4;
    private DataListener callback;


    public DataFragment()
    {

    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        try {
            callback = (DataListener) context;

        }catch (Exception e)
        {
            throw new ClassCastException(context.toString()+"should implement DataListener");
        }
    }


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_data,container,false);
        textData1= view.findViewById(R.id.textView);
        textData2=view.findViewById(R.id.textView2);
        btnSend2 = view.findViewById(R.id.buttonSend2);
        btnSend4 = view.findViewById(R.id.buttonSend4);
        textData3 = view.findViewById(R.id.textViewPara);
        textData4 = view.findViewById(R.id.textViewDe);
        textData5 = view.findViewById(R.id.textViewCuerpo);
        btnSend2.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String textToSend = textData1.getText().toString();


                callback.sendData(textToSend);
            }
        });
        btnSend4.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String textToSend = textData2.getText().toString();

                callback.sendData(textToSend);
            }
        });

        return view;
    }


public interface DataListener{
    void sendData(String text);
}
}