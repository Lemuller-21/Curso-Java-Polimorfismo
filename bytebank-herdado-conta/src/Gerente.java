
public class Gerente extends Funcionario implements Autenticavel {
	int senha;

	public boolean autentica(int senha) {
		if (senha == this.senha) {
			return true;
		}
		return false;
	}
	
	public double getBonificacao() {
		return (super.getSalario() * 0.10) + super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
