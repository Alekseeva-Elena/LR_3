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
	public IKSA ksaMethod(int i) {
		IKSA skills = new Skills((int)(Math.random()*(i)));
		return skills;
	}

	@Override
	public IKSA attrMethod(int i) {
		throw new UnsupportedOperationException("�������� �� ��������������");
	}
}
