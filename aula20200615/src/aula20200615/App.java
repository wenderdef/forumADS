package aula20200615;

public class App {
	
	public static void main(String[] args) {
		
		Endereco endWender1 =  new Endereco("av.Bernardo Say�o",00,"Supermercado","Novo Horizonte","Campinorte","Goi�s",false);
		Endereco endWender2 =  new Endereco("av.Jose Alves Nendo",159,"bloco 07 Ap 01","Jardim S�o Silvestre","Maring�","Paran�",true);
		Endereco endWender3 =  new Endereco("R. Inha�ma",398,"casa","Zona 3","Maring�","Paran�",false);
		Alunos aluno = new Alunos(1);
		aluno.setNome("Wender");
		aluno.setSobrenome("Rezende Custodio");
		aluno.setDataNascimento("25/04/1994");
		aluno.addEndereco(endWender1);
		aluno.addEndereco(endWender2);
		aluno.addEndereco(endWender3);
		
		Endereco end = new Endereco("R. Rosana",398,"casa","Sol nascente","Maring�","Paran�",true);
		
		
		Avalistas ava =  new Avalistas(1);
		ava.setNome("Jubiscleison");
		ava.setSobrenome("Alves");
		ava.setDataNascimento("03/11/1965");
		ava.addEndereco(end);
		
		ContratosEducacionais c01 = new ContratosEducacionais(1,ava,aluno);
		aluno.addContrato(c01);
		
				
		Endereco endClovis1 =  new Endereco("Rua Pequi",79,"Casa","Sul","Urua�u","Goi�s",true);
		Endereco endClovis2 =  new Endereco("Viela da Solidao",666,"Cafofo","Zona da Tia","Maring�","Paran�",false);
		Coordenadores cordClovis = new Coordenadores(1);
		cordClovis.setNome("Clovis");
		cordClovis.setSobrenome("Bomdapeste");
		cordClovis.setDataNascimento("24/05/1970");
		cordClovis.addEndereco(endClovis1);
		cordClovis.addEndereco(endClovis2);
		
		System.out.println("Aluno matriculado? "+aluno.statusAlunos());
		
		Endereco endArquino =  new Endereco("Av das gra�as",145,"Barraco","Jaco","Estrela","Goi�s",true);
		Professor pfArquino = new Professor(1);
		pfArquino.setNome("Arquino");
		pfArquino.setSobrenome("Antigo");
		pfArquino.setDataNascimento("01/01/07");
		pfArquino.addEndereco(endArquino);
		
		
		Cursos calculo = new Cursos("Calculo",1,cordClovis);
		Turma turma1 = new Turma("Turma 1 Calculo",1,calculo);
		Disciplina BioQuimica =  new Disciplina(1,"BioQuimica");
		
	}

}
