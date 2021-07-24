
public class Cliente implements Autenticavel {
	private Autenticador autenticador;

	public Cliente() {
		this.autenticador = new Autenticador();
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

}
