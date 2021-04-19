package com.example.employee;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EmployeeAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Employee> employeeArrayList;

    //constructor
    public EmployeeAdapter(Context context, int layout, ArrayList<Employee> employeeArrayList) {
        this.context = context;
        this.layout = layout;
        this.employeeArrayList = employeeArrayList;
    }

    @Override
    public int getCount() {
        return employeeArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(layout, null);

        //anh xa
        TextView name = convertView.findViewById(R.id.name);
        TextView describe = convertView.findViewById(R.id.describe);

        //gan gia tri
        Employee employee = employeeArrayList.get(position);
        String res = "Giới tính : " + employee.getSex() + ", " + employee.getAge() + ", Quê quán : " + employee.getDomicile();
        name.setText(employee.getName());
        describe.setText(res);

        return convertView;
    }
}
