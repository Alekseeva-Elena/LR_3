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
	public IKSA ksaMethod(int i) {
		throw new UnsupportedOperationException("�������� �� ��������������");
	}

	@Override
	public IKSA attrMethod(int i) {
		IKSA attributes = null;
		switch (i){
		case (0):
			attributes = new Attributes("���.��������", (int)(Math.random()*(i)));
		case (1):
			attributes = new Attributes("�������������", (int)(Math.random()*(i)));
		case (2):
			attributes = new Attributes("��������", (int)(Math.random()*(i)));
		case (3):
			attributes = new Attributes("������", (int)(Math.random()*(i)));
		case (4):
			attributes = new Attributes("���������", (int)(Math.random()*(i)));
		default:
			attributes = new Attributes("�������", (int)(Math.random()*(i)));
		}
		return attributes;
	}
}
