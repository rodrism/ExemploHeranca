
public class Conta {
	protected String NomeTitular;
	protected String cpf;
	protected int numConta;
	protected float saldo;

	public Conta(String nomeTitular, String cpf, int numConta, float saldo) {
		super();
		NomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public boolean debitar(float valor) {

		if (valor <= this.saldo) { 
			this.saldo = this.saldo - valor;
			System.out.println("Debito efetuado com sucesso! Saldo atual:  " + this.saldo);
			return true;
		} else {
			System.out.println("Saldo insuficiente!");
			return false;
		}
	}
	
	public void creditar(float valor) {
		this.saldo = this.saldo + valor;
	}


	public String getNomeTitular() {
		return NomeTitular;
	}



	public void setNomeTitular(String nomeTitular) {
		NomeTitular = nomeTitular;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public int getNumConta() {
		return numConta;
	}



	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}



	public float getSaldo() {
		return saldo;
	}



	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
