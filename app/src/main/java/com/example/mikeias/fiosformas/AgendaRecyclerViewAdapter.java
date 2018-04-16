package com.example.mikeias.fiosformas;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mikeias.fiosformas.model.Agenda;



import java.util.List;

/**
 * Created by Mikeias on 15/04/2018.
 */

public class AgendaRecyclerViewAdapter extends RecyclerView.Adapter<AgendaRecyclerViewAdapter.MyViewHoder>  {
    Context mContext;
    List<Agenda> mAgenda;

    public AgendaRecyclerViewAdapter(Context mContext, List<Agenda> mAgenda) {
        this.mContext = mContext;
        this.mAgenda = mAgenda;
    }


    @Override
    public AgendaRecyclerViewAdapter.MyViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_agenda,parent,false);
        AgendaRecyclerViewAdapter.MyViewHoder vHolder = new AgendaRecyclerViewAdapter.MyViewHoder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHoder holder, int position) {
        holder.nomeAgenda.setText(mAgenda.get(position).getNomeAgenda());
        holder.foneAgenda.setText(mAgenda.get(position).getFoneAgenda());
        holder.planoAgenda.setText(mAgenda.get(position).getPlanoAgenda());
        holder.dataAgenda.setText(mAgenda.get(position).getDataAgenda());
        holder.horaAgenda.setText(mAgenda.get(position).getHoraAgenda());
        holder.situacaoAgenda.setText(mAgenda.get(position).getSituacaoAgenda());

        if (holder.situacaoAgenda.getText().equals("Atrasada")){
            holder.situacaoAgenda.setTextColor(R.color.situacaoAtrasada);
        }else{
            holder.situacaoAgenda.setTextColor(R.color.situacaoOk);
        }
    }

    @Override
    public int getItemCount() {
        return mAgenda.size();
    }

    public static class MyViewHoder extends RecyclerView.ViewHolder {
        private TextView nomeAgenda,foneAgenda,planoAgenda,dataAgenda,horaAgenda,situacaoAgenda;


        public MyViewHoder(View itemView) {
            super(itemView);
            nomeAgenda = (TextView) itemView.findViewById(R.id.txt_nomeAgenda);
            foneAgenda = (TextView) itemView.findViewById(R.id.txt_foneAgenda);
            planoAgenda = (TextView) itemView.findViewById(R.id.txt_planoAgenda);
            dataAgenda = (TextView) itemView.findViewById(R.id.txt_dataAgenda);
            horaAgenda = (TextView) itemView.findViewById(R.id.txt_horaAgenda);
            situacaoAgenda = (TextView) itemView.findViewById(R.id.txt_situacaoAgenda);

        }
    }
}
