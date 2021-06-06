package com;

// ����� ������, ���������� �������� � ��������
public class Abilities implements IKSA {
	private String name;
	private String description;
	
	// ����������� ��� ����������
	public Abilities() {}
	
	// ����������� � ����� ����������
	public Abilities(int description) {
		this.name = "������";
		this.description = Integer.toString(description);
	}
		
	// ����������� � �����������
	public Abilities(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// ����� ���������� �� �������
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
		IKSA abilities = new Abilities((int)(Math.random()*(i)));
		return abilities;
	}

	@Override
	public IKSA attrMethod(int i) {
		throw new UnsupportedOperationException("�������� �� ��������������");
	}
}
