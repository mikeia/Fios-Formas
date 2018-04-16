package com.example.mikeias.fiosformas;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mikeias.fiosformas.fragments.FragmentAgenda;
import com.example.mikeias.fiosformas.fragments.FragmentClientes;
import com.example.mikeias.fiosformas.fragments.FragmentComissao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends android.support.v7.app.AppCompatActivity {
    private EditText dataInicio, dataFim;
    private Calendar myCalendar;
    private DatePickerDialog date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataInicio = findViewById(R.id.edtDataIni);
        dataFim    = findViewById(R.id.edtDataFim);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(android.app.ActionBar.NAVIGATION_MODE_TABS);
        //Tab1
        ActionBar.Tab tabCliente = actionBar.newTab().setText("").setIcon(R.drawable.ic_cliente_24dp);
        tabCliente.setTabListener(new MyTabListener(this, new FragmentClientes()));
        actionBar.addTab(tabCliente);
        //Tab2
        ActionBar.Tab tabAgenda = actionBar.newTab().setText("").setIcon(R.drawable.ic_agenda_24dp);
        tabAgenda.setTabListener(new MyTabListener(this, new FragmentAgenda()));
        actionBar.addTab(tabAgenda);
        //Tab3
        ActionBar.Tab tabComissao = actionBar.newTab().setText("").setIcon(R.drawable.ic_comissao_24dp);
        tabComissao.setTabListener(new MyTabListener(this, new FragmentComissao()));
        actionBar.addTab(tabComissao);

//        if (savedInstanceState == null) {
//            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            FragmentClientes fragmentClientes = new FragmentClientes();
//            ft.add(R.id.frag, fragmentClientes, "Fragments Clientes");
//            ft.commit();
//
//        }
    }

    private void selecionaData(){
        myCalendar = Calendar.getInstance();

        int dia = myCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = myCalendar.get(Calendar.MONTH);
        int ano = myCalendar.get(Calendar.YEAR);

        date = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                dataInicio.setText(dayOfMonth + "/" + month + "/"+ year);
            }
        },dia,mes,ano);
        date.show();
    }

    private void updateLabel() {
        String myFormat = "dd/MM/yyyy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, new Locale("pt","BR"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_about:
                Toast.makeText(this, "Clicou em About", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_configuracoes:
                Toast.makeText(this, "Clicou em Configurações", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_sair:
                new AlertDialog.Builder(this)
                        .setTitle("Sair")
                        .setMessage("Tem certeza que deseja sair?")
                        .setPositiveButton("sim",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                       finalizar();
                                    }
                                })
                        .setNegativeButton("não", null)
                        .show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void finalizar(){
        this.finish();
    }
}
