package com.soul.wk.command.command;

import com.soul.wk.command.receiver.Barbecuer;

public abstract class Command {

    protected Barbecuer barbecuer = new Barbecuer("铁蛋");

    public Command(){

    }

    public Command(Barbecuer barbecuer){
        this.barbecuer = barbecuer;
    }

    public abstract void executeCommand();
}
