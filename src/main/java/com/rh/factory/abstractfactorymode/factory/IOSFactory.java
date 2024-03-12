package com.rh.factory.abstractfactorymode.factory;

import com.rh.factory.abstractfactorymode.entity.IOSInterfaceHandle;
import com.rh.factory.abstractfactorymode.entity.IOSOperationHandle;
import com.rh.factory.abstractfactorymode.inteface.InterfaceHandle;
import com.rh.factory.abstractfactorymode.inteface.OperationHandle;

/**
 * IOS工厂：具体工厂
 */
public class IOSFactory implements SoftFactory {


    @Override
    public InterfaceHandle createInterfaceHandle() {
        return new IOSInterfaceHandle();
    }

    @Override
    public OperationHandle createOperationHandle() {
        return new IOSOperationHandle();
    }
}
