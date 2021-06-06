package com;

//����� ������, ���������� �������� � ��������
public class Skills implements IKSA {
	private String name;
	private String description;
	
	// ����������� ��� ����������
	public Skills() {}
	
	// ����������� � ����� ����������
	public Skills(int description) {
		this.name = "������";
		this.description = Integer.toString(description);
	}
		
	// ����������� � �����������
	public Skills(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// ����� ���������� �� ���������
	@Override
	public void showKSA() {
		System.out.println(name);
		System.out.println(description);
	}
	
	// �����, ������������ ��������
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void ksaMethod(int i) {
		name = "������";
		description = Integer.toString((int)(Math.random()*(10) + i));
	}

	@Override
	public void attrMethod(int i) {
		throw new UnsupportedOperationException("�������� �� ��������������");
	}
}
