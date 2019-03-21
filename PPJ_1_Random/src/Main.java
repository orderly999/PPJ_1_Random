import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     
		
	int tablica[] = new int[100];
	Random randomGen = new Random();
	int liczbaWystapien[] = new int[10];
	int minimalnaWartosc = 0;
	int maksymalnaWartosc = 0;
	int sumaElementow = 0;
	
	// wypisz wygenerowana tablice w oknie konsoli.
	for(int i = 0; i < tablica.length; i++)
	{		
		tablica[i] = randomGen.nextInt(10);	
		System.out.println("Wpis w tablicy numer "+ i +": " + tablica[i]);
	}
	
	// zlicz wystapienia
	for(int i = 0; i < tablica.length; i++)
	{		
		liczbaWystapien[(tablica[i])] += 1;
	}
	
	// wypisz liczbe wystapien kazdej wartosci.
	for(int i = 0; i < liczbaWystapien.length; i++)
	{		
		System.out.println("Liczba wyst¹pieñ liczby "+ i +": " + liczbaWystapien[i]);
	}
		
	// wypisz najmniejsza wartosc z tablicy	
	for(int i = 1; i < tablica.length; i++)
	{
	    if(tablica[i] < minimalnaWartosc)
	    {
	    	minimalnaWartosc = tablica[i];
		}
	}
	
	System.out.println("Najmniejsza liczba to "+ minimalnaWartosc);
	
	// wypisz najwieksza wartosc z tablicy
	for(int i = 1; i < tablica.length; i++)
	{
	    if(tablica[i] > maksymalnaWartosc)
	    {
	    	maksymalnaWartosc = tablica[i];
		}
    }
	
	System.out.println("Najwieksza liczba to "+ maksymalnaWartosc);
		
	// wypisz sume elementow
	for(int i = 0; i < 100; i++)
	{		
		sumaElementow += tablica[i];
	}	
	System.out.println("Suma elementow to: " + sumaElementow);
	
	
	// wypisz posortowane elementy tablicy
	sortBubble(tablica);
	System.out.print("Posortowane liczby w tablicy to: ");
	for(int i = 0; i < 100; i++)
	{		
		System.out.print(tablica[i] + ", ");
	}
		
    }	
	
	  // posortuj babelkowo
		public static void sortBubble(int[] tablica)
		{
	        int dlugosc = tablica.length;
	        int j;
	        for (int m = dlugosc; m >= 0; m--)
	        {
	            for (int i = 0; i < dlugosc - 1; i++) 
	            {
	                j = i + 1;
	                if (tablica[i] > tablica[j])
	                {
	                	swapNumbers(i, j, tablica);
	                }
	            }
	        }
		
		}
			
		 // zamien liczby
		 private static void swapNumbers(int i, int j, int[] tablica)
		 {		  
		        int temp;
		        temp = tablica[i];
		        tablica[i] = tablica[j];
		        tablica[j] = temp;
		 }
	
}
