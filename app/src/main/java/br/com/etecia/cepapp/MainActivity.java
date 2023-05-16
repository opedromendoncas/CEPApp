package br.com.etecia.cepapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnBuscaCep, btnCadastrar, btnAlterar, btnExcluir, btnLimpar;

    EditText edtCEP;

    TextView txtEndereco, txtNumero, txtBairro, txtCidade, txtComplemento;

    Spinner spnrEstado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBuscaCep = findViewById(R.id.idBuscaCep);
        btnCadastrar = findViewById(R.id.idCadastrar);
        btnAlterar = findViewById(R.id.idAlterar);
        btnExcluir = findViewById(R.id.idExcluir);
        btnLimpar = findViewById(R.id.idLimpar);
        edtCEP = findViewById(R.id.txtCep);
        txtEndereco = findViewById(R.id.lblEndereco);
        txtNumero = findViewById(R.id.lblNumero);
        txtBairro = findViewById(R.id.idBairro);
        txtCidade = findViewById(R.id.idCidade);
        txtComplemento = findViewById(R.id.idComplemento);
        spnrEstado = findViewById(R.id.idSpinner);

        btnBuscaCep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}