package com.soul.wk.component.leaf;

import com.soul.wk.component.component.Company;

import java.util.ArrayList;
import java.util.List;

public class HRDepartment extends Company {

    List<Company> list = new ArrayList<Company>();

    public HRDepartment(String name) {
        super(name);
    }

    public void add(Company company) {
    }

    public void remove(Company company) {

    }

    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString()+name);
    }

    public void duty() {
        System.out.println("人力资源部，管理新人培训"+name);
    }
}
