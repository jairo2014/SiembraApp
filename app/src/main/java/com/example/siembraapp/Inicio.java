package com.example.siembraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Inicio extends AppCompatActivity {

    EditText editUsuario;
    EditText editContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        editUsuario = findViewById(R.id.editUsuario);
        editContraseña = findViewById(R.id.editContraseña);
    }

    public void Login(View v){
        String usuario = editUsuario.getText().toString();
        String contraseña = editContraseña.getText().toString();

        if (usuario.equals("Anyi") ) {
            if (contraseña.equals("12345")){
                Intent intent = new Intent(this, Menu.class);
                startActivity(intent);

            }
        }else{
            //USUARIO INCORRECTO
            Intent intent = new Intent(this, CrearCuenta.class);
            startActivity(intent);

        }
    }

}