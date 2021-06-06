package com;

// Интерфейс для объединения 
// ЗУН и атрибутов
public interface IKSA {
	public static final String name = "";
	public static final String description = "";
	public void showKSA();
	public String getDescription();
	public IKSA ksaMethod(int i);
	public IKSA attrMethod(int i);
}
