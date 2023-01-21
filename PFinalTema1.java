
public class PFinalTema1 {

	public static void main(String[] args) {
		int num=0;
		int y=0, x=0;
		String raya="-------------------------------------------";
		String subraya=raya.substring(0, raya.length()/2);
		System.out.println(raya);
		System.out.println("Primeros 25 enteros");
		while(num<=25) {			
			if(num!=25){
				System.out.print(num+", ");
			}else {
				System.out.println(num);
			}
			num++;
		}
		System.out.println(raya);
		System.out.println("Primeros 25 pares");
		num=0;
		
		while(num<=25) {			
			if(num!=25){
				System.out.print(num*2+", ");
			}else {
				System.out.println(num*2);
			}
			num++;
		}
		
		num=1;
		System.out.println(raya);
		System.out.println("Primeros 25 impares");
		while(num<=25) {			
			if(num!=25){
				System.out.print((num*2-1)+", ");
			}else {
				System.out.println(num*2-1);
			}
			num++;
		}
		
		System.out.println();
		System.out.println(raya);
		System.out.println("TABLAS DE MULTIPLICAR");
		System.out.println(raya);		
		
		while(x<10) {
			x++;//Aumento la primera unidad
			y=0;//Reset de la segunda unidad
			System.out.println(subraya);
			System.out.println("La tabla de "+x+":");
			while(y<=9) {
				System.out.println(x+"*"+y+"="+(x*y));
				y++;//Aumento la segunda unidad			
				
				if(y==10) {
					System.out.println(x+"*"+y+"="+(x*y));
					y++;
				}
			}					
		}
		
	}
}
