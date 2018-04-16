package com.example.mikeias.fiosformas.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mikeias.fiosformas.AgendaRecyclerViewAdapter;
import com.example.mikeias.fiosformas.R;
import com.example.mikeias.fiosformas.MyRecyclerViewAdapter;
import com.example.mikeias.fiosformas.model.Agenda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mikeias on 07/03/2018.
 */

public class FragmentAgenda extends android.support.v4.app.Fragment {
    View view;
    private RecyclerView myRecycleView;
    private List<Agenda> myList;
    private TextView edtDataInicio,edtDataFim;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_agenda, container, false);
        myRecycleView = (RecyclerView) view.findViewById(R.id.fragment_agenda);
        AgendaRecyclerViewAdapter myRecyclerViewAdapter = new AgendaRecyclerViewAdapter(getContext(),myList);
        myRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecycleView.setAdapter(myRecyclerViewAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myList = new ArrayList<>();
        myList.add(new Agenda("Thais Conrrado Lima Maciel","Fone: 9 9703-7151","Fixo","12/04/2018","12:00 as 12:50","Atrasada"));
        myList.add(new Agenda("Thamires Conrrado Lima Maciel","Fone: 9 9703-0005","Variavel","12/04/2018","12:55 as 13:15","50 minutos"));
        myList.add(new Agenda("Ilza Ribeiro da Silva Pereira","Fone: 9 9703-7151","Variavel","12/04/2018","13:45 as 14:20","01:20 hr"));
        myList.add(new Agenda("Ivone Conrrado","Fone: 9 9703-7151","Variavel","12/04/2018","12:00 as 12:50","01:50 hr"));
        myList.add(new Agenda("Josefina Queiroz","Fone: 9 9703-7151","Fixo","12/04/2018","12:00 as 12:50","02:10 hr"));
        myList.add(new Agenda("Maria da Dores","Fone: 9 9703-7151","Variavel","12/04/2018","12:00 as 12:50","02:40 hr"));
        myList.add(new Agenda("Maria das Graças","Fone: 9 9703-7151","Variavel","12/04/2018","12:00 as 12:50","03:05 hr"));
        myList.add(new Agenda("Josefina Conrrado Lima Maciel","Fone: 9 9703-7151","Variavel","12/04/2018","12:00 as 12:50","03:35 hr"));
        myList.add(new Agenda("Thais Conrrado Lima Maciel","Fone: 9 9703-7151","Fixo","12/04/2018","12:00 as 12:50","04:20 hr"));
        myList.add(new Agenda("Josefina Conrrado Lima Maciel","Fone: 9 9703-7151","Fixo","12/04/2018","12:00 as 12:50","04:45 hr"));
        myList.add(new Agenda("Thais Conrrado Lima Maciel","Fone: 9 9703-7151","Fixo","13/04/2018","12:00 as 12:50","1 dia"));
        myList.add(new Agenda("Ilza Ribero","Fone: 9 9703-7151","Variavel","13/04/2018","12:00 as 12:50","1 dia"));
        myList.add(new Agenda("Thais Conrrado Lima Maciel","Fone: 9 9703-7151","Fixo","13/04/2018","12:00 as 12:50","1 dia"));
        myList.add(new Agenda("Thamires Conrrado Lima Maciel","Fone: 9 9703-7151","Variavel","13/04/2018","12:00 as 12:50","1 dia"));
        myList.add(new Agenda("Maria da Dores","Fone: 9 9703-7151","Fixo","13/04/2018","12:00 as 12:50","1 dia"));
        myList.add(new Agenda("Ivone Conrrado Lima Maciel","Fone: 9 9703-7151","Variavel","13/04/2018","12:00 as 12:50","1 dia"));
        myList.add(new Agenda("Thais Conrrado Lima Maciel","Fone: 9 9703-7151","Fixo","14/04/2018","12:00 as 12:50","2 dias"));
        myList.add(new Agenda("Josefina Conrrado Lima Maciel","Fone: 9 9703-7151","Fixo","14/04/2018","12:00 as 12:50","2 dias"));
        myList.add(new Agenda("Ilza Ribeiro  ","Fone: 9 9703-7151","Variavel","14/04/2018","12:00 as 12:50","2 dias"));
        //myList.add(new Clientes("Maria da Silva","(44)99743-2705","Plano: Fixo","Ver mais...",R.drawable.exemplo_eigth));
    }

}
