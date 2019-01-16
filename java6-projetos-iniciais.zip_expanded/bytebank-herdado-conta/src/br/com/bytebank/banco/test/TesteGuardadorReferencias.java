package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {
	
	public static void main(String[] args) {
	
		
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(11, 22);
		guardador.adiciona(cc);
		
		Conta cp = new ContaPoupanca(22, 33);
		guardador.adiciona(cp);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
