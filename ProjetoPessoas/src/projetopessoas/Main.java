
package projetopessoas;

import projetopessoas.professor.Professor;
import projetopessoas.funcionarios.Funcionario;
import projetopessoas.alunos.Aluno;
import projetopessoas.alunos.AlunoBolsista;
import projetopessoas.alunos.AlunoTecnico;
import projetopessoas.visitante.Visitante;

public class Main {

    public static void main(String[] args) {
       
        //Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Visitante v1 = new Visitante();
        AlunoBolsista b1 = new AlunoBolsista();
        AlunoTecnico t1 = new AlunoTecnico();
        
        //p1.setNome("Felipe");
        //p1.setIdade(31);
        //p1.setSexo("M");
        
        a1.setNome("Keytty");
        a1.setIdade(29);
        a1.setSexo("F");
        a1.setCurso("Marketing");
        
        p3.setNome("Jordão");
        p3.setIdade(66);
        p3.setSexo("M");
        p3.setSalario(5900.50f);
        
        p4.setNome("Jaci Lane");
        p4.setIdade(65);
        p4.setSexo("F");
        p4.setSetor("Cozinha");
        
        b1.getMatricula();
        b1.setNome("Jardel");
        b1.setBolsa(12.50f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        
        //System.out.println(p1.toString());
        System.out.println(a1.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
}
