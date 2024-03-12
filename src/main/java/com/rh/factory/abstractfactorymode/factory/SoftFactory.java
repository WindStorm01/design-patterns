package com.rh.factory.abstractfactorymode.factory;

import com.rh.factory.abstractfactorymode.inteface.InterfaceHandle;
import com.rh.factory.abstractfactorymode.inteface.OperationHandle;

/**
 * 软件工厂接口：抽象工厂
 */
public interface SoftFactory {
    public InterfaceHandle createInterfaceHandle();

    public OperationHandle createOperationHandle();

}
