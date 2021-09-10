class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta (int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta: " + this.numero);
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		if(valor <= 0) {
			System.out.println("Valor Inválido");
		}
	}
	
	public boolean sacar(double valor) {
		if(saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir (double valor, Conta destino) {
		if(saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
				return true;
		}
		return false;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero () {
		return this.numero;
	}
	
	public void setTitular (Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setAgencia (int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia () {
		return this.agencia;
	}
	
	public double getSaldo () {
		return this.saldo;
	}
	
	public static int getTotal () {
		return Conta.total;
	}
}