package com.nibm.api;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nibm.dto.Customer;
import com.nibm.mad.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_api);
        recyclerView = findViewById(R.id.recyclerViewApi);
        recyclerView.setLayoutManager(new LinearLayoutManager(null));

        loadCustomers();

    }

    private void loadCustomers() {
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);

        Call<List<Customer>> call = apiService.getCustomers();

        call.enqueue(new Callback<List<Customer>>() {
            @Override
            public void onResponse(Call<List<Customer>> call, Response<List<Customer>> response) {
                List<Customer> customers = response.body();

                CustomerAdapter customerAdapter = new CustomerAdapter(customers);

                recyclerView.setAdapter(customerAdapter);
            }

            @Override
            public void onFailure(Call<List<Customer>> call, Throwable throwable) {
                Toast.makeText(ApiActivity.this,
                        "Error : "+ throwable.getMessage(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}