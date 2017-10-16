package com.soul.wk.dutychain.client;

import com.soul.wk.dutychain.domain.HoliRequest;
import com.soul.wk.dutychain.domain.Request;
import com.soul.wk.dutychain.domain.SalaryRequest;
import com.soul.wk.dutychain.handler.CeoManager;
import com.soul.wk.dutychain.handler.DepartmentManager;
import com.soul.wk.dutychain.handler.LocalManager;
import com.soul.wk.dutychain.handler.Manager;

public class chainDemo {

    public static void main(String[] args) {
        chainTest();
    }

    private static void chainTest() {
        Manager department = new DepartmentManager("铁蛋");
        Manager local = new LocalManager("狗剩");
        Manager ceo = new CeoManager("美美");
        department.setManager(local);
        local.setManager(ceo);

        Request request = new HoliRequest();
        request.setRequestContent("小明请假20天！");
        request.setRequestNum(20);

        Request sRequest = new SalaryRequest();
        sRequest.setRequestContent("小明请求加薪1000！");
        sRequest.setRequestNum(1000);

        department.execute(request);
        department.execute(sRequest);

    }
}
