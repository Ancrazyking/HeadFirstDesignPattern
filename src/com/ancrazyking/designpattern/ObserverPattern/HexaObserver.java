package com.ancrazyking.designpattern.ObserverPattern;

/**
 * @author Ancrazyking
 * @date 2018/6/12 12:14
 **/
public class HexaObserver extends Observer
{
    public HexaObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }


    /**
     * 将整数转换为16进制
     */
    @Override
    public void update()
    {
        System.out.println("Hex String:"+Integer.toHexString(subject.getState()).toUpperCase());
    }
}
