package com.flashyy.aopDemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipImpl implements MembershipDao{

    @Override
    public void addAccount() {
        System.out.print("\n we are in the membership impl \n");
    }
}
