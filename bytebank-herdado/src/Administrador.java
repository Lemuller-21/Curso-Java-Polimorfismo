
public class Administrador extends Funcionario implements Autenticavel {
	private Autenticador autenticador;

	public Administrador() {
		this.autenticador = new Autenticador();
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public double getBonificacao() {
		return 500;
	}

}
