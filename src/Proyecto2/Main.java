package Proyecto2;

import java.util.Scanner;

import Proyecto2.Insercion;
import Proyecto2.Mezcla;
import Proyecto2.QuickSort;
import Proyecto2.RadixSort;
import Proyecto2.HeapSort;
import Proyecto2.CountingSort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int opc1,opc2,n=0;
		
		do {
			System.out.println(" Seleccione un Metodo de Ordenamiento ");
			System.out.println("\n");
			System.out.println("_______________________________________");
			System.out.println("|       METODOS DE ORDENAMIENTO       |");
			System.out.println("|_____________________________________|");
			System.out.println("|            1. Insercion             |");
			System.out.println("|_____________________________________|");
			System.out.println("|            2. Mezcla                |");
			System.out.println("|_____________________________________|");
			System.out.println("|            3. HeapSort              |");
			System.out.println("|_____________________________________|");
			System.out.println("|            4. Quicksort             |");
			System.out.println("|_____________________________________|");
			System.out.println("|            5. CountingSort          |");
			System.out.println("|_____________________________________|");
			System.out.println("|            6. RadixSort             |");
			System.out.println("|_____________________________________|");
			System.out.println("|            7. Salir                 |");
			System.out.println("|_____________________________________|");
			


			System.out.print("Opcion: ");
			opc1 = sc.nextInt();
		}while(opc1<1 || opc1>7);
		if(opc1 == 7)
		{
			System.out.println(" ");
			System.out.println(" ");
			System.exit(0);
		}

		do {
			System.out.println(" Seleccione Cantidad de datos a generar ");
			System.out.println("\n");
			System.out.println("_______________________________________");
			System.out.println("|            Datos A Generar          |");
			System.out.println("|_____________________________________|");
			System.out.println("|            1. 100 Datos             |");
			System.out.println("|_____________________________________|");
			System.out.println("|            2. 200 Datos             |");
			System.out.println("|_____________________________________|");
			System.out.println("|            3. 500 Datos             |");
			System.out.println("|_____________________________________|");
			System.out.println("|            4. 1000 Datos            |");
			System.out.println("|_____________________________________|");
			System.out.println("|            5. 1500 Datos            |");
			System.out.println("|_____________________________________|");
			System.out.println("|            6. Regresar              |");
			System.out.println("|_____________________________________|");
			opc2 = sc.nextInt();

			System.out.print("Opcion: ");
			opc2 = sc.nextInt();
		}while(opc2<1 || opc2>6);
		if(opc2 == 1)
		{
			n=100;
		}else if(opc2 == 2)
		{
			n=200;
		}else if(opc2 == 3)
		{
			n=500;
		}else if(opc2== 4)
		{
			n=1000;
		}else if(opc2 == 5)
		{
			n=1500;
		}else {
			for(int i=0;i<20;i++)
			{
				System.out.println(" ");
			}
			main(args);
		}
		
		
		
		int arreglo[] = new int[n];
		int contador = 1;
		
		System.out.println("Generando Numeros...");
		System.out.println(" ");
		
	
		for(int i=0;i<n;i++)
		{
			int numeroAleatorio = (int) (Math.random()*99+1);
			arreglo[i] =numeroAleatorio;
			System.out.print(arreglo[i]+"\t");
			if(contador%18 == 0)
			{
				System.out.println(" ");
			}else {
				
			}
			contador++;
		}
		System.out.println(" ");
		System.out.println("Ok para continuar....");
		new java.util.Scanner(System.in).nextLine();
		
	
		switch(opc1)
		{
		case 1:
			Insercion i = new Insercion();
			i.Insercion(arreglo);
			Refrescar();
			main(args);
			break;
		case 2:
			Mezcla m = new Mezcla();
			m.Mezcla(arreglo);
			Refrescar();
			main(args);
			break;
		case 3:
			HeapSort h = new HeapSort();
			h.HeapSort(arreglo);
			Refrescar();
			main(args);
			
			break;
		case 4:
			QuickSort q = new QuickSort();
			q.QuickSort(arreglo);
			Refrescar();
			main(args);
			break;
		case 5:
			CountingSort c = new CountingSort();
			c.CountingSort(arreglo);
			Refrescar();
			main(args);
			break;
		case 6:
			RadixSort r = new RadixSort();
			r.RadixSort(arreglo);
			Refrescar();
			main(args);
			break;
		}
		

	}
	
	public static void Refrescar() {
		for(int i=0;i<20;i++)
		{
			System.out.println(" ");
		}
	}

}