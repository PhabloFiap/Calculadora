package br.com.fiap.socketTcpCalc;

import java.io.Serializable;

public class Requisicao implements Serializable{
	
	private float op1;
	private float op2;
	private char operacao;
	
	public Requisicao(float op1, float op2, char operacao) {
		super();
		this.op1 = op1;
		this.op2 = op2;
		this.operacao = operacao;
	}

	public Requisicao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getOp1() {
		return op1;
	}

	public float getOp2() {
		return op2;
	}

	public char getOperacao() {
		return operacao;
	}
	
	
	
	
	
	
	

}
