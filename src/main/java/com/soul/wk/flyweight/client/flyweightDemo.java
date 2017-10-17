package com.soul.wk.flyweight.client;

import com.soul.wk.flyweight.flyweight.User;
import com.soul.wk.flyweight.flyweight.WebSiteFactory;
import com.soul.wk.flyweight.flyweight.Website;

public class flyweightDemo {

    public static void main(String[] args) {
        flyweightTest();
    }

    private static void flyweightTest() {

        WebSiteFactory factory = new WebSiteFactory();
        Website website1 = factory.getConcreteWebsite("产品展示");
        website1.use(new User("美美"));
        Website website2 = factory.getConcreteWebsite("产品展示");
        website2.use(new User("狗蛋"));
        Website website3 = factory.getConcreteWebsite("产品展示");
        website3.use(new User("狗剩"));
        Website website4 = factory.getConcreteWebsite("博客");
        website4.use(new User("大柱"));
        Website website5 = factory.getConcreteWebsite("博客");
        website5.use(new User("小花"));
        Website website6 = factory.getConcreteWebsite("博客");
        website6.use(new User("芳芳"));

        factory.getTotalObjectCount();

    }
}
