// qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro
public class SistemaIbgeEnum {
	public static void main(String[] args) {
		//imprimindo os estados existentes no enum
		for(EstadoBrasileiroEnum e: EstadoBrasileiroEnum.values() ) {
		   //System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo());
		}
		
		//selecionando um estado a partir das opções disponíveis
		EstadoBrasileiroEnum eb  = EstadoBrasileiroEnum.PIAUI;
		
		System.out.println(eb.getNome());
		System.out.println(eb.getSigla());
		System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
       }
}