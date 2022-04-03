
public class Main {

	public static void main(String[] args) {
		Cliente Alessandro = new Cliente();
		Alessandro.setNome("Alessandro");
		
		Conta cc = new ContaCorrente(Alessandro);
		Conta poupanca = new ContaPoupanca(Alessandro);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
