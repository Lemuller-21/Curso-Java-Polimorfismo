
public class Gerente extends Funcionario {
	int senha;

	public boolean Autentica(int senha) {
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
