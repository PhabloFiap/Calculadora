package br.com.fiap.socketTcpCalc;

public class Resposta implements java.io.Serializable{
	
	private int status;
	private float result;
	
	public Resposta(int status, float result) {
		super();
		this.status = status;
		this.result = result;
	}
	public Resposta () {
		
	}
	public int getStatus() {
		return status;
	}
	public float getResult() {
		return result;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setResult(float result) {
		this.result = result;
	}
	
	
	

}
