package br.com.zavala.Exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.zavala.Domain.Pessoa;

/**
 * 
 * @author Ramiro
 *
 * Descrição : 
 *  • Ler do console o Nome e o Sexo da pessoa,
    • Guardar os dados em coleções,
    • Separar por : Grupo Masculino, Grupo Feminino,
    • Imprimir o conteúdo das duas coleções.
 */

public class ExercicioModulo11 {

	public static void main(String[] args) {
		List<Pessoa> masculino = new ArrayList<Pessoa>();
		List<Pessoa> feminino = new ArrayList<Pessoa>();
		
		//Leitura dos dados
		try (Scanner s = new Scanner(System.in)) {
			String leitura = "N";
			String nome,sexo;
			Pessoa p1;
			System.out.println("LEITURA DE DADOS DAS PESSOAS");
			System.out.println("============================");
			do {
				System.out.println("Nome : ");
				nome = s.next();
				System.out.println("Sexo(M/F) : ");
				sexo = s.next();
				p1 = new Pessoa(nome,sexo);
				//--
				if(sexo.equals("M"))
					masculino.add(p1);
				else if(sexo.equals("F"))
					feminino.add(p1);
				//--
				System.out.println("");
				System.out.println("==> Digite a letra [S] para inserir novo registro : ");
				leitura = s.next();
			} while(leitura.equals("S"));
		}
		
		//Impressão dos dados
		System.out.println("");
		imprimePessoa(masculino, feminino);
	}
	
	private static void imprimePessoa(List<Pessoa> masculino, List<Pessoa> feminino) {
		System.out.println("Pessoas do sexo Masculino :");
		System.out.println("---------------------------");
		Collections.sort(masculino);
		System.out.println(masculino);
		System.out.println("");
		System.out.println("Pessoas do sexo Feminino :");
		System.out.println("---------------------------");
		Collections.sort(feminino);
		System.out.println(feminino);
	}

}
