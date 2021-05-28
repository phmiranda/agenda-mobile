package br.com.phmiranda.agenda.view;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import br.com.phmiranda.agenda.R;
import br.com.phmiranda.agenda.domain.Aluno;
import br.com.phmiranda.agenda.repository.dao.AlunoDao;

public class ListaAlunosActivity extends AppCompatActivity {

    public static final String APPBAR_TITUTLO = "Lista de Alunos";
    private AlunoDao alunoDao = new AlunoDao();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);
        setTitle(APPBAR_TITUTLO);
        configuraFabNovoAluno();
        alunoDao.salva(new Aluno("Alex Felipe de Carvalho Silva","alex.silva@email.com.br","123456789"));
        alunoDao.salva(new Aluno("Alex Felipe de Carvalho Silva","alex.silva@email.com.br","123456789"));
        alunoDao.salva(new Aluno("Alex Felipe de Carvalho Silva","alex.silva@email.com.br","123456789"));
    }

    private void configuraFabNovoAluno() {
        FloatingActionButton botaoNovoAluno = findViewById(R.id.activity_lista_alunos_fab_novo_aluno);
        botaoNovoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                AbrirFormularioAlunoActivity();
            }
        });
    }

    private void AbrirFormularioAlunoActivity() {
        startActivity(new Intent(this, FormularioAlunoActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        configuraLista();
    }

    private void configuraLista() {
        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
        final List<Aluno> alunos = alunoDao.todos();
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));
        listaDeAlunos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicao, long id) {
                Aluno alunoEscolhido = alunos.get(posicao);
                Log.i("Posição do aluno: ", "" + alunoEscolhido);
            }
        });
    }
}
