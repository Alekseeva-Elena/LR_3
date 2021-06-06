package com;

import java.util.ArrayList;
import java.util.Scanner;

// �������� �����, � ������� ���������� ������ ������
public class Menu { 

	public static void main(String[] args) {
		AcademicPlan plan = new AcademicPlan("����");
		ArrayList<Discipline> Discip = new ArrayList<Discipline>();

        Thread t1 = new Thread(new Generator(Discip));
        Thread t2 = new Thread(new Generator(Discip));

        t1.start();
        t2.start();

        try {
            Thread.sleep(100); // ��������� ����� �� 100 ��
        } catch (InterruptedException e) {}

        t1.interrupt();
        t2.interrupt();
        
//        for (int i = 0; i < Discip.size(); i++)
//        	if (Discip.get(i).getName() == null)
//        		Discip.remove(i);
        
        for (int i = 0; i < Discip.size(); i++)
        	plan.add(Discip.get(i));
		
		// ��������� ���� ��������� �������

		plan.printPlan();
		System.out.println("\n������� ���� �� ��������� ������: ");
		System.out.println("info - ������� ���������� � �����-���� ����������");
		System.out.println("group - ������� ��������������� ����������");
		System.out.println("quit - ����� �� ���������");
		Scanner console = new Scanner(System.in);
		String inputData = console.nextLine();
				
		// ���� �� ������� ������� "quit"
		// ��������� ���� ���������� �������
		while (!inputData.equalsIgnoreCase("quit")) {
					
			// ����� ���������� �� ������������ ����������
		   	if (inputData.equalsIgnoreCase("info")) {
				System.out.println("\n������� �������� ����������: ");
				inputData = console.nextLine();
				if (plan.checkDiscipline(inputData)) {
					plan.infoDiscipline(inputData);

					System.out.println("\n������� ���� �� ��������� ������: ");
					System.out.println("info - ������� ���������� � �����-���� ����������");
					System.out.println("group - ������� ��������������� ����������");
					System.out.println("quit - ����� �� ���������");
					inputData = console.nextLine();
		   		}
				else { // ��������� � ������������ �������� ����������
					System.out.println("������� ���� �� �������� ������ ����������");
					System.out.println("\n������� ���� �� ��������� ������: ");
					System.out.println("info - ������� ���������� � �����-���� ����������");
					System.out.println("group - ������� ��������������� ����������");
					System.out.println("quit - ����� �� ���������");
					inputData = console.nextLine();
				}
			}
		   	// ����� ��������� ���������
		   	else if (inputData.equalsIgnoreCase("group")) {
				System.out.println("\n������� �������� ����������: ");
				inputData = console.nextLine();
				if (plan.checkDiscipline(inputData)) {
					plan.GroupDisc(inputData);
							
					System.out.println("\n������� ���� �� ��������� ������: ");
					System.out.println("info - ������� ���������� � �����-���� ����������");
					System.out.println("group - ������� ��������������� ����������");
					System.out.println("quit - ����� �� ���������");
					inputData = console.nextLine();
		   		}
				else { // ��������� � ������������ �������� ����������
					System.out.println("������� ���� �� �������� ������ ����������");
					System.out.println("\n������� ���� �� ��������� ������: ");
					System.out.println("info - ������� ���������� � �����-���� ����������");
					System.out.println("group - ������� ��������������� ����������");
					System.out.println("quit - ����� �� ���������");
					inputData = console.nextLine();
				}
			}
			else { // ��������� � ������������ �������
				System.out.println("\n�������� �������!");
				System.out.println("������� ���� �� ��������� ������: ");
				System.out.println("info - ������� ���������� � �����-���� ����������");
				System.out.println("quit - ����� �� ���������");
		    	inputData = console.nextLine();
			}
		}
		

		System.out.println("\n���������� ������ ���������");
		console.close();
	}
}
