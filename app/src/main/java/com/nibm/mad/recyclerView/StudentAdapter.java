package com.nibm.mad.recyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nibm.dto.Student;
import com.nibm.mad.R;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter
 <StudentAdapter.ViewHolder>{

    private ArrayList<Student> students;


    public StudentAdapter(ArrayList<Student> students) {
        this.students = students;
    }


    @NonNull
    @Override
    public StudentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                        int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.student_item,
                        parent,
                        false);
         return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.ViewHolder holder,
                                 int position) {

        Student student = students.get(position);
        holder.txtName.setText(student.getName());
    }

    @Override
    public int getItemCount() {
        return  students.size();
    }

    public static class ViewHolder
            extends RecyclerView.ViewHolder {

        TextView txtName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}
