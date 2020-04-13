
package projetopessoas.pessoa;

public abstract class Pessoa {
    
    // Atributos:
    protected String nome;
    protected int idade;
    protected String sexo;

    
    // Gets e Sets:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //--------------------------------------------------------------------------
    
    // Método fazer aniversário:
    public void fazerAniversario(){
        idade++;
    }

    @Override
    public String toString() {
        return "====== Pessoa ======" 
                + "\nNOME: " + nome 
                + "\nIDADE: " + idade 
                + "\nSEXO: " + sexo;
    }
    
    
    
}
