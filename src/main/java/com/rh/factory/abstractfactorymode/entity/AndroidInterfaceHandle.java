package com.rh.factory.abstractfactorymode.entity;

import com.rh.factory.abstractfactorymode.inteface.InterfaceHandle;

/**
 * 安卓界面控制：具体产品
 */
public class AndroidInterfaceHandle implements InterfaceHandle {
    @Override
    public void interfaceController() {
        System.out.println("Android 界面控制");
    }
}
