package com.example.pawel.letstryagain.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.pawel.letstryagain.Model.Data;
import com.example.pawel.letstryagain.Presenter.Application_Form_ReadyToPrint_Presenter;
import com.example.pawel.letstryagain.R;

import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Application_Form_ReadyToPrint extends AppCompatActivity {

    Application_Form_ReadyToPrint_Presenter form_readyToPrint_presenter;

    @BindView(R.id.Fill_Kurs_Form_Print) TextView kurs_field;
    @BindView(R.id.Fill_Prowadzacy_Form_Print) TextView prowadzacy_field;
    @BindView(R.id.Fill_Sala_Form_Print) TextView sala_field;
    @BindView(R.id.Data_Form_Print) TextView data_field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_form_readytoprint);
        form_readyToPrint_presenter = new Application_Form_ReadyToPrint_Presenter();
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String prowadzacy = intent.getStringExtra("IMIE") + " " + intent.getStringExtra("NAZWISKO");
        String sala = intent.getStringExtra("BUDYNEK") + " , " + intent.getStringExtra("SALA");

        prowadzacy_field.setText(prowadzacy);
        sala_field.setText(sala);

    }


    @OnClick (R.id.Submit_Form_Print_Button)
    public void submit_form_print_click(View view){
        form_readyToPrint_presenter.onButtonClick(this, Application_List_Activity.class, "Confirmed");
    }

    @OnClick (R.id.Edit_Form_Print_Button)
    public void edit_form_print_click(View view){
        form_readyToPrint_presenter.onButtonClick(this,Application_Form_Activity.class);
    }
}
