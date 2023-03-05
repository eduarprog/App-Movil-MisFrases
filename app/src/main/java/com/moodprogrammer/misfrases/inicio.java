package com.moodprogrammer.misfrases;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;


public class inicio extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_menu);



        Toolbar toolbar = findViewById(R.id.toolbarA);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout_A);

        NavigationView navigationView = findViewById(R.id.nav_viewA);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        //Fragmento por defecto

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_containerA, new InicioA()).commit();
            navigationView.setCheckedItem(R.id.InicioA);
        }
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.InicioA:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_containerA, new InicioA()).commit();

                break;
            case R.id.AcercaDe:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_containerA, new acercade()).commit();

                break;

            case R.id.CompartirApp:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_containerA, new Compartir()).commit();

                //     break;
                // case R.id.ListarAdmin:
                //  getSupportFragmentManager().beginTransaction().replace(R.id.fragment_containerA,new ListaAdmin()).commit();
                //  break;
                //  case R.id.Salir:
                //    CerrarSesion();
                //   break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    public void frasesa(View view){
        Intent intent = new Intent(inicio.this,frasesamor.class);
        startActivity(intent);
        finish();
    }

    public void frasesf(View view){
        Intent intent = new Intent(inicio.this,frasesfotos.class);
        startActivity(intent);
        finish();
    }

    public void frasesm(View view){
        Intent intent = new Intent(inicio.this,frasesmotivacion.class);
        startActivity(intent);
        finish();
    }

    public void frasesp(View view){
        Intent intent = new Intent(inicio.this,frasespensar.class);
        startActivity(intent);
        finish();
    }

    public void frasesso(View view){
        Intent intent = new Intent(inicio.this,frasessoledad.class);
        startActivity(intent);
        finish();
    }



}


