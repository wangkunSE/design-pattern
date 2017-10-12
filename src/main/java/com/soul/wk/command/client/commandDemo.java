package com.soul.wk.command.client;

import com.soul.wk.command.command.ChickenCommand;
import com.soul.wk.command.command.Command;
import com.soul.wk.command.command.MuttonCommand;
import com.soul.wk.command.invoker.Waiter;
import com.soul.wk.command.receiver.Barbecuer;

public class commandDemo {

    public static void main(String[] args) {
        commandTest();
    }

    private static void commandTest() {
        //客户不需要知道烤肉的人是谁
//        Barbecuer barbecuer = new Barbecuer("狗剩");
        Command command1 = new MuttonCommand();
        Command command2 = new MuttonCommand();
        Command command3 = new ChickenCommand();
        Waiter waiter = new Waiter("美美");

        waiter.setCommand(command1);
        waiter.setCommand(command2);
        waiter.setCommand(command3);
        waiter.delCommand(command2);

        waiter.notifyExecute();
    }
}
