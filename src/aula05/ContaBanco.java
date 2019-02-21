package aula05;

public class ContaBanco {
	public int numConta;
	protected String tipoConta;
	private String titularConta;
	private float saldo;
	private boolean status;
	
	public void abrirConta(){
		
	}
	
	public void fecharConta(){
		
	}
	
	public void depositar(){
		
	}
	
	public void sacar(){
		
	}
	
	public void pagarMensal(){
		
	}

	public ContaBanco(int numConta, String tipoConta, String titularConta, float saldo) {
		super();
		this.numConta = numConta;
		this.tipoConta = tipoConta;
		this.titularConta = titularConta;
		this.saldo = 0;
		this.status = false;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
