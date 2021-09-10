
public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new Conta(102030, 5447);
		conta.setNumero(102030);
		Cliente anderson = new Cliente();
		conta.setTitular(anderson);
		anderson.setNome("Anderson Silva");
		anderson.setProfissao("Programador");
		anderson.setCpf("000.000.000-00");
		conta.depositar(100);
		conta.sacar(50);
		
		Cliente titularDaConta = conta.getTitular();
		System.out.println(titularDaConta.getNome());
		System.out.println(conta.getTitular().getCpf());
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(conta.getSaldo());

	}

}
