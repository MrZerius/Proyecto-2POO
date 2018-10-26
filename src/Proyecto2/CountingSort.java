package Proyecto2;

public class CountingSort {
	
	private static final int Max_Rango = 1000000; //Variable constante
	
	public static void CountingSort(int[] arreglo) {
		
		long Tpinicial,Tpfin,tiempo;
		double segundos;
		Tpinicial = System.nanoTime();
		OrdenamientoCountingSort(arreglo);
		Tpfin = System.nanoTime();
		tiempo = Tpfin - Tpinicial;
		segundos = (double) tiempo / 1000000000;
		System.out.println(" El tiempo de ordenamiento es : "+String.format("%.9f",segundos )+" segundos");
		System.out.println(" ");
		System.out.println("...");
		new java.util.Scanner(System.in).nextLine();
		System.out.println(" ");
		System.out.println("Ordenamiento por CountingSort");
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
	
	
	private static void OrdenamientoCountingSort(int[] arreglo) 
	{
		int n = arreglo.length;
        if (n == 0)
        {
            return;
        }
        
        int max = arreglo[0], min = arreglo[0];
        for (int i = 1; i < n; i++)
        {
            if (arreglo[i] > max)
                max = arreglo[i];
            if (arreglo[i] < min)
                min = arreglo[i];
        }
        int rango = max - min + 1;
 
        
        if (rango > Max_Rango)
        {
            System.out.println("\nError : Sobrepaso El Rango Maximo");
            return;
        }
 
        int[] count = new int[rango];
      
        for (int i = 0; i < n; i++)
            count[arreglo[i] - min]++;
       
        for (int i = 1; i < rango; i++)
            count[i] += count[i - 1];
        
        int j = 0;
        for (int i = 0; i < rango; i++)
            while (j < count[i])
                arreglo[j++] = i + min;
	}
}