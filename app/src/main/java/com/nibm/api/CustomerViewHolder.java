package com.nibm.api;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nibm.mad.R;

public class CustomerViewHolder extends RecyclerView.ViewHolder {
    TextView txtName,txtEmail;

    public CustomerViewHolder(@NonNull View itemView) {
        super(itemView);
        txtName=itemView.findViewById(R.id.txtNameContact);
        txtEmail=itemView.findViewById(R.id.txtEmailContact);
    }
}
