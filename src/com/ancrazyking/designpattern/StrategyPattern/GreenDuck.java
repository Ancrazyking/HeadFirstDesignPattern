package com.ancrazyking.designpattern.StrategyPattern;

/**
 * 野鸭头是绿色的
 * @author Ancrazyking
 * @date 2018/6/11 21:59
 **/
public class GreenDuck extends Duck
{

    @Override
    public void display()
    {
        System.out.println("绿头");
    }
}
