import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class giannetti
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			//aggiungere, togliere casi a seconda delle proprie scelte
			case 1:
				es1();//Inserire metodo statico
				break;
			case 2:
				es2() ;
				//Inserire metodo statico
				break;
			case 3:
				es7();
				//Inserire metodo statico
				break;
			case 4:
				es4();
				break;
			case 5:
				es5();
				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		// Modificare il menù secondo le proprie scelte
		System.out.println("1 - Es n. 1* - Titolo es.minimo di array *");
		System.out.println("2 - Es n. 2* - Titolo es. parole misteriose*");
		System.out.println("3 - Es n. 7* - Titolo es.uguali consecutivi *");
		System.out.println("4 - Es n. 4* - Titolo es. array divisori*");
		System.out.println("5 - Es n.5 * - Titolo es.stampa zigzag *");
	}

	// Aggiunsgere qui i metodi statici relativi agli esercizi scelti
	static void es1() 
	{
		int[] a= new int [10];
		int vMin=0;
		int indice=0;
		for (int i=0;i<a.length;i++)
		{
			a[i]=(int) ((Math.random()*11)-5);
			System.out.print(a[i]+"	");
		}
		vMin=a[0];
		for (int i=0;i<a.length-1;i++)
		{
			if(a[i]<=vMin)
			{
				vMin=a[i];
				indice=i;

			}

		}
		System.out.println("indice" +indice);
		System.out.print("minore " + vMin);

	}
	static void es7() 
	{
		int[] a=new int[20];
		int indice;

		for(int i=0;i<a.length;i++)
		{
			a[i]=(int) ((Math.random()*7)-3);
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				System.out.println("valore ripetuto"+a[i+1]+" ");
				System.out.println("indice"+i+" ");
			}
		}
	}

	static void es2()
	{
		String[] a= {"ciao","bella","addio","saluto","paleari"};

		String parola = null;
		for(int i=2;i>=0;i--)
		{
			if(i==0)
				break;
			System.out.println("inserisci una parola");
			parola=in.nextLine();
			for(i=0;i<5;i++)
			{
				if(parola.equals(a[i]))
				{
					System.out.println("hai indovinato");
					
					
				}
				
			}
			
		}
		
	}
	static void es4()
	{
		int[] a=new int [50];
		int[] b=new int [9];
		int div2 = 0;
		int div3 = 0;
		int div4 = 0;
		int div5 = 0;
		int div6 = 0;
		int div7 = 0;
		int div8 = 0;
		int div9 = 0;
		int div10 = 0;


		for( int i=0;i<a.length;i++)
		{
			a[i]=(int) ((Math.random()*100)+1);
			System.out.print(a[i]+" ");
		}
		for( int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				div2++;
				b[0]=div2;
			}
			if(a[i]%3==0)
			{
				div3++;
				b[1]=div3;
			}
			if(a[i]%4==0)
			{
				div4++;
				b[2]=div4;
			}
			if(a[i]%5==0)
			{
				div5++;
				b[3]=div5;
			}
			if(a[i]%6==0)
			{
				div6++;
				b[4]=div6;
			}
			if(a[i]%7==0)
			{
				div7++;
				b[5]=div7;
			}
			if(a[i]%8==0)
			{
				div8++;
				b[6]=div8;
			}
			if(a[i]%9==0)
			{
				div9++;
				b[7]=div9;
			}
			if(a[i]%10==0)
			{
				div10++;
				b[8]=div10;
			}

		}
		System.out.println("\n"+"numeri divisibili per 2 "+ b[0]);
		System.out.println("\n"+"numeri divisibili per 3 "+ b[1]);
		System.out.println("\n"+"numeri divisibili per 4 "+ b[2]);
		System.out.println("\n"+"numeri divisibili per 5 "+ b[3]);
		System.out.println("\n"+"numeri divisibili per 6 "+ b[4]);
		System.out.println("\n"+"numeri divisibili per 7 "+ b[5]);
		System.out.println("\n"+"numeri divisibili per 8 "+ b[6]);
		System.out.println("\n"+"numeri divisibili per 9 "+ b[7]);
		System.out.println("\n"+"numeri divisibili per 10 "+b[8]);
	}
	static void es5()
	{
		int[] a=new int [10];
		for( int i=0;i<a.length;i++)
		{
			a[i]=(int) (Math.random()*11);
			System.out.println(a[i]+" ");
		}

		for( int i=0, j=a.length-1;i<a.length-5;i++,j--)
		{
			System.out.print(a[i]+""+a[j]);


		}
		System.out.print("\n");
	}





}

