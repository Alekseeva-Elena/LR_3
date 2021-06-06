package com;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Generator implements Runnable  {
	private ArrayList<Discipline> d;
	int r = 0;
	int name = 0;
	int index = 0;
	boolean flag = false;
	private final Lock l = new ReentrantLock();
	public Generator() {
		// TODO Auto-generated constructor stub
	}
	
	Discipline disp1 = new Discipline();
	int Presets[][] =
        {
                {1, 0, 2, 1, 0, 2, 1},
                {1, 1, 3, 1, 0, 2, 2},
                {2, 4, 2, 1, 0, 2, 0},
                {0, 0, 4, 1, 0, 2, 3},
                {0, 1, 1, 1, 0, 2, 4},
                {1, 0, 0, 1, 0, 2, 2}
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
            // ѕровер€ем, был ли получен сигнал на прерывание потока, если да, то выходим
            // из цикла и завершаем работу потока
            if (Thread.currentThread().isInterrupted() || index == 10) break;
            
            l.lock();
            try {
            	d.add(disp1.getDiscipline());
            	
            	r = (int)(Math.random()*(5));
                System.out.println("Current thread id:" +  Thread.currentThread().getId() + " |Preset: " + r);
            	name = (int)(Math.random()*(1000));
            	flag = false;
            	while (flag == false) {
                	for (int i = 0; i < d.size(); i++) {
                    	if (d.get(i).getName() == ("ƒисциплина " + name))
                	    	name = (int)(Math.random()*(1000));
                   		else if (i == d.size() - 1) {
                   	    	flag = true;
                   	    	break;
                   		}
                	}
            	}
            	for (int i = 0; i < d.size(); i++)
                	if (d.get(i).getName() == null) {
                		d.get(i).AddConfig(Presets[r], name); 
                		break;
                	}
            	//d.get(d.size() - 1).AddConfig(Presets[r], name);
            	index++;
            //System.out.println("(disp1) name " +  name);
 
            } catch (Exception e) {} 
            finally {
                l.unlock();
            }
        }
	}
	
}
