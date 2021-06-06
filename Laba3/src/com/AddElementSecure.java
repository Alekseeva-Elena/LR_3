package com;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AddElementSecure {

    private ArrayList<Discipline> d;
    private int index = 0;
    int r = 0;

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

    private final int n = 8;
    private final Lock l = new ReentrantLock();
    private final Semaphore free = new Semaphore(n);
    private final Semaphore full = new Semaphore(n);

    public AddElementSecure(ArrayList<Discipline> d)
    {
        super();
        this.d = d;
    }

    public void add() {
        try {
            free.acquire();
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace();
            Thread.currentThread().interrupt();
        }
        l.lock();
        try {
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

        } catch (Exception e) {} 
        finally {
            l.unlock();
        }
        full.release();
    }
}
