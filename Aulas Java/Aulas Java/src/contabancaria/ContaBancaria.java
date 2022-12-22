package contabancaria;

//nome do objeto
public class ContaBancaria {
	
	// atributos-caracteristicas do objeto
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	//metodos construtores da classe Conta Bancaria
	
	public ContaBancaria(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public ContaBancaria() {}


	// metodos acessores da classe Conta Bancaria - precisa ter em todos os objetos criados, pois sem eles não conseguimos nem visualizar as informações, nem inserir novas informações aos novos objetos criados a partir dessa classe.

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	//metodos específicos de conta bancaria - depende de objeto para objeto, e temos que levar em consideração sempre qual é o objeto a ser criado, e criar métodos específicos de acordo com a funcionalidade de cada objeto
	//aqui criamos o metodo sacar, que recebe como parametro um valor a ser sacado. ele precisa ter obrigatóriamente o mesmo tipo de dado do saldo, que é o valor que vai ser modificado a partir do saque, no caso os dois precisam ser float
	public boolean sacar(float valorSacado) {
		// antes de tudo eu faço uma verificação,pegando o saldo da minha conta a partir do getSaldo, e comparando se o valor do saldo é maior que o valor a ser sacado. se não for eu já barro o usuario na hora, indicando que o saldo é insuficiente e retornando um false na função, mostrando que o saque não foi realizado
		if(this.getSaldo() < valorSacado) {
			System.out.println("Saldo insuficiente, tente quando estiver rico");
			return false;
		}
		
		// caso o valor sacado for menor que o do saldo, eu faço então a operação de saque, pegando novamente o valor do saldo, e subtraindo o valor do saque
		
		this.setSaldo(this.getSaldo() - valorSacado);
		// por ultimo eu mostro ao meu usuário o valor sacado, e quando sobrou na conta, retornando true, o saque foi feito 
		System.out.println("Valor de" + valorSacado + " sacado com sucesso! O seu valor de saldo agora é "+ this.getSaldo());
		return true;
	}
}
