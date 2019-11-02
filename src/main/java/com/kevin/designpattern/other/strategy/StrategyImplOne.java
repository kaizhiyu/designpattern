package com.kevin.designpattern.other.strategy;


/**
 *  策略一实现
 * @author lihongmin
 * @date 2019/11/2 12:31
 */
public class StrategyImplOne extends AbstractStrategy {
    @Override
    void algorithm() {
        System.out.println("我实现了策略（一）的方法！！！");
    }
}
