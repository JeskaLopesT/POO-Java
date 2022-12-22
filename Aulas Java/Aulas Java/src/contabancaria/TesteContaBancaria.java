package contabancaria;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		// aqui estamos instanciando um novo objeto de conta bancaria usando a classe conta bancaria. Usando o método construtor, passamos todos os dados para preecher os atributos dessa nova conta gerada
		ContaBancaria novaConta = new ContaBancaria(12, 65, 2, "Carol", 1200f);
		
		
		// cada system.out.print está retornando os dados da nova conta criada, usando os metodos acessores get, lembrando que get é para mostrar os dados, e set é para inserir os dado. 
		System.out.println("Numero da Conta  "+ novaConta.getNumero());
		System.out.println("Numero da Agencia "+ novaConta.getAgencia());
		System.out.println("Numero do Tipo "+ novaConta.getTipo());
		System.out.println("Numero da Titular "+ novaConta.getTitular());
		System.out.println("Numero da Saldo "+ novaConta.getSaldo());
		
		
		// aqui estamos testando o metodo especifico criado para a classe de conta, que é o sacar, informando diretamente o valor a ser sacado da conta criada.
		novaConta.sacar(20000);
	
	}

}
