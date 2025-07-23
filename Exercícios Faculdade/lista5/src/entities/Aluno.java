package entities;

public class Aluno {
	public String nome;
	public double nota1,nota2,nota3;
	
	public double calcularNotaFinal() {
		return nota1+nota2+nota3;
	}
	
	public boolean aprovado() {    //mandou usar boolean
		return calcularNotaFinal() >=60.0;
	}
	
	public double pontosFaltam() {
		return aprovado() ? 0.0 : 60.0 - calcularNotaFinal();
	}

}
