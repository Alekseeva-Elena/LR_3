package com;

// Класс Умения, содержащий название и описание
public class Abilities implements IKSA {
	private String name;
	private String description;
	
	// Конструктор без параметров
	public Abilities() {}
	
	// Конструктор с одним параметром
	public Abilities(int description) {
		this.name = "Умения";
		this.description = Integer.toString(description);
	}
		
	// Конструктор с параметрами
	public Abilities(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// Вывод информации об умениях
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
	public IKSA ksaMethod(int i) {
		IKSA abilities = new Abilities((int)(Math.random()*(i)));
		return abilities;
	}

	@Override
	public IKSA attrMethod(int i) {
		throw new UnsupportedOperationException("Операция не поддерживается");
	}
}
