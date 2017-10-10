package com.soul.wk.component.client;

import com.soul.wk.component.branch.BJCompany;
import com.soul.wk.component.component.Company;
import com.soul.wk.component.leaf.FinancialDepartment;
import com.soul.wk.component.leaf.HRDepartment;

public class ComponentDemo {

    public static void main(String[] args) {
        componentTest();
    }

    private static void componentTest() {
        Company bjCompany = new BJCompany("北京总公司");
        bjCompany.add(new HRDepartment("北京总公司人力资源部"));
        bjCompany.add(new FinancialDepartment("北京总公司财务部"));

        Company hdCompany = new BJCompany("华东分公司");

        hdCompany.add(new HRDepartment("华东分公司人力资源部"));
        hdCompany.add(new FinancialDepartment("华东分公司财务部"));
        bjCompany.add(hdCompany);

        bjCompany.display(1);

        System.out.println();
        bjCompany.duty();

    }
}
