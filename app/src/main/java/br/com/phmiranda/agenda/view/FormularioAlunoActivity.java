package br.com.phmiranda.agenda.view;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.phmiranda.agenda.R;
import br.com.phmiranda.agenda.entity.Aluno;
import br.com.phmiranda.agenda.repository.AlunoDao;

public class FormularioAlunoActivity extends AppCompatActivity {
    public static final String FORMULARIO_TITULO = "Formulário de Aluno";
    private EditText campoNome;
    private EditText campoEmail;
    private EditText campoTelefone;
    final AlunoDao alunoDao = new AlunoDao();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        setTitle(FORMULARIO_TITULO);
        inicializacaoDosCampos();
        configuraBotaoSalvar();

    }

    private void configuraBotaoSalvar() {
        // cria uma activity para o botão salvar.
        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Aluno alunoCriado = criarAluno();
                salva(alunoCriado);
            }
        });
    }

    private void salva(Aluno aluno) {
        alunoDao.salva(aluno);
        finish();
    }

    @Nullable
    private Aluno criarAluno() {
        // captura os dados do formulário.
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        String telefone = campoTelefone.getText().toString();

        // instancia um objeto da classe Aluno e AlunoDao.
        return new Aluno(nome, email, telefone);
    }

    private void inicializacaoDosCampos(){
        campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        campoEmail = findViewById(R.id.activity_formulario_aluno_email);
        campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
    }
}
