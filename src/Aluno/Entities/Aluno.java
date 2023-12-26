package Aluno.Entities;

public class Aluno {
    private String nome;
    private float n1, n2, n3;

    public Aluno(String nome, float n1, float n2, float n3){
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public String soma(){
        float soma = n1 + n2 + n3;
        if(soma >= 60)
            return String.format("Nota final: %.2f\nPassou", soma);
        
        return String.format("Nota final: %.2f\nReprovado\nFaltou %.2f", soma, 60-soma);
    }
}
