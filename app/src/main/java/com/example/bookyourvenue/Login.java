package com.example.bookyourvenue;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;

public class Login extends Fragment implements  View.OnClickListener {

    private EditText etUsername, etPassword;
    private Button btnLogin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        etUsername = view.findViewById(R.id.etUsername);
        etPassword = view.findViewById(R.id.etPassword);
        btnLogin = view.findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
        return view;
    }
    private void User() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("User", MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "");
        String password = sharedPreferences.getString("password", "");

        if (username.equals(etUsername.getText().toString()) && password.equals(etPassword.getText().toString())) {
            Toast.makeText(this.getActivity(), "Successfully logged in", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this.getActivity(), Home1.class);
            startActivity(intent);

        } else {
            Toast.makeText(this.getActivity(), "Invalid username/password Please enter correct information", Toast.LENGTH_LONG).show();
        }


    }

    @Override
    public void onClick(View v) {
        User();
    }
}

