package com.rh.proxy.proxy;

import com.rh.proxy.inteface.Logger;
import com.rh.proxy.inteface.RealSearch;
import com.rh.proxy.inteface.Searcher;
import com.rh.proxy.inteface.Validator;

public class SearchProxy implements Searcher {
    private RealSearch search =  new RealSearch();
    private Validator validator;
    private Logger logger;

    @Override
    public String doSearch(String userId, String keyWord) {
        if (validate(userId)){
            String result = search.doSearch(userId, keyWord);
            this.log(userId);
            return result;
        }
        return null;
    }

    public Boolean validate(String userId){
         validator = new Validator();
         return validator.validate(userId);
    }

    public void log(String userId){
        logger = new Logger();
        logger.log(userId);
    }
}
