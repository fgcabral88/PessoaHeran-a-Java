
package projetopessoas.alunos;

public final class AlunoBolsista extends Aluno{
    
    // Atributos:
    private float bolsa;
    
    // Gets e Sets:

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    //--------------------------------------------------------------------------
    
    // Método renovar bolsa:
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de: " + nome);
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(nome + " é bolsista, pagamento facilitado!");
    }
}
