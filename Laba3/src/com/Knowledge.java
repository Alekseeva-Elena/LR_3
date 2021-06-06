package com;

//����� ������, ���������� �������� � ��������
public class Knowledge implements IKSA {
	private String name;
	private String description;
	
	// ����������� ��� ����������
	public Knowledge() {}
	
	// ����������� � ����� ����������
	public Knowledge(int description) {
		this.name = "������";
		this.description = Integer.toString(description);
	}
	

	// ����������� � �����������
	public Knowledge(String name, String description) {
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
		IKSA knowledge = new Knowledge((int)(Math.random()*(i)));
		return knowledge;
	}

	@Override
	public IKSA attrMethod(int i) {
		throw new UnsupportedOperationException("�������� �� ��������������");
	}
}
