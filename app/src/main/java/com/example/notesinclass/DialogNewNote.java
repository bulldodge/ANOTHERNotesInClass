package com.example.notesinclass;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.fragment.app.DialogFragment;

public class DialogNewNote extends DialogFragment {

    public DialogNewNote()
    {

    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_new_note, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        EditText edtTitle = dialogView.findViewById(R.id.edt_title);
        EditText edtDesc = dialogView.findViewById(R.id.edt_desc);
        RadioGroup grpRads = dialogView.findViewById(R.id.grp_rads);
        Button btnSubmit = dialogView.findViewById(R.id.btn_submit);

        View v = dialogView;
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String title = edtTitle.getText().toString();
                String desc = edtDesc.getText().toString();
                RadioButton selected = (RadioButton) v.findViewById(grpRads.getCheckedRadioButtonId());
                String status = selected.getText().toString();

                Note newNote = new Note(status, title, desc);
                Database.getData().add(newNote);
                dismiss();
            }
        });

        builder.setView(dialogView);

        return builder.create();


    }



}