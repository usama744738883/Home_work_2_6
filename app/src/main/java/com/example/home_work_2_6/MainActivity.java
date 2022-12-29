package com.example.home_work_2_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edit =findViewById(R.id.edit);
        EditText password = findViewById(R.id.password);
         Button button= findViewById(R.id.button);
        TextView ikl = findViewById(R.id.ikl);
        TextView hitler = findViewById(R.id.hitler);
        TextView stalin = findViewById(R.id.stalin);
        TextView welcome = findViewById(R.id.Welcome);
        TextView rul = findViewById(R.id.rul);

        edit.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
               if (edit.getText().toString().isEmpty()){
                   button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey ));

               }else{
                   button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange ));
               }
            }
        });
        password.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (password.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey ));

                }else{
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange ));
                }
            }
        });

        button.findViewById(R.id.button).setOnClickListener(view -> {
            if (edit.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
                edit.setVisibility(View.GONE);
                password.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
                ikl.setVisibility(View.GONE);
                hitler.setVisibility(View.GONE);
                stalin.setVisibility(View.GONE);
                welcome.setVisibility(View.GONE);
                rul.setVisibility(View.GONE);
                Toast.makeText(this, "Вы успешно зарегистрирулись в аккаунт", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Повторите попытку", Toast.LENGTH_SHORT).show();

            }
        });





    }
}