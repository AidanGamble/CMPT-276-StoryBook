package com.example.storbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pwd_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pwd);
    }
    public void onalbumClicked(View view){

    }
    public void onpeopleClicked(View view) {
        Intent i = new Intent(this, FamilyMemberMainPage.class);
        this.startActivity(i);
    }

    //back button
    public void onBackClick(View v){
        Intent myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }
}