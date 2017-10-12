package com.soul.wk.command.command;

import com.soul.wk.command.receiver.Barbecuer;

public class ChickenCommand extends Command {

    public ChickenCommand(){

    }

    public ChickenCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    public void executeCommand() {
        barbecuer.barbecueChicken();
    }
}
