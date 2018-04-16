package com.example.mikeias.fiosformas.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mikeias.fiosformas.ClienteRecyclerViewAdapter;
import com.example.mikeias.fiosformas.R;
import com.example.mikeias.fiosformas.MyRecyclerViewAdapter;
import com.example.mikeias.fiosformas.model.Clientes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mikeias on 06/03/2018.
 */

public class FragmentClientes extends android.support.v4.app.Fragment {
    View view;
    private RecyclerView myRecycleView;
    private List<Clientes> myList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_clientes, container, false);
        myRecycleView = (RecyclerView) view.findViewById(R.id.fragment_clientes);
        ClienteRecyclerViewAdapter myClienteViewAdapter = new ClienteRecyclerViewAdapter(getContext(),myList);
        myRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecycleView.setAdapter(myClienteViewAdapter);
        return view;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myList = new ArrayList<>();
        myList.add(new Clientes("Maria da Silva","(44)99743-2705","Plano: Fixo","Ver mais...",R.drawable.exemplo_eigth));
        myList.add(new Clientes("Josefina","(44)99743-2705","Plano: Fixo","Ver mais...",R.drawable.exemplo_five));
        myList.add(new Clientes("Marta Panato","(44)99743-2705","Plano: Variável","Ver mais...",R.drawable.exemplo_four));
        myList.add(new Clientes("Thais Conrrado","(44)99743-2705","Plano: Fixo","Ver mais...",R.drawable.exemplo_nine));
        myList.add(new Clientes("Ilza Ribeiro","(44)99743-2705","Plano: Fixo","Ver mais...",R.drawable.exemplo_one));
        myList.add(new Clientes("Maria da Silva","(44)99743-2705","Plano: Variável","Ver mais...",R.drawable.exemplo_seven));
        myList.add(new Clientes("Josefina","(44)99743-2705","Plano: Fixo","Ver mais...",R.drawable.exemplo_six));
        myList.add(new Clientes("Marta Panato","(44)99743-2705","Plano: Fixo","Ver mais...",R.drawable.exemplo_teen));
        myList.add(new Clientes("Thais Conrrado","(44)99743-2705","Plano: Variável","Ver mais...",R.drawable.exemplo_tree));
        myList.add(new Clientes("Ilza Ribeiro","(44)99743-2705","Plano: Variável","Ver mais...",R.drawable.exemplo_two));
        myList.add(new Clientes("Maria da Silva","(44)99743-2705","Plano: Fixo","Ver mais...",R.drawable.exemplo_eigth));
        myList.add(new Clientes("Josefina","(44)99743-2705","Plano: Variável","Ver mais...",R.drawable.exemplo_five));
        myList.add(new Clientes("Marta Panato","(44)99743-2705","Plano: Fixo","Ver mais...",R.drawable.exemplo_four));
        myList.add(new Clientes("Thais Conrrado","(44)99743-2705","Plano: Variável","Ver mais...",R.drawable.exemplo_nine));
        myList.add(new Clientes("Ilza Ribeiro","(44)99743-2705","Plano: Fixo","Ver mais...",R.drawable.exemplo_one));
        myList.add(new Clientes("Maria da Silva","(44)99743-2705","Plano: Variável","Ver mais...",R.drawable.exemplo_seven));
        myList.add(new Clientes("Josefina","(44)99743-2705","Plano: Variável","Ver mais...",R.drawable.exemplo_six));
        myList.add(new Clientes("Marta Panato","(44)99743-2705","Plano: Variável","Ver mais...",R.drawable.exemplo_teen));
        myList.add(new Clientes("Thais Conrrado","(44)99743-2705","Plano: Fixo","Ver mais...",R.drawable.exemplo_tree));
        myList.add(new Clientes("Ilza Ribeiro","(44)99743-2705","Plano: Variável","Ver mais...",R.drawable.exemplo_two));
    }
}
