import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		
		// 1. Написать консольное приложение, которое выводит на экран надпись “Hello World!”
		
			System.out.println("Hello World!\n");
        
	    //	2. Распечатать на экране своё ФИО. Фамилия, Имя и Отчество должны выводиться на разных строках.
			
			System.out.println("Rutski\nAleh\nVyaheslavovich\n");
			
		// 3. Написать программу, которая умеет складывать 2 числа типа int и выводить результат на экран.
			
			
			int a = 15;
			int b = 20;
			System.out.println("A = " + a + "; B = " + b + "; \tA + B = " + (a+b));
			
		
		// 4. Модернизировать задачу 3 следующим образом: программа запрашивает с клавиатуры ввод двух целых чисел и знак арифметической операции. 
		//	  Программа выполняет арифметическое действие над введёнными числами и результат выводит на экран. 
			
			Scanner sc = new Scanner(System.in);
			System.out.print("A = ");
			int aa = sc.nextInt();
		
			
			System.out.print("B = ");
			int bb = sc.nextInt();
			
			System.out.print("Enter your operation: ");
			String operation = sc.next();
		
			switch (operation) {
			case "+":
				System.out.println("A + B = " + (aa+bb));
				break;
			case "-":
				System.out.println("A - B = " + (aa-bb));
				break;
			case "*":
				System.out.println("A * B = " + (aa*bb));
				break;
			case "/":
				System.out.println("A / B = " + (aa/(double)bb));
				break;
			default:
				System.out.println("ERROR! CAN'T PERFORM THIS OPERATION!");
				break;
			}
			
		// 5. Ввести с клавиатуры число от 0 до 9. Программа должна вывести название цифры.
		// 6. Ввести с клавиатуры число от 0 до 9. Определить является ли введённое число чётным.	
			
			int num;
			do {
			System.out.println("Enter a figure from 0 till 9");
			num = sc.nextInt();
			}
			while(num < 0 || num >9);
			
			if (num%2 == 0)
				System.out.println("Your figure is " + num + " - EVEN!");
			 else 
				 System.out.println("Your figure is " + num + " - ODD!");
			
			
	
		// 7. Ввести с клавиатуры число от -9 до 9. Определить является ли введённое число чётным положительным.
			
			
			do {
				System.out.println("Enter a figure from -9 till 9");
				num = sc.nextInt();
				}
				while(num < -9 || num >9);
			if (num < 0)
				System.out.println("Your figure is < 0");
			else
				System.out.println("Your figure is >= 0"); 
			
			// 8. Ввести с клавиатуры полное название месяца. Определить, к какому сезону года относится данный месяц.
			
			
		
			System.out.print("Enter a month: ");
			String month = sc.next().toLowerCase().trim();
			
			if (month.equalsIgnoreCase("september") || month.equals("november") || month.equals("october"))
				System.out.println("It's AUTUMN!");
			else if (month.equalsIgnoreCase("may") || month.equals("march") || month.equals("april"))
				System.out.println("It's SPRING!");
			else if (month.equalsIgnoreCase("december") || month.equals("february") || month.equals("january"))
				System.out.println("It's WINTER!");
			else if (month.equalsIgnoreCase("june") || month.equals("july") || month.equals("august"))
				System.out.println("It's SUMMER!");
			else
				System.out.println("Incorrect month!");
			
			// 9. Посчитать сумму чисел от 0 до 100.
			
			int summ = 0;
			for (int i=0; i < 101;i++) {
				summ+=i;
			}
			System.out.println("X = " + summ);
			
			
			// 10. Написать программу нахождения суммы большего и меньшего из 3х чисел.
			
			System.out.print("Enter your first number: ");
			int a1 = sc.nextInt();
			System.out.print("Enter your second number: ");
			int a2 = sc.nextInt();
			System.out.print("Enter your third number: ");
			int a3 = sc.nextInt();
			
			int max = a1;
			int [] aArr = {a1, a2, a3};
			for (int i=0; i<aArr.length;i++) {
				if (max < aArr[i])
					max = aArr[i];
			}
			
			int min = a1;
			for (int i=0; i<aArr.length;i++) {
				if (min > aArr[i])
					min = aArr[i];
			}
			
			System.out.println("MIN + MAX = " + (min + max));
			
			// 11. Программа запрашивает ввод символов, до тех пор, пока пользователь не введёт символ ‘q’.
		
			String symbol;
			do {
				System.out.println("Enter 'q'");
				symbol = sc.next();
			 
			}
			while(!symbol.equals("q"));
				System.out.println("CORRECT! Thank you!");
	
	
			// 12. Программа запрашивает ввод строк текста. Продолжаем ввод до тех пор, пока не будет введено слово “stop”.
			
				String text1;
				do {
					System.out.println("Enter 'stop'");
					text1 = sc.next();
				 
				}
				while( !text1.equals("stop"));
					System.out.println("CORRECT! Thank you!");
	}
			
	}