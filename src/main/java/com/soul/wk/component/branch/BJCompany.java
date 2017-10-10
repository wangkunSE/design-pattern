package com.soul.wk.component.branch;

import com.soul.wk.component.component.Company;

import java.util.ArrayList;
import java.util.List;

public class BJCompany extends Company {

    List<Company> list = new ArrayList<Company>();
    public BJCompany(String name) {
        super(name);
    }

    public void add(Company company) {
        list.add(company);
    }

    public void remove(Company company) {
        list.remove(company);
    }

    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString()+name);

        for( Company company : list){
            company.display(depth+2);
        }
    }

    public void duty() {
        for ( Company company : list){
            company.duty();
        }
    }
}
