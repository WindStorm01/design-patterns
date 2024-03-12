package com.rh.factory.abstractfactorymode.entity;

import com.rh.factory.abstractfactorymode.inteface.InterfaceHandle;

/**
 * ios界面控制：具体产品
 */
public class IOSInterfaceHandle implements InterfaceHandle {
    @Override
    public void interfaceController() {
        System.out.println("IOS 界面控制");
    }
}
