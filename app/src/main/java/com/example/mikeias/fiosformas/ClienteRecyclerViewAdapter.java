package com.example.mikeias.fiosformas;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mikeias.fiosformas.model.Clientes;

import java.util.List;

/**
 * Created by Mikeias on 15/04/2018.
 */

public class ClienteRecyclerViewAdapter extends RecyclerView.Adapter<ClienteRecyclerViewAdapter.MyViewHoder> {
    Context mContext;
    List<Clientes> mClientes;

    public ClienteRecyclerViewAdapter(Context mContext, List<Clientes> mClientes) {
        this.mContext = mContext;
        this.mClientes = mClientes;
    }

    @Override
    public ClienteRecyclerViewAdapter.MyViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_cliente,parent,false);
        ClienteRecyclerViewAdapter.MyViewHoder vHolder = new ClienteRecyclerViewAdapter.MyViewHoder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHoder holder, int position) {
        holder.txtNome.setText(mClientes.get(position).getNome());
        holder.txtFone.setText(mClientes.get(position).getFone());
        holder.txtHora.setText(mClientes.get(position).getHora());
        holder.txtSituacao.setText(mClientes.get(position).getSituacao());
        holder.imFoto.setImageResource(mClientes.get(position).getFoto());
    }


    @Override
    public int getItemCount() {
        return mClientes.size();
    }


    public static class MyViewHoder extends RecyclerView.ViewHolder{
        private TextView txtNome;
        private TextView txtFone;
        private TextView txtHora;
        private TextView txtSituacao;
        private ImageView imFoto;

        public MyViewHoder(View itemView) {
            super(itemView);

            txtNome     = (TextView) itemView.findViewById(R.id.txt_nome);
            txtFone     = (TextView) itemView.findViewById(R.id.txt_fone);
            txtHora     = (TextView) itemView.findViewById(R.id.txt_hora);
            txtSituacao = (TextView) itemView.findViewById(R.id.txt_situacao);
            imFoto      = (ImageView) itemView.findViewById(R.id.txt_foto);

        }
    }
}
