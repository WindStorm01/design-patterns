package com.rh.factory.abstractfactorymode.entity;

import com.rh.factory.abstractfactorymode.inteface.OperationHandle;

/**
 * ios操作系统：具体产品
 */
public class IOSOperationHandle implements OperationHandle {
    @Override
    public void OperationController() {
        System.out.println("IOS 操作系统控制");
    }
}
