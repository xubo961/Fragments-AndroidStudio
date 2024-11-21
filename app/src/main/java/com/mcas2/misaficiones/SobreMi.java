package com.mcas2.misaficiones;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.mcas2.misaficiones.databinding.ActivitySobremiBinding;
import com.mcas2.misaficiones.ui.frmanager.PaginadorSobreMi;

public class SobreMi extends AppCompatActivity {

    private ActivitySobremiBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySobremiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        PaginadorSobreMi paginador = new PaginadorSobreMi(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);


        TabLayout tabLayout = binding.textoSobreMi;
        tabLayout.setupWithViewPager(viewPager);
    }

}
