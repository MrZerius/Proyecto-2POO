package Proyecto2;



public class HeapSort {
	
	public static void HeapSort(int[] arreglo) {
		
		long Tinicial,Tfin,tiempo;
		double segundos;
		Tinicial = System.nanoTime();
		OrdenamientoHeapSort(arreglo);
		Tfin = System.nanoTime();
		tiempo = Tfin - Tinicial;
		segundos = (double) tiempo / 1000000000;
		System.out.println(" El tiempo de ordenamiento es: "+String.format("%.9f",segundos )+" segundos");
		System.out.println(" ");
		System.out.println("...");
		new java.util.Scanner(System.in).nextLine();
		System.out.println(" ");
		System.out.println("Ordenamiento Por HeapSort");
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
	
	
	private static void OrdenamientoHeapSort(int[] arreglo)
	{
		int n = arreglo.length;
		for(int i= n/2 - 1;i>=0;i--)
		{
			hearsort(arreglo,n,i);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			int temp = arreglo[0];
			arreglo[0] = arreglo[i];
			arreglo[i] = temp;
			
			hearsort(arreglo,i,0);
		}
		
	}
	
	private static void hearsort(int[] arreglo,int n,int i)
	{
		int largo = i;
		int l = 2*i + 1;
		int r = 2*i + 2;
		
		if(l<n && arreglo[l] > arreglo[largo])
		{
			largo = l;
		}
		
		if(r<n && arreglo[r] > arreglo[largo])
		{
			largo = r;
		}
		
		if(largo!=i)
		{
			int swap = arreglo[i];
			arreglo[i] = arreglo[largo];
			arreglo[largo] = swap;
			
			hearsort(arreglo,n,largo);
 		}
	}
	
}