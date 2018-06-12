package com.ancrazyking.designpattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject对象代表出版者==>主题
 * @author Ancrazyking
 * @date 2018/6/12 12:01
 **/
public class Subject
{
    private List<Observer> observers=new ArrayList<Observer>();
    private int state;

    public int getState()
    {
        return state;
    }

    public void setState(int state)
    {
        this.state = state;
        notifyAllObservers();
    }

    /**
     *添加观察者
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer:observers)
        {
            observer.update();
        }
    }

}
