package com.bl.adp;

import java.util.List;

public class PrintDetails {
    public void print(List ContactList) {
        for (int i = 0; i < ContactList.size(); i++) {
            System.out.println(ContactList.get(i));
        }
    }
}
