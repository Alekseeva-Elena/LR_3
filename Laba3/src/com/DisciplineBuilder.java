package com;
/*package com.Plan;

import java.util.Scanner;
import java.util.ArrayList;

// �����, � ������� ���������� 
// �������� ����������
public class DisciplineBuilder {
	
	// �����, ��������� � ������������ ����� ����������
	public static Discipline createDiscipline() {
		ArrayList<IKSA> inKSA = new ArrayList<IKSA>();
		ArrayList<IKSA> outKSA = new ArrayList<IKSA>();
		ArrayList<Attributes> attr = new ArrayList<Attributes>();
		
		
		System.out.println("\n -----  �������� ���������� -----");
		System.out.println("������� �������� ����������:");
		Scanner console = new Scanner(System.in);
		String discipName = console.nextLine();
		
		// ���� ������� ���
		System.out.println("������� ������, ������ � ������, ������� ����� ��� �������� ���� ����������.");
		System.out.println("������:");
		String inDescription = console.nextLine();
		Knowledge inKnowledge = new Knowledge("������", inDescription);
		inKSA.add(inKnowledge);
		
		System.out.println("������:");
		inDescription = console.nextLine();
		inKSA.add(new Abilities("������", inDescription));
		
		System.out.println("������:");
		inDescription = console.nextLine();
		inKSA.add(new Skills("������", inDescription));
		
		// ���� �������� ���
		System.out.println("������� ������, ������ � ������, ������� ����� �������� ����� �������� ���� ����������.");
		System.out.println("������:");
		inDescription = console.nextLine();
		outKSA.add(new Knowledge("������", inDescription));
		
		System.out.println("������:");
		inDescription = console.nextLine();
		outKSA.add(new Abilities("������", inDescription));
		
		System.out.println("������:");
		inDescription = console.nextLine();
		outKSA.add(new Skills("������", inDescription));
		
		// ������ �� ���� ���������
		System.out.println("\n������ ������ �������� ��� ���� ����������?");
		System.out.println("           yes             no");
		String inData = console.nextLine();
		while (!inData.equalsIgnoreCase("no")) {
			if (inData.equalsIgnoreCase("yes")) {
				System.out.println("������� �������� ��������:");
				String name = console.nextLine();
				
				System.out.println("������� �������� ��������:");
				String description = console.nextLine();
				
				attr.add(new Attributes(name, description));
				
				System.out.println("\n������ ��� ������ �������� ��� ���� ����������?");
				System.out.println("           yes             no");
				inData = console.nextLine();
			}
			else {
				System.out.println("\n�������� �������!");
				System.out.println("������ ��� ������ �������� ��� ���� ����������?");
				System.out.println("           yes             no");
				inData = console.nextLine();
			}
		}
		
		// �������� � ������� ����� ����������
		Discipline discipline = new Discipline(discipName, inKSA, outKSA, attr);
		return discipline;
	}
}*/
