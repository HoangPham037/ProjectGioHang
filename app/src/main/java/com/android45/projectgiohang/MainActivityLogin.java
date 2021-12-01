package com.android45.projectgiohang;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityLogin extends AppCompatActivity {
    EditText edtUserName, edtPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ic_login);
        edtUserName = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            String user = edtUserName.getText().toString();
            String pass = edtPassword.getText().toString();
            Intent intent = new Intent(MainActivityLogin.this, MainActivity.class);
            startActivity(intent);
//            if(user.isEmpty() || pass.isEmpty()){
//                Toast.makeText(MainActivityLogin.this, "Tên đăng nhâp hoặc mật khẩu không được để trống!!!", Toast.LENGTH_SHORT).show();
//            }else {
//                if(user.equals("admin") && pass.equals("123")){
//                    Intent intent = new Intent(MainActivityLogin.this, MainActivity.class);
//                    startActivity(intent);
//                }else{
//                    Toast.makeText(MainActivityLogin.this, "Sai thông tin đăng nhập", Toast.LENGTH_SHORT).show();
//                }
//            }
        });
    }
}
