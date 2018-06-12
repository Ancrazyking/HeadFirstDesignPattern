package com.ancrazyking.designpattern.ObserverPattern;

/**
 * @author Ancrazyking
 * @date 2018/6/12 12:12
 **/
public class OctalObserver extends Observer
{
    public OctalObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }


    /**
     * 将整数转换为8进制
     */
    @Override
    public void update()
    {
        System.out.println("Octal String:"+Integer.toOctalString(subject.getState()));
    }
}
