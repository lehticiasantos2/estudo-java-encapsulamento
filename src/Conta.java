

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; 
	
	//métodos: nome_do_metodo(tipo o que envia o que e recebido)
	
	public void deposita(double valor) {
		
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		//verificando se a conta tem saldo para sacar
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if(this.saldo >= valor) {
			saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
		
	}
	
	//Metodo que devolve o saldo
	
	public double pegaSaldo(){
		return this.saldo;
		
		
	}
	
	///=Metodo que devolve o numero da conta
	public int getNumero() {
		return this.numero;
		
	}
	
	//Metodo que altera o numero da conta
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
		
		
	}
	
	
	
	
	

}
