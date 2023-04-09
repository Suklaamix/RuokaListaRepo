package com.kaapo.ruokalista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class AddItemActivity extends AppCompatActivity {

    private EditText editTextOstos, editTextExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        editTextOstos = findViewById(R.id.editTextOstos);
        editTextExtra = findViewById(R.id.editTextExtra);
    }
    public void addItem(View view) {
        String ostos = editTextOstos.getText().toString();
        String extraTxt = editTextExtra.getText().toString();

        Item newItem = new Item(ostos, extraTxt);
        ItemStorage s = ItemStorage.getInstance();

        s.addItem(newItem);

        ArrayList<Item> items = s.getItems();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}