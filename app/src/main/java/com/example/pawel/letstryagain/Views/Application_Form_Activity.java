package com.example.pawel.letstryagain.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.pawel.letstryagain.Presenter.Application_Form_Presenter;
import com.example.pawel.letstryagain.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Application_Form_Activity extends AppCompatActivity {

    Application_Form_Presenter form_presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_form);
        form_presenter = new Application_Form_Presenter();
        ButterKnife.bind(this);
    }

    @OnClick(R.id.Next_Form_Button)
    public void next_form_click(View view) {
        form_presenter.onButtonClick(this,Application_Form_ReadyToPrint.class, "Success");
    }


}
