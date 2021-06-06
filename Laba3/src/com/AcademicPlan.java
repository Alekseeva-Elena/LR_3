package com;
import java.util.ArrayList;

// ����� ������� ����, ���������� �������� � ������ ���������
public class AcademicPlan {
	private String name;
	private ArrayList<Discipline> disciplines = new ArrayList<Discipline>();

	public AcademicPlan() {}
	
	public void add(Discipline discip) {
		disciplines.add(discip);
	}
	// ����������� � �����������
	public AcademicPlan(String name) {
		this.name = name;
	}
		
	// ����������� � �����������
	public AcademicPlan(String name, ArrayList<Discipline> discip) {
		this.name = name;
		this.disciplines = discip;
	}
	
	// ����� �������� �����
	public void printPlan() {
		System.out.println("\n -----  ������� ���� " + name + " -----");
		if (disciplines.size() != 0) {
			System.out.println("���� �������� ��������� ����������:");
			for(int i = 0; i < disciplines.size(); i++) {
				if (disciplines.get(i) != null)
					System.out.println(disciplines.get(i).getName());
			}
		}
		else {
			System.out.println("���� �� �������� ���������");
		}
	}
	
	// ��������, ���� �� �������� ����������
	// � ������� �����
	public boolean checkDiscipline(String name) {
		for (int i = 0; i < disciplines.size(); i++) {
			if (disciplines.get(i).getName().equalsIgnoreCase(name))
				return true;
		}
		return false;
	}
	
	// ����� ���������� �� ����������� ����������
	public void infoDiscipline(String name) {
		for (int i = 0; i < disciplines.size(); i++) {
			if (disciplines.get(i).getName().equalsIgnoreCase(name)) {
				disciplines.get(i).getInfo();
				return;
			}
		}
	}
	
	// ����� ������� ������ ���������
	public int countDiscipline() {
		if (disciplines == null)
			return 0;
		else
			return disciplines.size();
	}
	
	// ����������� ��������� ���������
	public void GroupDisc(String name){
		DisciplinesEditor discip = new DisciplinesEditor();
		Discipline discipline = new Discipline();
		
		// ������� ������ ���������� � ������
		for (int i = 0; i < disciplines.size(); i++) {
			if (disciplines.get(i).getName().equalsIgnoreCase(name)) {
				discipline = disciplines.get(i);
			}
		}
		
		// ������� ��������� � ��� ����������
		for (int i = 0; i < disciplines.size(); i++) {
			if (discipline.checkGroup(disciplines.get(i))) {
				discip.load(disciplines.get(i));
			}
		}
		
		// ���� ���������� �������, ������� ��
		if (discip.getSize() != 0) {
			System.out.println("\n" + name + " ����������� ��� ��������:");
			discip.groupSelected(discip.getArray());
		}
		else { // ���� �� �������, �������� �� ����
			System.out.println("��� ���������, ��� ������� ����� �������� " + name);
		}
	}
}
