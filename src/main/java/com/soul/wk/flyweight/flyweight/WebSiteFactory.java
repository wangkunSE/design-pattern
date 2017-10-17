package com.soul.wk.flyweight.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {

    private Map<String,Website> map = new HashMap();

    public Website getConcreteWebsite(String key){

        if (!map.containsKey(key)){
            map.put(key,new ConcreteWebsite(key));
        }
        return map.get(key);
    }

    public void getTotalObjectCount(){
        System.out.println("总共有："+map.size()+" 个对象");
    }
}
