package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
//		/nt[] idades = new int[5];
		ContaCorrente[] contas = new ContaCorrente[5];
		ContaCorrente cc1 = new ContaCorrente(11, 22);
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(22, 33);
		contas[1] = cc2;
		
		
//		System.out.println(cc2.getNumero());
		
		System.out.println(contas[1].getNumero());
		
		ContaCorrente ref = contas[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());

	}
		
}
