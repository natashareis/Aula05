package aula05;

public class ContaBanco {
	public int numConta;
	protected String tipoConta;
	private String titularConta;
	private float saldo;
	private boolean status;
	
	//metodos personalizados
	
	public void estadoAtual(){
		System.out.println("Conta: "+this.getNumConta());
		System.out.println("Titular: "+this.getTitularConta());
		System.out.println("Tipo conta: "+this.getTipoConta());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
	}
	
	public void abrirConta(String t){
		this.setTipoConta(t);
		this.setStatus(true);
		if (t =="CC"){ //if("CC".equals(t)
			this.setSaldo(50);
		}else if (t=="CP"){
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta(){
		if (this.getSaldo()>0){
			System.out.println("Conta não pode ser fechada pois ainda tem dinheiro");
		} else if(this.getSaldo()<0){
			System.out.println("Conta não pode ser fechada com saldo devedor");
		}else{
		this.setStatus(false);
		System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar(float v){
		if (this.getStatus()){
			this.setSaldo(this.getSaldo()+v);
			System.out.println("Deposito efetuado com sucesso. Novo saldo: " + this.getSaldo());
		} else{
			System.out.println("Impossível depositar em uma conta desativada!");
		}
		
	}
	
	public void sacar(float v){
		if(this.getStatus()){
			if(this.getSaldo()>=v){
				this.setSaldo(this.getSaldo()-v);
				System.out.println("Saque realizado com sucesso na conta de "  + this.getTitularConta() + ", saldo atual da conta: " + this.getSaldo());
			}else{
				System.out.println("Saldo insuficiente, saldo atual: " + this.getSaldo());
			}
		}else{
			System.out.println("Não é possível efetuar saque em uma conta inativa!");
		}
		
	}
	
	public void pagarMensal(){
		int v=0;
		if(this.getTipoConta()=="CC"){
			v=12;
		}else if(this.getTipoConta()=="CP"){
			v=20;
		}
		if (this.getStatus()){
			this.setSaldo(this.getSaldo()-v);
			System.out.println("Mensalidade paga com sucesso por: " + this.getTitularConta());
		}else{
			System.out.println("Impossível pagar mensalidade de uma conta inativa");
		}
	}
	
	//métodos especiais
	
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

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
