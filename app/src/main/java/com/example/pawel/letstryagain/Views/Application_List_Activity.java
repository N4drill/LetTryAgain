package com.example.pawel.letstryagain.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.pawel.letstryagain.Model.Business_Classes.Prowadzacy;
import com.example.pawel.letstryagain.Presenter.Application_List_Presenter;
import com.example.pawel.letstryagain.R;
import com.example.pawel.letstryagain.RoomDataBase.DataBase_Imitation;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Application_List_Activity extends AppCompatActivity {

    Application_List_Presenter list_presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_list);
        list_presenter = new Application_List_Presenter();
        ButterKnife.bind(this);
    }


    @OnClick(R.id.Add_new_application_button)
    public void add_new_application_click(View view){
        list_presenter.onButtonClick(this,Application_Form_Activity.class, "Nowe podanie");
    }

    @Override
    public void onBackPressed() {
        list_presenter.onButtonClick(this, MainActivity.class);
    }
}
