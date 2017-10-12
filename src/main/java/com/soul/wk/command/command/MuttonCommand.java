package com.soul.wk.command.command;

import com.soul.wk.command.receiver.Barbecuer;

public class MuttonCommand extends Command {

    public MuttonCommand(){

    }
    public MuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    public void executeCommand() {
        barbecuer.barbecueMutton();
    }
}
