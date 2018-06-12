package com.ancrazyking.designpattern.ObserverPattern;

/**
 * @author Ancrazyking
 * @date 2018/6/12 12:09
 **/
public class BinaryObserver extends Observer
{
    public BinaryObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }

    /**
     * 将整数转换为二进制
     */
    @Override
    public void update()
    {
        System.out.println("Binary String:"+Integer.toBinaryString(subject.getState()));
    }
}
