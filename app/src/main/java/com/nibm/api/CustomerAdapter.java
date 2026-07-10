package com.nibm.api;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import com.nibm.dto.Customer;
import com.nibm.mad.R;

import java.util.ArrayList;
import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerViewHolder> {

    //Getting the list we are going to listed on the RecylerView
    List<Customer> customerArrayList ;

    public CustomerAdapter(List<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    @NonNull
    @Override
    public CustomerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact_item,parent,false);
        return new CustomerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerViewHolder holder, int position) {
        Customer customer = customerArrayList.get(position);
        holder.txtName.setText(customer.getName());
        holder.txtEmail.setText(customer.getEmail());
    }

    @Override
    public int getItemCount() {
        return customerArrayList.size();
    }
}
