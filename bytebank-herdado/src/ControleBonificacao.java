
public class ControleBonificacao extends Funcionario{
	double soma;
	
	public void registra(Funcionario funcionario) {
		this.soma += funcionario.getBonificacao();
	}
	
	public double getBonificacao() {
		return 0.0;
	}
	
	public double getSoma() {
		return this.soma;
	}
}
