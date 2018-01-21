package com.example.pawel.letstryagain.Interfaces;

import android.content.Context;

/**
 * Created by Paweł on 18.01.2018.
 */

public interface I_Application_Form_ReadyToPrint_Presenter {
    void onButtonClick(Context self, Class destination);
    void onButtonClick(Context self, Class destination, String message);
}
