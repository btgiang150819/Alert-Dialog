package com.example.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listEmployee;
    ArrayList<Employee> arrayList = new ArrayList<>();;
    Button mAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();


        arrayList.add(new Employee("Bùi Trung Giang", "Nam", "Quảng Ngãi", 20));
        arrayList.add(new Employee("Nguyễn Hải Đăng", "Nam", "Đồng Nai", 20));
        arrayList.add(new Employee("Lê Thị Hà", "Nữ", "Thanh Hóa", 20));
        arrayList.add(new Employee("Lê Trung Hiếu", "Nam", "TP.HCM", 21));
        arrayList.add(new Employee("Bùi Hữu Đang", "Nam", "An Giang", 20));

        //khởi tạo list view
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(MainActivity.this, R.layout.employee, arrayList);
        listEmployee.setAdapter(employeeAdapter);
        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppDialog.createDialogRegister(MainActivity.this, new OnListenerDataRegister() {
                    //tính đa hình
                    @Override
                    public void notification(String name, String sex, String domicile, int age) {
                        arrayList.add(new Employee(name, sex, domicile, age));
                    }
                });
                listEmployee.setAdapter(employeeAdapter);
            }
        });
    }

    //hàm anh xạ
    private void Anhxa(){
        listEmployee = findViewById(R.id.listEmployee);
        mAdd = findViewById(R.id.addEmployee);
    }

}