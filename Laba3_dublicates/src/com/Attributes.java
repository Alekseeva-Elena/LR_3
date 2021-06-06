package com;

//����� ��������, ���������� �������� � ��������
public class Attributes implements IKSA {
	private String name;
	private String description;
	
	// ����������� ��� ����������
	public Attributes() {}
		
	// ����������� � �����������
	public Attributes(String name, int description) {
		this.name = name;
		this.description = Integer.toString(description);
	}
		
	// ����������� � �����������
	public Attributes(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// ����� ���������� �� ���������
	@Override
	public void showKSA() {
		System.out.println(name + ": " + description);
	}
	
	// �����, ������������ ��������
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void ksaMethod(int i) {
		throw new UnsupportedOperationException("�������� �� ��������������");
	}

	@Override
	public void attrMethod(int i) {
		switch (i){
		case (0): 
			name = "���.��������";
			description = Integer.toString((int)(Math.random()*(10) + i));
			break;
		case (1):
			name = "�������������";
			description = Integer.toString((int)(Math.random()*(10) + i));
			break;
		case (2):
			name = "��������";
			description = Integer.toString((int)(Math.random()*(10) + i));
			break;
		case (3):
			name = "������";
			description = Integer.toString((int)(Math.random()*(10) + i));
			break;
		case (4):
			name = "���������";
			description = Integer.toString((int)(Math.random()*(10) + i));
			break;
		default:
			name = "�������";
			description = Integer.toString((int)(Math.random()*(10) + i));
			break;
		}
	}
}
