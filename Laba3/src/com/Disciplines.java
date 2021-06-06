package com;

// Интерфейс, необходимый для компоновщика
public interface Disciplines {
	public void add(Disciplines disc);
    public void remove(Disciplines disc);
	public void discPrint();
	public Disciplines getDiscipline();
	public void AddConfig(int[] is);
}
