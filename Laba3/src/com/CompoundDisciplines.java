package com;
import java.util.ArrayList;

// ����� ��� ���������� �����������
class CompoundDisciplines implements Disciplines {
	private ArrayList<Disciplines> disciplines = new ArrayList<Disciplines>();
	
	@Override
	public Disciplines getDiscipline() {
		throw new UnsupportedOperationException("�������� �� ��������������"); 
	}
	
	@Override
	public void AddConfig(int[] is) {
		throw new UnsupportedOperationException("�������� �� ��������������"); 
	}
	
	// ���������� ����������
	@Override
    public void add(Disciplines disc) {
    	disciplines.add(disc);
    }

	// �������� ����������
    @Override
    public void remove(Disciplines disc) {
    	disciplines.remove(disc);
    }
    
    // ����� ���������� � �����������
    @Override
    public void discPrint() {
        for (Disciplines disc : disciplines) {
        	disc.discPrint();
        }
    }

    // �����, ������������ ������ ������ ���������
	public int getSize() {
		return disciplines.size();
	}

	// �����, ������������ ������ ���������
	public ArrayList<Disciplines> getArray() {
		return disciplines;
	}
	
}
