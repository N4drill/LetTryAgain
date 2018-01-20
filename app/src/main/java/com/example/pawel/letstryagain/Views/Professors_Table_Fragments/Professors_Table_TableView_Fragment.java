package com.example.pawel.letstryagain.Views.Professors_Table_Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pawel.letstryagain.R;

/**
 * Created by Paweł on 20.01.2018.
 */

public class Professors_Table_TableView_Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_professors_table_table_view,container,false);
        return view;
    }
}
