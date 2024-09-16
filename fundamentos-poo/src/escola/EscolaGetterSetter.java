package escola;
public class EscolaGetterSetter {
    public static void main(String[] args) {
		AlunoGetterSetter felipe = new AlunoGetterSetter();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		//se eu dugutar felipe.set, ele já me dá uma base para automatizar
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
    }    
}    