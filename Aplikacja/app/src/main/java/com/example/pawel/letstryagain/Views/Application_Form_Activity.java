package com.example.pawel.letstryagain.Views;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.pawel.letstryagain.Presenter.Application_Form_Presenter;
import com.example.pawel.letstryagain.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Application_Form_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Application_Form_Presenter form_presenter;

    @BindView(R.id.Imie_Form_Text) EditText imie_text;
    @BindView(R.id.Nazwisko_Form_Text) EditText nazwisko_text;
    @BindView(R.id.Budynek_Form_Text) EditText budynek_text;
    @BindView(R.id.Sala_Form_Text) EditText sala_text;
    @BindView(R.id.Data_Form_Spinner) Spinner data_spinner;
    @BindView(R.id.Godzina_Form_Spinner) Spinner godzina_spinner;

    String imie;
    String nazwisko;
    String budynek;
    String sala;
    String data;
    String godzina;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_form);
        form_presenter = new Application_Form_Presenter();
        ButterKnife.bind(this);


        ArrayAdapter<CharSequence> adapterData = ArrayAdapter.createFromResource(this,R.array.data_options,android.R.layout.simple_spinner_item);
        adapterData.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        data_spinner.setAdapter(adapterData);

        ArrayAdapter<CharSequence> adapterGodzina = ArrayAdapter.createFromResource(this,R.array.clock_options,android.R.layout.simple_spinner_item);
        adapterGodzina.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        godzina_spinner.setAdapter(adapterGodzina);
    }

    @OnClick(R.id.Next_Form_Button)
    public void next_form_click(View view) {
       if(validateInputs()){
          // form_presenter.onButtonClick(this,Application_Form_ReadyToPrint.class, "Success");

        gatherInformation();
        Log.i("dane", "DANE TO" + imie + ", " + nazwisko + ", " +
                budynek + ", " + sala + ", " + data + ", " + godzina + ".");
           makeIntent();

       }
       else
       {
           Toast.makeText(this,"Wypelnij pola", Toast.LENGTH_SHORT).show();
       }
    }

    private boolean validateInputs() {
        if(imie_text.getText().toString().matches(""))
        {
            imie_text.setHint("wpisz imie...");
            imie_text.setHintTextColor(Color.RED);
            return false;
        }
        if(nazwisko_text.getText().toString().matches(""))
        {
            nazwisko_text.setHint("wpisz nazwisko...");
            nazwisko_text.setHintTextColor(Color.RED);
            return false;
        }
        if(budynek_text.getText().toString().matches(""))
        {
            budynek_text.setHint("wpisz budynek...");
            budynek_text.setHintTextColor(Color.RED);
            return false;
        }
        if(sala_text.getText().toString().matches(""))
        {
            sala_text.setHint("wpisz sale...");
            sala_text.setHintTextColor(Color.RED);
            return false;
        }

        else return true;
    }

    private void gatherInformation()
    {
        imie = imie_text.getText().toString();
        nazwisko = nazwisko_text.getText().toString();
        budynek = budynek_text.getText().toString();
        sala = sala_text.getText().toString();
    }

    private void makeIntent()
    {
        Intent intent = new Intent(this, Application_Form_ReadyToPrint.class);
        intent.putExtra("IMIE", imie);
        intent.putExtra("NAZWISKO", nazwisko);
        intent.putExtra("BUDYNEK", budynek);
        intent.putExtra("SALA", sala);
        startActivity(intent);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        Spinner spinner = (Spinner) parent;

        if(spinner.getId() == R.id.Data_Form_Spinner){
            Log.i("data", "tutaj bylem 1");
            data = "10";
        }else if(spinner.getId() == R.id.Godzina_Form_Spinner){
            Log.d("data", "tutaj bylem 2");
            godzina = "22";
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}
