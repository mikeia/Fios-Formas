package com.example.mikeias.fiosformas.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mikeias.fiosformas.R;

/**
 * Created by Mikeias on 07/03/2018.
 */

public class FragmentComissao extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comissao, container, false);
        return view;
    }
}
