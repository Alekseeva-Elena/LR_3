package com;

//Класс Навыки, содержащий название и описание
public class Skills implements IKSA {
	private String name;
	private String description;
	
	// Конструктор без параметров
	public Skills() {}
	
	// Конструктор с одним параметром
	public Skills(int description) {
		this.name = "Навыки";
		this.description = Integer.toString(description);
	}
		
	// Конструктор с параметрами
	public Skills(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// Вывод информации об атрибутах
	@Override
	public void showKSA() {
		System.out.println(name);
		System.out.println(description);
	}
	
	// Метод, возвращающий описание
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void ksaMethod(int i) {
		name = "Навыки";
		description = Integer.toString((int)(Math.random()*(10) + i));
	}

	@Override
	public void attrMethod(int i) {
		throw new UnsupportedOperationException("Операция не поддерживается");
	}
}
