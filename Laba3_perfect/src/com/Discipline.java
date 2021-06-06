package com;

import java.util.ArrayList;

// Класс Дисциплина, содержащий название, 
// списки входных и выходных ЗУН и список атрибутов
public class Discipline implements Disciplines {
	private String name;
	ArrayList<IKSA> inKSA = new ArrayList<IKSA>();
	ArrayList<IKSA> outKSA = new ArrayList<IKSA>();
	ArrayList<IKSA> attr = new ArrayList<IKSA>((int)(Math.random()*(10)));
	
	@Override
	public void add(Disciplines disc){
        throw new UnsupportedOperationException("Операция не поддерживается"); 
    }
	
	@Override
    public void remove(Disciplines disc){
        throw new UnsupportedOperationException("Операция не поддерживается"); 
    }
	
	@Override
	public void discPrint() {
		System.out.println(name);
	}
	
	// Конструктор без параметров
	public Discipline() {
		super();
	}
	
	@Override
	public Discipline getDiscipline()
    {
        return new Discipline();
    }
	// Конструктор с одним параметром
	public Discipline(String name) {
		super();
		this.name = name;
	}
	
	// Конструктор с параметрами
	public Discipline(String name, ArrayList<IKSA> inKSA, ArrayList<IKSA> outKSA, ArrayList<IKSA> attr) {
		super();
		this.name = name;
		this.inKSA = inKSA;
		this.outKSA = outKSA;
		this.attr = attr;
	}
	
	public void AddConfig(int[] c, int name)
    {
		Knowledge inKnowledge = new Knowledge();
		inKnowledge.ksaMethod(c[0]);
		inKSA.add(inKnowledge);

		Abilities inAbilities = new Abilities();
		inAbilities.ksaMethod(c[1]);
		inKSA.add(inAbilities);
		
		Skills inSkills = new Skills();
		inSkills.ksaMethod(c[2]);
		inKSA.add(inSkills);
		
		Knowledge outKnowledge = new Knowledge();
		outKnowledge.ksaMethod(c[3]);
		outKSA.add(outKnowledge);

		Abilities outAbilities = new Abilities();
		outAbilities.ksaMethod(c[4]);
		outKSA.add(outAbilities);
		
		Skills outSkills = new Skills();
		outSkills.ksaMethod(c[5]);
		outKSA.add(outSkills);
		
		for (int i = 0; i < attr.size(); i++) {
			Attributes attributes = new Attributes();
			attributes.attrMethod(c[6]);
			attr.add(attributes);
		}
        addName(name);
    }
	
	
	private void addName(int i) {
		name = "Дисциплина " + i;
	}

	// Метод, возвращающий название дисциплины
	public String getName() {
		return this.name;
	}
	
	// Вывод информации о данной дисциплине
	public void getInfo() {
		System.out.println("\n --- Дисциплина " + name + " ---");
		System.out.println("Знания, умения и навыки, требуемые для этой дисциплины:");
		for (int i = 0; i < inKSA.size(); i++) {
			System.out.print((i+1) + ". "); inKSA.get(i).showKSA();
		}
		
		System.out.println("Знания, умения и навыки, получаемые на этой дисциплины:");
		for (int i = 0; i < outKSA.size(); i++) {
			System.out.print((i+1) + ". "); outKSA.get(i).showKSA();
		}
		
		if (attr.size() != 0) {
			System.out.println("\nДополнительные сведения:");
			for (int i = 0; i < attr.size(); i++) {
			System.out.print((i+1) + ". "); attr.get(i).showKSA();
		    }
		}
	}
	
	// Проверка, есть ли дисциплины, связанные с данной
	public boolean checkGroup(Discipline discipline) {
		for (int i = 0; i < 3; i++) {
			if (name != discipline.name) {
				if (outKSA.get(i).getDescription().equalsIgnoreCase(discipline.inKSA.get(i).getDescription())) {
					return true;
				}
			}
		}
		return false;
	}

}
