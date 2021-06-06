package com;

//Класс Атрибуты, содержащий название и описание
public class Attributes implements IKSA {
	private String name;
	private String description;
	
	// Конструктор без параметров
	public Attributes() {}
		
	// Конструктор с параметрами
	public Attributes(String name, int description) {
		this.name = name;
		this.description = Integer.toString(description);
	}
		
	// Конструктор с параметрами
	public Attributes(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// Вывод информации об атрибутах
	@Override
	public void showKSA() {
		System.out.println(name + ": " + description);
	}
	
	// Метод, возвращающий описание
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public IKSA ksaMethod(int i) {
		throw new UnsupportedOperationException("Операция не поддерживается");
	}

	@Override
	public IKSA attrMethod(int i) {
		IKSA attributes = null;
		switch (i){
		case (0):
			attributes = new Attributes("Зав.кафедрой", (int)(Math.random()*(i)));
		case (1):
			attributes = new Attributes("Преподаватель", (int)(Math.random()*(i)));
		case (2):
			attributes = new Attributes("Институт", (int)(Math.random()*(i)));
		case (3):
			attributes = new Attributes("Корпус", (int)(Math.random()*(i)));
		case (4):
			attributes = new Attributes("Аудитория", (int)(Math.random()*(i)));
		default:
			attributes = new Attributes("Кафедра", (int)(Math.random()*(i)));
		}
		return attributes;
	}
}
