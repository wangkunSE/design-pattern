package com.soul.wk.visitor.client;

import com.soul.wk.visitor.person.Man;
import com.soul.wk.visitor.person.Woman;
import com.soul.wk.visitor.visitor.Amativeness;
import com.soul.wk.visitor.visitor.Failing;
import com.soul.wk.visitor.visitor.ObjectStruct;
import com.soul.wk.visitor.visitor.Success;

public class visitorDemo {

    public static void main(String[] args) {
        visitorTest();
    }

    private static void visitorTest() {

        ObjectStruct objectStruct = new ObjectStruct();
        objectStruct.addState(new Man());
        objectStruct.addState(new Woman());

        Success success = new Success();
        objectStruct.dispaly(success);

        Failing failing = new Failing();
        objectStruct.dispaly(failing);

        Amativeness amativeness = new Amativeness();
        objectStruct.dispaly(amativeness);
    }
}
