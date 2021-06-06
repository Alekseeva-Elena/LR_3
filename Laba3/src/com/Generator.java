package com;

import java.util.ArrayList;

public class Generator implements Runnable  {
	private ArrayList<Discipline> d;
	private int index = 0;
	int r = 0;
	    
	public Generator() {
		// TODO Auto-generated constructor stub
	}
	
	Discipline disp1 = new Discipline();
	Discipline disp2 = new Discipline();
    
	int Presets[][] =
        {
                {1, 0, 0},
                {1, 1, 1},
                {2, 4, 5},
                {0, 0, 0},
                {0, 1, 3},
                {1, 0, 2},
                {1, 0, 2},
                {1, 1, 3},
                {2, 4, 2},
                {0, 0, 4},
                {0, 1, 1},
                {1, 0, 0}
        };
	
	public Generator(ArrayList<Discipline> d)
    {
        super();
        this.d = d;
    }
	
	public ArrayList<Discipline> getDisciplines() {
		return d;
	}

	@Override
	public void run() {
		while (true) {
            // Проверяем, был ли получен сигнал на прерывание потока, если да, то выходим
            // из цикла и завершаем работу потока
            if (Thread.currentThread().isInterrupted()) break;

            switch (index)
            {
                case (0):
                    d.add(disp1.getDiscipline());
                    r = (int)(Math.random()*(6));
                    System.out.println("(disp1) Current thread id:" +  Thread.currentThread().getId() + " |Preset: " + r);
                    d.get(d.size() - 1).AddConfig(Presets[r]);
                    System.out.println("(disp1) name: " + d.get(d.size() - 1).getName());
                    index = 1;
                    break;

                case (1):
                    d.add(disp2.getDiscipline());
                    r = (int)(Math.random()*(6))+6;
                    System.out.println("(disp2) Current thread id:" +  Thread.currentThread().getId() + " |Preset: " + r);
                    d.get(d.size() - 1).AddConfig(Presets[r]);
                    System.out.println("(disp2) name: " + d.get(d.size() - 1).getName());
                    index = 0;
                    break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Проверяем, был ли получен сигнал на прерывание потока, если да, то
                //выходим из цикла и завершаем работу потока
                break;
            }
        }
	}
	
}
