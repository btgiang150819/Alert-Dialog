package com.example.employee;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AppDialog {


    private static  Dialog mDialog = null;

    public static void createDialogRegister(Context context, OnListenerDataRegister onListenerDataRegister){
        mDialog = new Dialog(context, R.style.ThemeOverlay_AppCompat_Dialog_Alert);
        mDialog.setContentView(R.layout.dialog);

        //Ánh xạ
        EditText name = mDialog.findViewById(R.id.name);
        EditText sex = mDialog.findViewById(R.id.sex);
        EditText domicile = mDialog.findViewById(R.id.domicile);
        EditText age = mDialog.findViewById(R.id.age);
        Button add = mDialog.findViewById(R.id.add1);
        Button cancel = mDialog.findViewById(R.id.cancel);

        //set onclick
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameAdd = name.getText().toString().trim();
                String sexAdd = sex.getText().toString().trim();
                String domicileAdd = domicile.getText().toString().trim();
                String ageAdd = age.getText().toString().trim();
                if(nameAdd.isEmpty() || sexAdd.isEmpty() || domicileAdd.isEmpty() || ageAdd.isEmpty()){
                    Toast.makeText(context, "Please enter enough information", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (onListenerDataRegister != null) {
                        int ageInt = Integer.parseInt(ageAdd);
                        onListenerDataRegister.notification(nameAdd, sexAdd, domicileAdd, ageInt);
                        Toast.makeText(context, "Add employee successful", Toast.LENGTH_SHORT).show();
                        mDialog.dismiss();
                    }
                }

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Cancel successful", Toast.LENGTH_SHORT).show();
                mDialog.dismiss();
            }
        });
        mDialog.show();
    }

}
