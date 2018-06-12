package com.ancrazyking.designpattern.ObserverPattern;

/**Observer代表观察者,订阅者
 * @author Ancrazyking
 * @date 2018/6/12 12:03
 **/
public abstract class Observer
{
    protected Subject subject;
    public abstract void update();
}
