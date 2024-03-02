package br.com.fiap.socketTcpCalc;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	static Conexao c;
	static Socket socket;
	
	public Cliente() {
			try {
				socket = new Socket("localhost", 9600);
			} catch (IOException e) {
				System.err.println("Não consegui resolver o host..." );
				
			}
		
	}
	
	public static void main(String[] args) throws IOException {
		
	try {	
		new Cliente();
		float op1, op2;
		char oper;
		Scanner in = new Scanner(System.in);
		
		System.out.println("*****************************");
		System.out.println("*** CALCULADORA DISTRUIBUIDA ***");
		System.out.println("*****************************");
		
		System.out.println("Digite o primeiro numero");
		op1 = in.nextFloat();
		System.out.println("Digite o segundo numero");
		op2 = in.nextFloat();
		System.out.println("Escolha uma operação");
		System.out.println("(+) SOMA (-)SUBTRAÇÃO (x) MULTIPLICAÇÃO (/) DIVISAO");
		oper = in.next().charAt(0);
		
		Requisicao msgReq = new Requisicao(op1, op2, oper);
		c.send(socket, msgReq);
		Resposta msgRep = (Resposta) c.receive(socket);
		
		switch (msgRep.getStatus()) {
		case 0:
			System.out.println("Resultado = " + msgRep.getResult());
			break;
		case 1:
			System.out.println("Operação nao implementada");
			break;

		default:
			System.out.println("Divisao por Zero");
			break;
			}
		}
		catch (Exception e) {
			System.out.println("Problema ao fechar socket");
		} finally {
			socket.close();
		}

	}
	
}
