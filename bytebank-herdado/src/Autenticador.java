
public class Autenticador {
	private int senha;
	
	public boolean autentica(int senha) {
		if (senha == this.senha) {
			return true;
		}
		return false;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
