package avaliacao.resposta;

public class Solucao {

    public static void main(String[] args) { 

    	String a = "10";
    	String b = "2010";
        if(a.length() > b.length()){
        	Calcular(a,b);
        }else{
        	Calcular(b,a);
        }

    }

	public static void Calcular(String a, String b) {

	    if (a != null && b != null) {

	        StringBuilder c = new StringBuilder();
	        System.out.println("Valores: " + a + " - " + b);
	        int iCont = 0;
	        int j = 0;

	        voltar: 
	        for (; iCont <= a.length();) {
	            System.out.println(iCont);
	            int proxi = iCont + 1;
	            if (proxi <= a.length()) {
	                c.append(a.substring(iCont, proxi)).toString();
	            }
	            iCont++;

	            for (; j <= b.length();) {
	                System.out.println(j);
	                int proxj = j + 1;
	                if (proxj <= b.length()) {
	                    c.append(b.substring(j, proxj)).toString();
	                }
	                j++;

	                continue voltar;

	            }
	        }
	        
	        try {
	            int valor = Integer.valueOf(c.toString()).intValue();
	            if (valor < 1000000) {
	                System.out.println("Sa�da: " + c);
	            } else {
	                valor = -1;
	                System.out.println("Maior que 1.000.000:" + valor);
	            }
	        }catch (Exception e) {
	            int valor = -1;
	            System.out.println("Ocorreu um erro: "+ e +" o valor �: "+valor);
	        }
	    }
	}

}
