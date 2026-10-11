package model;

public class Turma {

    private Aluno[] alunos;

    public Turma(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void listarAprovados() {
        System.out.println("--- Alunos Aprovados ---");
        for (Aluno aluno : alunos) {
            if (aluno != null && aluno.verificaAluno()) {
                System.out.println("- " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
            }
        }
    }

    public void listarReprovados() {
        System.out.println("--- Alunos Reprovados ---");
        for (Aluno aluno : alunos) {
            if (aluno != null && !aluno.verificaAluno()) {
                System.out.println("- " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
            }
        }
    }

}
