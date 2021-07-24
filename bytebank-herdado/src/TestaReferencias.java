
public class TestaReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setSalario(5000);
		System.out.println("Gerente - Salário: " + g1.getSalario() + 
				", bonificação: " + g1.getBonificacao());
		
		EditordeVideo ev = new EditordeVideo();
		ev.setSalario(2500);
		System.out.println("Edito de Vídeo - Salário: " + ev.getSalario() +
				", bonificação: " + ev.getBonificacao());
		
		Designer d1 = new Designer();
		d1.setSalario(2000);
		System.out.println("Designer - Salário: " + d1.getSalario() + 
				", bonificação: " + d1.getBonificacao());
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());
	}

}
