package com.soul.wk.command.invoker;

import com.soul.wk.command.command.Command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {

    private String name;

    public Waiter(String name) {
        this.name = name;
    }

    private List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command command){
        commands.add(command);
        System.out.println(name+"增加订单："+command.toString()+(new Date().toString()));
    }

    public void delCommand(Command command){
        commands.remove(command);
        System.out.println(name+"撤销订单："+command.toString()+(new Date().toString()));
    }

    public void notifyExecute(){
        for( Command command : commands){
            command.executeCommand();
        }
    }
}
