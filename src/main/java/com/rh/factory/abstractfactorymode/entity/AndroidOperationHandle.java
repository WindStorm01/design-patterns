package com.rh.factory.abstractfactorymode.entity;

import com.rh.factory.abstractfactorymode.inteface.OperationHandle;

/**
 * 安卓操作系统：具体产品
 */
public class AndroidOperationHandle implements OperationHandle {
    @Override
    public void OperationController() {
        System.out.println("Android 操作系统控制");
    }
}
