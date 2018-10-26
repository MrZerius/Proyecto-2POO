package Proyecto2;

public class Mezcla {
	
	public void Mezcla(int[] arreglo){
		
		int[] tmp = new int[arreglo.length];
		long Tinicial,Tfin,tiempo;
		double segundos;
		Tinicial = System.nanoTime();
		Merge(arreglo,tmp,0,arreglo.length-1);
		Tfin = System.nanoTime();
		tiempo = (Tfin - Tinicial);
		segundos = (double) tiempo / 1000000000;
		System.out.println(" El tiempo de ordenamiento es: "+String.format("%.9f",segundos )+" segundos");
		System.out.println(" ");
		System.out.println("Presiona una tecla para ver....");
		new java.util.Scanner(System.in).nextLine();
		System.out.println(" ");
		System.out.println("Ordenamiento Mecla");
		System.out.println(" ");
		System.out.println("Ordenando Valores....");
		int contador = 1;
		
		for(int i=0;i<arreglo.length;i++)
		{
			System.out.print(arreglo[i]+"\t");
			if(contador%18 == 0)
			{
				System.out.println(" ");
			}else {
				
			}
			contador++;
		}
		
		System.out.println(" ");
		System.out.println("Presiona una tecla para volver al menu...");
		new java.util.Scanner(System.in).nextLine();
		
	}
	
	private static void Merge(int[] arreglo,int [] tmp,int izq, int der)
	{
		if(izq<der)
		{
			int centro = (izq + der)/2;
			Merge(arreglo,tmp,izq,centro);
			Merge(arreglo,tmp,centro+1,der);
			OrdenamientoMezcla(arreglo,tmp,izq,centro+1,der);
		}
	}
	
	private static void OrdenamientoMezcla(int[] arreglo, int[] tmp,int izq, int der, int rend)
	{
		int lend = der-1;
	    int tpos = izq; 
	    int lbeg = izq;
	  
	    while(izq <= lend && der <= rend){
	         if(arreglo[izq] < arreglo[der]){
	               tmp[tpos++] = arreglo[izq++];
	         }else{
	               tmp[tpos++] = arreglo[der++];
	         }
	    }
	    while(izq <= lend){
	         tmp[tpos++] = arreglo[izq++];
	    }
	    while(der <= rend){
	         tmp[tpos++] = arreglo[der++];
	    }
	    for(tpos = lbeg; tpos <= rend; tpos++){
	         arreglo[tpos] = tmp[tpos];
	    }
		
		
	}
}