package com.mcas2.misaficiones.ui.frmanager;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.mcas2.misaficiones.fr.sobremi.Datos;
import com.mcas2.misaficiones.fr.sobremi.Datos2;
import com.mcas2.misaficiones.fr.sobremi.Datos3;

public class PaginadorSobreMi extends FragmentPagerAdapter {

    private final Context mContext;

    public PaginadorSobreMi(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Datos();
            case 1:
                return new Datos2();
            case 2:
                return new Datos3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() { return 3; }


}
