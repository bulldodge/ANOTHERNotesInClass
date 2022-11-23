package com.example.notesinclass;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class DialogShowNote extends DialogFragment {
    private Note note;
    public DialogShowNote(Note n){
        note = n;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState){
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_show_note, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        TextView tvTitle = dialogView.findViewById(R.id.tvTitle);
        TextView tvStatus = dialogView.findViewById(R.id.tvStatus);
        TextView tvDescr = dialogView.findViewById(R.id.tvDescription);
        Button btnDone = dialogView.findViewById(R.id.btnDoneShowingNote);

        tvTitle.setText(note.getTitle());
        tvStatus.setText(note.getStatus());
        tvDescr.setText(note.getText());

        btnDone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dismiss();
            }
        });

        builder.setView(dialogView);

        return builder.create();

        //return super.onCreateDialog(savedInstanceState);
    }



}