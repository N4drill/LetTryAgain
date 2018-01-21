package com.example.pawel.letstryagain.Presenter;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;

import com.example.pawel.letstryagain.Interfaces.I_Main_Presenter;

/**
 * Created by Paweł on 18.01.2018.
 */

public class Main_Presenter implements I_Main_Presenter{


    @Override
    public void onButtonClick(Context self , Class destination) {
        Intent intent = new Intent(self, destination);
        self.startActivity(intent);
    }

    @Override
    public void onButtonClick(Context self, Class destination, String message) {
        Intent intent = new Intent(self, destination);
        Toast.makeText(self, message , Toast.LENGTH_SHORT).show(); // test
        self.startActivity(intent);
    }

    @Override
    public void close_application(Context self) {
        final Context context = self;
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle("Czy na pewno chcesz wylaczyc aplikacje ??");
        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("Tak",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent(Intent.ACTION_MAIN);
                                intent.addCategory(Intent.CATEGORY_HOME);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                context.startActivity(intent);
                            }
                        })

                .setNegativeButton("Nie", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

}
