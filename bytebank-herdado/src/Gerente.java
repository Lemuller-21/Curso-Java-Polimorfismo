
public class Gerente extends Funcionario implements Autenticavel {
	private Autenticador autenticador;

	public Gerente() {
		this.autenticador = new Autenticador();
	}
	
	public double getBonificacao() {
		return (super.getSalario() * 0.1) + super.getSalario();
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
}
