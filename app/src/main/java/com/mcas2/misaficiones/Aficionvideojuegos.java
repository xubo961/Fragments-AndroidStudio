package com.mcas2.misaficiones;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.mcas2.misaficiones.databinding.ActivityAficionesBinding;
import com.mcas2.misaficiones.databinding.ActivityAficionvideojuegosBinding;
import com.mcas2.misaficiones.ui.frmanager.Paginador;
import com.mcas2.misaficiones.ui.frmanager.PaginadroAficionvideojuegos;

public class Aficionvideojuegos extends AppCompatActivity {

    private ActivityAficionvideojuegosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAficionvideojuegosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        PaginadroAficionvideojuegos paginador = new PaginadroAficionvideojuegos(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);

        TabLayout tabLayout = binding.textoAficionvideojuegos;
        tabLayout.setupWithViewPager(viewPager);
    }
}
