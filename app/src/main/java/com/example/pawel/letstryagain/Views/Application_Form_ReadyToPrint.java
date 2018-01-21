package com.example.pawel.letstryagain.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.pawel.letstryagain.Presenter.Application_Form_ReadyToPrint_Presenter;
import com.example.pawel.letstryagain.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Application_Form_ReadyToPrint extends AppCompatActivity {

    Application_Form_ReadyToPrint_Presenter form_readyToPrint_presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_form_readytoprint);
        form_readyToPrint_presenter = new Application_Form_ReadyToPrint_Presenter();
        ButterKnife.bind(this);
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
