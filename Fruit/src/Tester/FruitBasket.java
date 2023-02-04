package Tester;

import java.util.Scanner;

import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of basket : ");
		int n = sc.nextInt();
		Fruit f1[] = new Fruit[n];
		int index = 0;
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Show Names Of All Fruits In Basket");
		System.out.println("5. Show Name,Weight,Colour Of Fruits");
		System.out.println("6. Mark which fruits are stale");
		System.out.println("7. Show all stale fruits");
		System.out.println("8. Mark sour fruits stale");
		System.out.println("9. Show Fruit Specific");
		System.out.println("10. Exit");
		int ch;
		
		do 
		{
			System.out.println("Enter the choice : ");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					if(index < f1.length)
					{
						System.out.println("Enter colour, weight & name : ");
						f1[index] = new Mango(sc.next(),sc.nextDouble(),sc.next());
						if (f1[index].getFresh()) 
						{
							index++;
						}
						else
						{
							System.out.println("Choose fresh "+f1[index].getName());
							f1[index].setFresh(true);
							f1[index] = null;
							System.out.println("Enter colour, weight & name : ");
							f1[index] = new Mango(sc.next(),sc.nextDouble(),sc.next());
							index++;
						}		
					}
					else
					{
						System.out.println("Basket is full");
					}
					break;
					
				case 2:
					if(index < f1.length)
					{
						System.out.println("Enter colour, weight & name : ");
						f1[index] = new Orange(sc.next(),sc.nextDouble(),sc.next());
						if (f1[index].getFresh()) 
						{
							index++;
						}
						else
						{
							System.out.println("Choose fresh "+f1[index].getName());
							f1[index].setFresh(true);
							f1[index] = null;
							System.out.println("Enter colour, weight & name : ");
							f1[index] = new Orange(sc.next(),sc.nextDouble(),sc.next());
							index++;
						}
					}
					else
					{
						System.out.println("Basket is full");
					}
					break;
					
				case 3:
					if(index < f1.length)
					{
						System.out.println("Enter colour, weight & name : ");
						f1[index] = new Apple(sc.next(),sc.nextDouble(),sc.next());
						if (f1[index].getFresh()) 
						{
							index++;
						}
						else
						{
							System.out.println("Choose fresh "+f1[index].getName());
							f1[index].setFresh(true);
							f1[index] = null;
							System.out.println("Enter colour, weight & name : ");
							f1[index] = new Apple(sc.next(),sc.nextDouble(),sc.next());
							index++;
						}
					}
					else
					{
						System.out.println("Basket is full");
					}
					break;
					
				case 4 :
					System.out.println("All Fruits containing in basket : ");
					for (Fruit fruit : f1) 
					{
						if(fruit!=null)
						System.out.println(fruit.getName());
					}
					System.out.println("-----------------------------------------------");
					break;
					
				case 5 :
					for (Fruit fruit : f1) 
					{
						if(fruit!=null)
						{
							System.out.println(fruit.toString());
						}
						System.out.println("------------------");
					}
					break; 
					
				case 6:
					System.out.println("Enter how many fruit which is stale : ");
					int stl = sc.nextInt();
					for (int i = 0; i < stl; i++) 
					{
						System.out.println("Enter the index of fruit which is stale :");
						int indx = sc.nextInt();
						f1[indx].setFresh(false);
					}
					break;
					
				case 7:
					System.out.println("Show all stale fruits : ");
					for (Fruit fruit : f1) 
					{
						if(fruit != null && fruit.getFresh() == false)
						{
							System.out.println(fruit.getName());
						}
					}
					break;
					
				case 8:
					for (int i = 0; i < index; i++)
					{
						if(f1[i].taste() == "Sour")
						{
							f1[i].setFresh(false);
						}
					}
					break;
					
				case 9:
					
				    for (Fruit fruit : f1) 
				    {
				    	if (fruit instanceof Apple)
							((Apple) fruit).jam();
						
						else if (fruit instanceof Orange)
							((Orange) fruit).juice();
						
						else if (fruit instanceof Mango)
							((Mango) fruit).pulp();
						else
							System.out.println("Basket Empty");
					}
					
						
					break;
					
					default : System.out.println("Enter the valid choice");
					break;
			}
		} while (ch != 10);
		System.out.println("-----------------------------------------------------");	
	}
}
