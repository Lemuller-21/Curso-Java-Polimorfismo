
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(2222, 2223);
		cc.deposita(100);
		System.out.println(cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(2222, 2224);
		cp.deposita(100);
		
		cc.transfere(10, cp);
		System.out.println("cc: " + cc.getSaldo());
		System.out.println("cp: " + cp.getSaldo());
		
		cc.deposita(0.2);
		System.out.println(cc.getSaldo());
		
	}

}
