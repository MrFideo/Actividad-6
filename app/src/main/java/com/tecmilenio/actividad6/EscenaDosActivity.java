package com.tecmilenio.actividad6;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EscenaDosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escena_dos);

        findViewById(R.id.btn_escena_anterior).setOnClickListener(view -> {
            Intent intent = new Intent(EscenaDosActivity.this, MainActivity.class);
            startActivity(intent);

            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }
}
