//Exemplo For em Arrays

public class ExemploForArrays {
	public static void main(String[] args) {
		String equipes[] = {"GUARANI", "PONTE PRETA", "PAULISTA DE JUNDIAÍ", "INTER DE LIMEIRA"};
		
		for (int x=0; x<equipes.length; x++) {
		    System.out.println("Equipe x = " + x + " é a equipe " + equipes[x]);
		    
		/*
		Forma abreviada
		for(String equipe : equipes) {
		    System.out.println("Nome da equipe é: " + equipe)
		}
		*/
	
		
		if("PONTE PRETA".equals(equipes[1])) {
		    System.out.println("PONTE PRETA nunca serão!!!");
		    System.out.println ("As outras equipes são campeãs!!!");
	  }
      }	
   }
}
