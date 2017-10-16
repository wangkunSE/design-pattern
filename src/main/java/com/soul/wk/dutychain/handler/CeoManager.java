package com.soul.wk.dutychain.handler;

import com.soul.wk.dutychain.domain.Request;

public class CeoManager extends Manager {
    public CeoManager(String name) {
        super(name);
    }

    public String getLevel() {
        return "总经理";
    }

    public void execute(Request request) {
        if ((request.getRequestNum() < 100 && "请假".equals(request.getType()))||(request.getRequestNum() < 10000 && "加薪".equals(request.getType()))){
            System.out.println(name +"处理了"+request.getType() +"请求,内容是:"+request.getRequestContent());
        }else {
            if (this.manager!=null)
                this.manager.execute(request);
            else
                System.out.println(request+"此次请求无法完成！");
        }
    }
}
