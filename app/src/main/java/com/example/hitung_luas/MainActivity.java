package com.example.hitung_luas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPanjang = (EditText)findViewById(R.id.edit_panjang);
        edtLebar = (EditText)findViewById(R.id.edit_lebar);
        btnHitung = (Button)findViewById(R.id.tombol_hitung);
        txtLuas = (TextView)findViewById(R.id.hasil_hitung);

        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                if(edtPanjang.length()==0 ||  edtPanjang.getText().toString().trim().equals(".")){
                    edtPanjang.setError("Panjang tidak boleh kosong!");
                }
                else if(edtLebar.length()==0 ||  edtLebar.getText().toString().trim().equals(".")){
                    edtLebar.setError("Lebar tidak boleh kosong!");
                }
                else{
                    String panjang = edtPanjang.getText().toString().trim();
                    String lebar = edtLebar.getText().toString().trim();

                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);

                    double luas = p*l;

                    txtLuas.setText("Hasil: "+ String.format ("%.2f", luas));
                }
            }
        });
    }
}
