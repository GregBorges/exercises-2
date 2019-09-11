package Aula05;

public class ContaBanco {
	// atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	// m�todos
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		
		if (tipo == "CC") { // se for conta corrente
			this.setSaldo(50); 
			System.out.println("Conta corrente aberta com sucesso!");
		}
		else { // se for conta poupan�a
			this.setSaldo(150);
			System.out.println("Conta poupan�a aberta com sucesso!");
		}
	}
	
	public void fecharConta() {
		if (this.saldo > 0) 
			System.out.println("Conta n�o pode ser fechada pois est� com dinheiro");
		
		else if (this.saldo < 0) 
			System.out.println("Conta n�o pode ser fechada pois est� em d�bito");

		else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}
	
	public void depositar(float valor) {
		if(getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("A quatia de " +valor+ " foi depositada com sucesso na conta de " +this.getDono());
		}
		else 
			System.out.println("Imposs�vel depositar em uma conta fechada");
	}
	
	public void sacar(float valor) {
		if(getStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("A quatia de " +valor+ " foi sacada com sucesso da conta de " +this.getDono());
			}
			else 
				System.out.println("Saldo insuficiente");
		}
		else 
			System.out.println("Imposs�vel sacar em uma conta fechada");
	}
	
	public void pagarMensalidade() {
		int v;
		
		if(this.getTipo() == "CC") // se for conta corrente
			v = 12;
		else // se for conta poupanca (CP)
			v = 20;
		
		if(this.getStatus()) {
			if(this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso da conta de " +this.getDono());
			}
			else 
				System.out.println("Saldo insuficiente");
		}
		else
			System.out.println("Imposs�vel sacar em uma conta fechada");
	}
	
	public void estadoAtual() {
		System.out.println("=============== Informa��es da conta ===============");
		System.out.println("N�mero da conta: " +this.getNumConta());
		System.out.println("Nome do dono: " +this.getDono());
		System.out.println("Tipo de conta: " +this.getTipo());
		System.out.println("Saldo: " +this.getSaldo());
		System.out.println("Status: " +this.getStatus());
	}
	
	// construtor
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	// m�todos acessores e modificadores
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
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
