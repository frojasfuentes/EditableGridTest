package com.example.laboratorios.editablegridtest;

import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Classes.Student;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText et;
    RecyclerView rv;

    List<Student> students;
    //https://code.tutsplus.com/es/tutorials/getting-started-with-recyclerview-and-cardview-on-android--cms-23465
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        students = new ArrayList<Student>();
        Random r = new Random();
        for (int i = 0; i < 5; i++)
            students.add(new Student("Student " + i, r.nextFloat() * 5, r.nextFloat() * 5, r.nextFloat() * 5));
        b = (Button) findViewById(R.id.button);
        et = (EditText) findViewById(R.id.editText);
        rv=(RecyclerView) findViewById(R.id.recyclerView);
        rv.setLayoutManager(new GridLayoutManager(this, 1));
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog1();
            }
        });
    }

    private void showAlertDialog1() {
        if(et.getText().toString().length()<=1)
            return;
        String studentName=et.getText().toString();
        Random r=new Random();
        students.add(new Student(studentName, r.nextFloat()*5, r.nextFloat()*5, r.nextFloat()*5));
        AlertDialog.Builder ad=new AlertDialog.Builder(this);
        ad.setTitle("This is a test alert dialog");
        ad.setMessage("\nAre you reading this message?");
        ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showAlertDialog2();
            }
        });
        ad.setNegativeButton("No", null);
        ad.setCancelable(true);
        ad.show();
    }

    private void showAlertDialog2() {
        AlertDialog.Builder ad=new AlertDialog.Builder(this);
        ad.setTitle("This is a test alert dialog");
        ad.setMessage("\nThis is the second alert dialog");
        ad.setNeutralButton("OK", null);
        ad.setCancelable(true);
        ad.show();
    }
}
