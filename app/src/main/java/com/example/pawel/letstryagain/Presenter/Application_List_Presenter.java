package com.example.pawel.letstryagain.Presenter;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.pawel.letstryagain.Interfaces.I_Application_List_Presenter;

/**
 * Created by Paweł on 18.01.2018.
 */

public class Application_List_Presenter implements I_Application_List_Presenter {
    @Override
    public void onButtonClick(Context self, Class destination) {
        Intent intent = new Intent(self, destination);
        Toast.makeText(self, "Success" , Toast.LENGTH_SHORT).show(); // test
        self.startActivity(intent);
    }
}
