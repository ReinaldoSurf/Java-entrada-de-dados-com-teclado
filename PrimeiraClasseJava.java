package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	/*Main � um metodo auto execut�vel em Java*/
	public static void main(String[] args) {
	
		// new Aluno() � uma inst�ncia - Cria��o do objeto
		// aluno1 � uma refer�ncia para o objeto aluno
		
		//Entrada de dados
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno:");
		String idade = JOptionPane.showInputDialog("Qual a idade:");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento:");
		String rg = JOptionPane.showInputDialog("Registro Geral:");
		String cpf = JOptionPane.showInputDialog("Qual o CPF:");
		String mae = JOptionPane.showInputDialog("Nome da m�e:");
		String pai = JOptionPane.showInputDialog("Nome do pai:");
		String matricula = JOptionPane.showInputDialog("Data da matricula:");
		String serie = JOptionPane.showInputDialog("Qual a S�rie:");	
		String escola = JOptionPane.showInputDialog("Nome da escola:");
		String note1 = JOptionPane.showInputDialog("Nota 1:");
		String note2 = JOptionPane.showInputDialog("Nota 2:");
		String note3 = JOptionPane.showInputDialog("Nota 3:");
		String note4 = JOptionPane.showInputDialog("Nota 4:");
	
				
		//instancia classe aluno 
		
		Aluno aluno1 = new Aluno();
		
		//Inicializando os objetos
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(note1));
		aluno1.setNota1(Double.parseDouble(note2));
		aluno1.setNota1(Double.parseDouble(note3));
		aluno1.setNota1(Double.parseDouble(note4));
		
		//Sa�das dps dados no console
		System.out.println("Nome do aluno � "  + aluno1.getNome());
		System.out.println("A idade do aluno � "  + aluno1.getIdade() + " anos de idade");
		System.out.println("Nascimento � "  + aluno1.getDataNascimento());
		System.out.println("M�dia da nota � "  + aluno1.getMediaNota());
		System.out.println("Registro Geral � "  + aluno1.getRegistroGeral());
		System.out.println("O numero do CPF � "  + aluno1.getNumeroCpf());
		System.out.println("O nome da m�e � "  + aluno1.getNomeMae());
		System.out.println("O nome do pai � "  + aluno1.getNomePai());
		System.out.println("A data da matr�cula � "  + aluno1.getDataMatricula());
		System.out.println("O n�mero da s�rie � "  + aluno1.getSerieMatriculado());
		System.out.println("O nome da escola � "  + aluno1.getNomeEscola());
		
		//Calculando as notas informadas
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	
		// Outra forma de calcular as notas
		
	   // System.out.println("Resultado 2: " + aluno1.getAlunoAprovado2());
		
	}
	
}
