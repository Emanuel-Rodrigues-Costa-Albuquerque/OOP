package entities;

public class Dollar {
	
	public static double iof(double iofvalue) { 
		return iofvalue * ((6.00 / 100.00 ) + 1.00 );
	}
	
	public static double converter(double qtdreais , double cotacao) {
		return qtdreais * cotacao;
	}
}
