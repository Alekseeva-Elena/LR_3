package com;
/*package com.Plan;

import java.util.Scanner;
import java.util.ArrayList;

//�����, � ������� ���������� 
//�������� �������� �����
public class PlanBuilder{
	
	public static AcademicPlan createPlan() {
		String name;
		ArrayList<Discipline> disciplines =  new ArrayList<Discipline>();
		
		System.out.println("\n -----  �������� �������� ����� -----");
		System.out.println("������� �������� �������� �����: ");
		Scanner console = new Scanner(System.in);
		name = console.nextLine();
		
		// ������ ������
		System.out.println("\n������� ���� �� ��������� ������: ");
		System.out.println("create - ������� ����������");
		System.out.println("quit - ��������� �������� ���������");
		String inputData = console.nextLine();
		
		// ���� �� ������� ������� "quit"
		// ��������� ���� ���������� �������
		while (!inputData.equalsIgnoreCase("quit")) {
			// �������� �������� �����
			if (inputData.equalsIgnoreCase("create")) {
				disciplines.add(DisciplineBuilder.createDiscipline());
		    	System.out.println("\n������� ���� �� ��������� ������: ");
		    	System.out.println("create - ������� ����������");
		    	System.out.println("quit - ��������� �������� ���������");
		    	inputData = console.nextLine();
			}
			else { // ��������� � ����������� �������
				System.out.println("\n�������� �������!");
				System.out.println("������� ���� �� ��������� ������: ");
		    	System.out.println("create - ������� ����������");
		    	System.out.println("quit - ��������� �������� ���������");
				inputData = console.nextLine();
			}
		}
		
		System.out.println("���������� �������� ���������");
		return new AcademicPlan(name, disciplines);
	}
}*/
