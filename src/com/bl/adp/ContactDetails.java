package com.bl.adp;

import java.util.ArrayList;
import java.util.List;

public class ContactDetails {

        List ContactList = new ArrayList();

        public void add(Contacts contactPerson){
            ContactList.add(contactPerson);
        }

         List printdetails(){
            return ContactList;
        }


}
