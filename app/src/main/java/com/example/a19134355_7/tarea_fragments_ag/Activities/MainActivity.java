package com.example.a19134355_7.tarea_fragments_ag.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.a19134355_7.tarea_fragments_ag.Fragments.DataFragment;
import com.example.a19134355_7.tarea_fragments_ag.Fragments.DetailsFragment;
import com.example.a19134355_7.tarea_fragments_ag.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener {
    private boolean isMultiPanel;
    private Correo correo;
    private Correo correo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        correo = new Correo ("-> Ebay: Bienvenido a ebay!!","atsuko@gmail.com","ebay@gmail.com","Hola estimada usuaria, te queremos dar la bienvenida a la plataforma de ebay.Porfavor revisa nuestra web para las ofertas");
        correo2 = new Correo ("-> AMAZON: 30% DE DESCUENTO!","atsuko@gmail.com","Amazon@gmail.com","Atsuko :  Tienes un cupon de un 30% de descuento en tus proximas compras.Aprovecha antes que se acabe!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMultiPanel();
    }
@Override
    public void sendData(String text)
    {
        if( text == "-> Ebay: Bienvenido a ebay!!")
        {
            if(isMultiPanel)
            {
                    DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
                    Log.i("se fue al if", "");
                    detailsFragment.renderText("Asunto :"+text);
                    detailsFragment.renderTextpara("Para :"+correo.para);
                    detailsFragment.renderTextde("De :"+correo.de);
                    detailsFragment.renderTextcuerpo("  "+correo.cuerpo);

            }else
            {
                Intent intent =  new Intent (this,DetailsActivity.class);
                intent.putExtra("text",text);
                startActivity(intent);
            }
        }else
        {
            if(isMultiPanel)
            {
                DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
                Log.i("se fue al if", "");
                detailsFragment.renderText("Asunto :"+text);
                detailsFragment.renderTextpara("Para :"+correo2.para);
                detailsFragment.renderTextde("De :"+correo2.de);
                detailsFragment.renderTextcuerpo("  "+correo2.cuerpo);

            }else
            {
                Intent intent =  new Intent (this,DetailsActivity.class);
                intent.putExtra("text",text);
                startActivity(intent);
            }
        }

    }
    private void setMultiPanel ()
    {
        isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.detailsFragment) != null );
    }

    class Correo
    {
        String asunto;
        String para;
        String de;
        String cuerpo;

        public Correo (String asunto, String para, String de, String cuerpo )
        {
            this.asunto = asunto;
            this.para = para;
            this.de=de;
            this.cuerpo = cuerpo;
        }
        public String getAsunto() {
            return asunto;
        }

        public void setAsunto(String asunto) {
            this.asunto = asunto;
        }

        public String getPara() {
            return para;
        }

        public void setPara(String para) {
            this.para = para;
        }

        public String getDe() {
            return de;
        }

        public void setDe(String de) {
            this.de = de;
        }

        public String getCuerpo() {
            return cuerpo;
        }

        public void setCuerpo(String cuerpo) {
            this.cuerpo = cuerpo;
        }

    }
}
