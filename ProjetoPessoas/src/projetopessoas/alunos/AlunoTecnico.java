
package projetopessoas.alunos;

public final class AlunoTecnico extends Aluno{
    
    // Atributos:
    private int periodo;
    
    // Gets e Sets:

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    //--------------------------------------------------------------------------
    
    // Método pagar mensalidade:
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando a mensalidade do aluno do curso tecnico: " + nome);
    }
}
