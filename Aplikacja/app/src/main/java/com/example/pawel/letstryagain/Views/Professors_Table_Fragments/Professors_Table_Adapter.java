package com.example.pawel.letstryagain.Views.Professors_Table_Fragments;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pawel.letstryagain.Model.Business_Classes.Prowadzacy;
import com.example.pawel.letstryagain.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paweł on 23.01.2018.
 */

public class Professors_Table_Adapter extends ArrayAdapter<Prowadzacy>{

   private Context mContext;
   private int mResource;
   ArrayList<Prowadzacy> prowadzacy;

   public Professors_Table_Adapter(Context context, int resource, ArrayList<Prowadzacy> objects)
   {
       super(context,resource, objects);
       mContext = context;
       mResource = resource;
       prowadzacy = objects;
   }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String tytul = getItem(position).getTytul_naukowy();
        String imie = getItem(position).getImie();
        String nazwisko = getItem(position).getNazwisko();
        String katedra = getItem(position).getKatedra();
        String kurs = getItem(position).getKursy_prowadzone_ArrayList().get(0).getNazwa_kursu();

        //Prowadzacy prowadzacy = new Prowadzacy(pensum, imie, nazwisko, numer_pracownika, tytul, katedra);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvTytul = (TextView) convertView.findViewById(R.id.tytul_textView);
        TextView tvImie = (TextView) convertView.findViewById(R.id.imie_textView);
        TextView tvNazwisko = (TextView) convertView.findViewById(R.id.nazwisko_textView);
        TextView tvKatedra = (TextView) convertView.findViewById(R.id.katedra_textView);
        TextView tvKurs = (TextView) convertView.findViewById(R.id.kurs_textView);

        tvTytul.setText(tytul);
        tvImie.setText(imie);
        tvNazwisko.setText(nazwisko);
        tvKatedra.setText(katedra);
        tvKurs.setText(kurs);

        return convertView;
    }

}
