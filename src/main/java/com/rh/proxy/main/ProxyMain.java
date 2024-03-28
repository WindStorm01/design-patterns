package com.rh.proxy.main;

import com.rh.proxy.proxy.SearchProxy;

/**
 * 代理模式
 */
public class ProxyMain {

    public static void main(String[] args) {
        SearchProxy searchProxy = new SearchProxy();
        searchProxy.doSearch("rh","入门到跑路");
    }

}
