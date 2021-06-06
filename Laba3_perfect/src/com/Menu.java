package com;

import java.util.ArrayList;
import java.util.Scanner;

// Основной класс, в котором происходит запрос команд
public class Menu { 

	public static void main(String[] args) {
		AcademicPlan plan = new AcademicPlan("План");
		ArrayList<Discipline> Discip = new ArrayList<Discipline>();

        Thread t1 = new Thread(new Generator(Discip));
        Thread t2 = new Thread(new Generator(Discip));

        t1.start();
        t2.start();

        try {
            Thread.sleep(100); // блокируем поток на 100 мс
        } catch (InterruptedException e) {}

        t1.interrupt();
        t2.interrupt();
        
//        for (int i = 0; i < Discip.size(); i++)
//        	if (Discip.get(i).getName() == null)
//        		Discip.remove(i);
        
        for (int i = 0; i < Discip.size(); i++)
        	plan.add(Discip.get(i));
		
		// ожидается ввод следующих комманд

		plan.printPlan();
		System.out.println("\nВведите одну из следующих команд: ");
		System.out.println("info - вывести информацию о какой-либо дисциплине");
		System.out.println("group - вывести взаимосвязанные дисциплины");
		System.out.println("quit - выйти из программы");
		Scanner console = new Scanner(System.in);
		String inputData = console.nextLine();
				
		// Пока не введена команда "quit"
		// ожидается ввод правильной команды
		while (!inputData.equalsIgnoreCase("quit")) {
					
			// Вывод информации об определенной дисциплине
		   	if (inputData.equalsIgnoreCase("info")) {
				System.out.println("\nВведите название дисциплины: ");
				inputData = console.nextLine();
				if (plan.checkDiscipline(inputData)) {
					plan.infoDiscipline(inputData);

					System.out.println("\nВведите одну из следующих команд: ");
					System.out.println("info - вывести информацию о какой-либо дисциплине");
					System.out.println("group - вывести взаимосвязанные дисциплины");
					System.out.println("quit - выйти из программы");
					inputData = console.nextLine();
		   		}
				else { // Сообщение о неправильном названии дисциплины
					System.out.println("Учебный план не содержит данной дисциплины");
					System.out.println("\nВведите одну из следующих команд: ");
					System.out.println("info - вывести информацию о какой-либо дисциплине");
					System.out.println("group - вывести взаимосвязанные дисциплины");
					System.out.println("quit - выйти из программы");
					inputData = console.nextLine();
				}
			}
		   	// Вывод связанных дисциплин
		   	else if (inputData.equalsIgnoreCase("group")) {
				System.out.println("\nВведите название дисциплины: ");
				inputData = console.nextLine();
				if (plan.checkDiscipline(inputData)) {
					plan.GroupDisc(inputData);
							
					System.out.println("\nВведите одну из следующих команд: ");
					System.out.println("info - вывести информацию о какой-либо дисциплине");
					System.out.println("group - вывести взаимосвязанные дисциплины");
					System.out.println("quit - выйти из программы");
					inputData = console.nextLine();
		   		}
				else { // Сообщение о неправильном названии дисциплины
					System.out.println("Учебный план не содержит данной дисциплины");
					System.out.println("\nВведите одну из следующих команд: ");
					System.out.println("info - вывести информацию о какой-либо дисциплине");
					System.out.println("group - вывести взаимосвязанные дисциплины");
					System.out.println("quit - выйти из программы");
					inputData = console.nextLine();
				}
			}
			else { // Сообщение о неправильной команде
				System.out.println("\nНеверная команда!");
				System.out.println("Введите одну из следующих команд: ");
				System.out.println("info - вывести информацию о какой-либо дисциплине");
				System.out.println("quit - выйти из программы");
		    	inputData = console.nextLine();
			}
		}
		

		System.out.println("\nЗавершение работы программы");
		console.close();
	}
}
