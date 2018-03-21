package com.example.pawel.letstryagain.Views;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
import com.example.pawel.letstryagain.Views.Professors_Table_Fragments.Professors_Table_Adapter;
import com.example.pawel.letstryagain.Views.Professors_Table_Fragments.Professors_Table_ListView_Fragment;

import java.lang.reflect.Array;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Professors_Table_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    public static final String SEARCH_CATEGORY_IMIE = "imie";
    public static final String SEARCH_CATEGORY_NAZWISKO = "nazwisko";
    public static final String SEARCH_CATEGORY_KURS = "kurs";

    ArrayList<Prowadzacy> prowadzacyArrayList;


    @BindView(R.id.search_spinner_bar) Spinner search_spinner;
    @BindView(R.id.search_text) EditText search_text;

    String search_category_selected= SEARCH_CATEGORY_IMIE;

    Professors_Table_ListView_Fragment listView_fragment = (Professors_Table_ListView_Fragment) getSupportFragmentManager().findFragmentById(R.id.table_fragment);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professors_table);
        prowadzacyArrayList = DataBase_Builder.getDataBase().getDb_prowadzacy();
        ButterKnife.bind(this);


    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.search_category,
            android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    search_spinner.setAdapter(adapter);
    search_spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        search_category_selected = selectCategory(parent.getItemAtPosition(position).toString());
        Log.i("table", "seatch_category_selected: "+ search_category_selected);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @OnClick(R.id.search_button_2)
    public void search_click()
    {

        String category = search_category_selected;
        String to_find = search_text.getText().toString();


        Kurs k1 = new Kurs("Analiza" , 5, 2, 2);
        Prowadzacy p1= new Prowadzacy("Mariusz","Polak", "mgr", "w8", k1);
        Prowadzacy p2= new Prowadzacy("Mariusz","Polak", "mgr", "w8", k1);
        Prowadzacy p3= new Prowadzacy("Mariusz","Polak", "mgr", "w8", k1);
        ArrayList<Prowadzacy> proba = new ArrayList<>();
        proba.add(p1); proba.add(p2); proba.add(p3);

        String message = "";
        for(Prowadzacy p : proba)
        {
            message += p.getImie() + ", ";
        }
        Log.i("button", "klik klik");
        Log.i("button", message);

        if(listView_fragment!=null)
        {
            Log.i("button", "tutaj tez bylem");
        }



    }

    private String selectCategory(String option){
        String result;
        if(option.equals("Nazwisko")) result = SEARCH_CATEGORY_NAZWISKO;
        else if (option.equals("Kurs")) result = SEARCH_CATEGORY_KURS;
        else result = SEARCH_CATEGORY_IMIE;
        return result;
    }


    private ArrayList<Prowadzacy> filtered_Prof_Array (ArrayList<Prowadzacy> database, String condition, String to_find){
        ArrayList<Prowadzacy> result = new ArrayList<>();

        if(condition.equals(SEARCH_CATEGORY_NAZWISKO))
        {
            for (Prowadzacy p : database)
            {
                if(p.getNazwisko().equals(to_find)){
                    for(Kurs k : p.getKursy_prowadzone_ArrayList())
                    {
                        result.add(new Prowadzacy(
                                p.getImie(),
                                p.getNazwisko(),
                                p.getTytul_naukowy(),
                                p.getKatedra(),
                                k)
                        );
                    }
                }
            }
        }
        else if(condition.equals(SEARCH_CATEGORY_KURS))
        {
            for (Prowadzacy p : database)
            {
                for(Kurs k : p.getKursy_prowadzone_ArrayList())
                {
                    if(k.getNazwa_kursu().equals(to_find))
                    {
                        result.add(new Prowadzacy(
                                p.getImie(),
                                p.getNazwisko(),
                                p.getTytul_naukowy(),
                                p.getKatedra(),
                                k)
                        );
                    }
                }
            }
        }
        else
        {
            for (Prowadzacy p : database)
            {
                if(p.getImie().equals(to_find))
                {
                    for(Kurs k : p.getKursy_prowadzone_ArrayList())
                    {
                        result.add(new Prowadzacy(
                                p.getImie(),
                                p.getNazwisko(),
                                p.getTytul_naukowy(),
                                p.getKatedra(),
                                k)
                        );
                    }
                }

            }
        }
        return result;
    }


}
