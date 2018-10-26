package Proyecto2;

public class QuickSort {
	
	public static void QuickSort(int[] arreglo)
	{
		long Tpinicial,Tpfin,tiempo;
		double seg;
		int n=arreglo.length;
		Tpinicial = System.nanoTime();
		OrdenamientoQuicksort(arreglo,0,n-1);
		Tpfin = System.nanoTime();
		tiempo = (Tpfin - Tpinicial);
		seg = (double) tiempo / 1000000000;
		System.out.println(" El tiempo de ordemaniento es: "+String.format("%.9f",seg )+" segundos");
		System.out.println(" ");
		System.out.println("...");
		new java.util.Scanner(System.in).nextLine();
		System.out.println(" ");
		System.out.println("Ordenamiento Por QuickSort");
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
		System.out.println("...");
		new java.util.Scanner(System.in).nextLine();
		
	}
	
	
	
	private static void OrdenamientoQuicksort(int arreglo[],int limite_izq, int limite_der) {
		int temporal;
		int izq = limite_der; 
		int der = limite_izq; 
		int pivote = arreglo[(izq+der)/2]; 
		do {
			while(arreglo[izq]< pivote && izq < limite_der)izq ++;
			while(pivote<arreglo[der] && der > limite_izq)der --;
			if(izq <= der)
			{
				temporal = arreglo[izq]; 
				arreglo[izq] = arreglo[der];
				arreglo[der] = temporal;
				izq++;
				der--;
			}
		}while(izq<=der);
		if(limite_izq < der)
		{
			OrdenamientoQuicksort(arreglo,limite_izq,der);
		}else if(limite_der > izq)
		{
			OrdenamientoQuicksort(arreglo,izq,limite_der);
		}
	}
}