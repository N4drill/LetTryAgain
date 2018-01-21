package com.example.pawel.letstryagain.Views;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pawel.letstryagain.Interfaces.I_Main_Presenter;
import com.example.pawel.letstryagain.Presenter.Main_Presenter;
import com.example.pawel.letstryagain.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    Main_Presenter main_presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        main_presenter = new Main_Presenter();

    }
    //-------------------------BindViews----------------------------

        @BindView(R.id.Sprawy_button) Button sprawy_button;
        @BindView(R.id.Przegladaj_prowadzacych_button) Button przegladaj_prowadzacych_button;
        @BindView(R.id.Przegladaj_sale_button) Button przegladaj_sale_button;
        @BindView(R.id.O_Autorze_button) Button o_autorze_button;
    //--------------------------------------------------------------

    @OnClick(R.id.Przegladaj_prowadzacych_button)
    public void przegladaj_prowadzacych_button_click(View view)
    {
        main_presenter.onButtonClick(this, Professors_Table_Activity.class, "Lista prowadzacych");
    }

    @OnClick(R.id.Sprawy_button)
    public void sprawy_button_click(View view)
    {
        main_presenter.onButtonClick(this, Application_List_Activity.class, "Aktualne podania");
    }

    @Override
    public void onBackPressed() {
        main_presenter.close_application(this);
    }
}
