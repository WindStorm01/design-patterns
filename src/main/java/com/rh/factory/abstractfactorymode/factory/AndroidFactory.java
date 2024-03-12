package com.rh.factory.abstractfactorymode.factory;

import com.rh.factory.abstractfactorymode.entity.AndroidInterfaceHandle;
import com.rh.factory.abstractfactorymode.entity.AndroidOperationHandle;
import com.rh.factory.abstractfactorymode.inteface.InterfaceHandle;
import com.rh.factory.abstractfactorymode.inteface.OperationHandle;

/**
 * 安卓工厂：具体工厂
 */
public class AndroidFactory implements SoftFactory {


    @Override
    public InterfaceHandle createInterfaceHandle() {
        return new AndroidInterfaceHandle();
    }

    @Override
    public OperationHandle createOperationHandle() {
        return new AndroidOperationHandle();
    }
}
