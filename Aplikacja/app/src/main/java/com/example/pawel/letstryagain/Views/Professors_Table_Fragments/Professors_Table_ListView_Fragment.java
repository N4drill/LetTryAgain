package com.example.pawel.letstryagain.Views.Professors_Table_Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.pawel.letstryagain.Model.Business_Classes.Kurs;
import com.example.pawel.letstryagain.Model.Business_Classes.Prowadzacy;
import com.example.pawel.letstryagain.R;
import com.example.pawel.letstryagain.RoomDataBase.DataBase_Builder;
import com.example.pawel.letstryagain.RoomDataBase.DataBase_Imitation;
import com.example.pawel.letstryagain.Views.Professors_Table_Activity;
import android.support.v4.app.FragmentActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;



/**
 * Created by Paweł on 23.01.2018.
 */

public class Professors_Table_ListView_Fragment extends Fragment{

    Professors_Table_Adapter adapter;
    ArrayList<Prowadzacy> prowadzacyArray;  //pojemnik na prowadzacych

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_professors_table_list_view,container,false);
        prowadzacyArray = DataBase_Builder.getDataBase().getDb_prowadzacy(); //pierwotna baza prowadzacych
        ListView listView = view.findViewById(R.id.professors_listView);

        adapter = new Professors_Table_Adapter(getContext(),R.layout.fragment_professors_table_list_view_adapter, prowadzacyArray);
        listView.setAdapter(adapter);

        return view;
    }


    /*public void refreshAdapter(final ArrayList<Prowadzacy> to_refresh) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                adapter.refreshAdapter(to_refresh);
            }
        });
    }*/
}
