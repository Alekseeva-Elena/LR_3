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
	public void ksaMethod(int i) {
		throw new UnsupportedOperationException("Операция не поддерживается");
	}

	@Override
	public void attrMethod(int i) {
		switch (i){
		case (0): 
			name = "Зав.кафедрой";
			description = Integer.toString((int)(Math.random()*(10) + i));
			break;
		case (1):
			name = "Преподаватель";
			description = Integer.toString((int)(Math.random()*(10) + i));
			break;
		case (2):
			name = "Институт";
			description = Integer.toString((int)(Math.random()*(10) + i));
			break;
		case (3):
			name = "Корпус";
			description = Integer.toString((int)(Math.random()*(10) + i));
			break;
		case (4):
			name = "Аудитория";
			description = Integer.toString((int)(Math.random()*(10) + i));
			break;
		default:
			name = "Кафедра";
			description = Integer.toString((int)(Math.random()*(10) + i));
			break;
		}
	}
}
