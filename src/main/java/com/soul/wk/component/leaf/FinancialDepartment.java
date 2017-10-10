package com.soul.wk.component.leaf;

import com.soul.wk.component.component.Company;

public class FinancialDepartment extends Company {

    public FinancialDepartment(String name) {
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
        System.out.println("财务部门，管理财务!"+name);
    }
}
