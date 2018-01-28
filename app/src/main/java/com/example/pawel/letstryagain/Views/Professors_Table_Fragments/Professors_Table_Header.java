package com.example.pawel.letstryagain.Views.Professors_Table_Fragments;

import android.app.Fragment;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pawel.letstryagain.R;

/**
 * Created by Paweł on 23.01.2018.
 */

public class Professors_Table_Header extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_professors_table_list_view_adapter,container,false);

        TextView tytul = view.findViewById(R.id.tytul_textView);
        TextView imie = view.findViewById(R.id.imie_textView);
        TextView nazwisko = view.findViewById(R.id.nazwisko_textView);
        TextView katedra = view.findViewById(R.id.katedra_textView);
        TextView kurs = view.findViewById(R.id.kurs_textView);
        tytul.setTypeface(tytul.getTypeface(), Typeface.BOLD);
        imie.setTypeface(imie.getTypeface(), Typeface.BOLD);
        nazwisko.setTypeface(nazwisko.getTypeface(), Typeface.BOLD);
        katedra.setTypeface(katedra.getTypeface(), Typeface.BOLD);
        kurs.setTypeface(kurs.getTypeface(), Typeface.BOLD);

        tytul.setBackgroundResource(R.drawable.background_border);
        imie.setBackgroundResource(R.drawable.background_border);
        nazwisko.setBackgroundResource(R.drawable.background_border);
        katedra.setBackgroundResource(R.drawable.background_border);
        kurs.setBackgroundResource(R.drawable.background_border);

        tytul.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f);
        imie.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f);
        nazwisko.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f);
        katedra.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f);
        kurs.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f);

        tytul.setTextColor(Color.BLACK);
        imie.setTextColor(Color.BLACK);
        nazwisko.setTextColor(Color.BLACK);
        katedra.setTextColor(Color.BLACK);
        kurs.setTextColor(Color.BLACK);

        tytul.setGravity(Gravity.CENTER);
        imie.setGravity(Gravity.CENTER);
        nazwisko.setGravity(Gravity.CENTER);
        katedra.setGravity(Gravity.CENTER);
        kurs.setGravity(Gravity.CENTER);

        return view;
    }
}
