package com.rh.proxy.inteface;

public class RealSearch implements Searcher{
    @Override
    public String doSearch(String userId, String keyWord) {
        System.out.println("用户：" + userId + "使用关键词：" + keyWord + "查询" );
        return "查询内容";
    }
}
