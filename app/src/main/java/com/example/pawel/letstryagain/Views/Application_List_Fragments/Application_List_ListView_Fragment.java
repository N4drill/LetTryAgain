package com.example.pawel.letstryagain.Views.Application_List_Fragments;


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

public class Application_List_ListView_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_application_list_list_view, container, false);
        return view;
    }
}
