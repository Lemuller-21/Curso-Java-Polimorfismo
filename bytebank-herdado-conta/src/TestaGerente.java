
public class TestaGerente {

	public static void main(String[] args) {

		Gerente ge = new Gerente();
		
		ge.setNome("Muliro");
		ge.setCpf("444.444.444-44");
		ge.setSalario(5000);
		ge.setSenha(2223);
		
		int senha = 2222;
		
		System.out.println(ge.getNome());
		System.out.println(ge.getCpf());
		System.out.println(ge.getSalario());
		System.out.println(ge.autentica(senha));
		System.out.println(ge.getBonificacao());
		
	}

}
