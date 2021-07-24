
public class TestaSistema {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setSenha(2222);
		g1.setSalario(5000);
		
		Administrador adm = new Administrador();
		adm.setSenha(2222);
		adm.setSalario(2000);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g1);
		si.autentica(adm);
		si.autentica(cliente);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		controle.registra(adm);
		
		System.out.println(controle.getSoma());

	}

}
