package com;

//Класс Знания, содержащий название и описание
public class Knowledge implements IKSA {
	private String name;
	private String description;
	
	// Конструктор без параметров
	public Knowledge() {}
	
	// Конструктор с одним параметром
	public Knowledge(int description) {
		this.name = "Знания";
		this.description = Integer.toString(description);
	}
	

	// Конструктор с параметрами
	public Knowledge(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// Вывод информации об знаниях
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
		name = "Знания";
		description = Integer.toString((int)(Math.random()*(10) + i));
	}

	@Override
	public void attrMethod(int i) {
		throw new UnsupportedOperationException("Операция не поддерживается");
	}
}
