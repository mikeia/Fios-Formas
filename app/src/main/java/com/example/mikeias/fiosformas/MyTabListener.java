package com.example.mikeias.fiosformas;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;

import com.example.mikeias.fiosformas.fragments.FragmentAgenda;
import com.example.mikeias.fiosformas.fragments.FragmentClientes;
import com.example.mikeias.fiosformas.fragments.FragmentComissao;

/**
 * Created by Mikeias on 07/03/2018.
 */

public class MyTabListener implements ActionBar.TabListener {
    private Context context;
    private Fragment frag;

    public MyTabListener( Context context, Fragment frag) {
       this.context = context;
       this.frag = frag;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.replace(R.id.layoutfrag, this.frag, null);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

}
