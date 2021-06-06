package com;

import java.util.ArrayList;

// �����, ��� ���������� ����������
// ������������ ���������
public class DisciplinesEditor {
	private CompoundDisciplines all = new CompoundDisciplines();

	// ����������� ��� ����������
	public DisciplinesEditor() {
		// TODO Auto-generated constructor stub
	}

	// ���������� ���������� � ������
	public void load(Disciplines disc) {
		all.add(disc);
    }

	// ����������� ��������� ���������
	public void groupSelected(ArrayList<Disciplines> disc) {
		CompoundDisciplines group = new CompoundDisciplines();
		for (int i = 0; i < disc.size(); i++) {
			group.add(disc.get(i));
			all.remove(disc.get(i));
        }
		all.add(group);
		all.discPrint();
	}

	// �������, ����������� ������ ������ ���������
	public int getSize() {
		return all.getSize();
	}

	// �������, ����������� ������ ���������
	public ArrayList<Disciplines> getArray() {
		return all.getArray();
	}
}
