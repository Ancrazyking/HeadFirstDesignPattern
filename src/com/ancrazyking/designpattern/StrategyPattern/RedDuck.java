package com.ancrazyking.designpattern.StrategyPattern;

/**
 * 红头鸭
 * @author Ancrazyking
 * @date 2018/6/11 22:00
 **/
public class RedDuck  extends Duck
{
    @Override
    public void display()
    {
        System.out.println("红头");
    }
}
