package com.mcas2.misaficiones.ui.frmanager;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.mcas2.misaficiones.fr.aficionvideojuegos.Videojuegos1;
import com.mcas2.misaficiones.fr.aficionvideojuegos.Videojuegos2;
import com.mcas2.misaficiones.fr.aficionvideojuegos.Videojuegos3;
import com.mcas2.misaficiones.fr.sobremi.Datos;
import com.mcas2.misaficiones.fr.sobremi.Datos2;
import com.mcas2.misaficiones.fr.sobremi.Datos3;
import com.mcas2.misaficiones.fr.sobremi.Datos4;

public class PaginadroAficionvideojuegos extends FragmentPagerAdapter {

    private final Context mContext;

    public PaginadroAficionvideojuegos(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Videojuegos1();
            case 1:
                return new Videojuegos2();
            case 2:
                return new Videojuegos3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() { return 2; }


}

