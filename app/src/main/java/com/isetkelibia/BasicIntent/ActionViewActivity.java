package com.isetkelibia.BasicIntent;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ActionViewActivity extends AppCompatActivity {
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_view);

        ImageButton mImageButton = findViewById(R.id.btn_ACTION_VIEW);
        mEditText = findViewById(R.id.edt_request);
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String requete = "http://www.google.fr/search?q=" + mEditText.getText();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(requete));

                /* Le Package Manager est un objet qui permet d'obtenir des informations
                sur les packages qui sont installés sur l'appareil.*/
                PackageManager manager = getPackageManager();
                ComponentName component = intent.resolveActivity(manager);
                // On vérifie que component n'est pas null
                if (component != null) {
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.item_home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}