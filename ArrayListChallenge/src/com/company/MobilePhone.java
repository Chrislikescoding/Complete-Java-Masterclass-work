package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
        private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }


    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getContactName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition <0) {
            System.out.println(oldContact.getContactName() + " was notFound");
            return false;
        }else if(findContact(newContact.getContactName()) != -1){
            System.out.println("Contact with name " + newContact.getContactName() + " already exists. Update was not successful  ");
            return false;
            }
        this.myContacts.set(foundPosition,newContact);
        System.out.println(oldContact.getContactName() + " was replaced with" + newContact.getContactName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getContactName() + " was not Found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getContactName() + " was deleted");
        return true;
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactName){
        for(int i = 0; i< this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getContactName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if (findContact(contact) >= 0) {
            return contact.getContactName();
        }
        return null;
        }
    public Contact queryContact(String name){
        int position = findContact(name);
              if (position  >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for(int i = 0; i< this. myContacts.size(); i++) {
            System.out.println((i + 1) + "." +
             this.myContacts.get(i).getContactName()+ "->" +
            this.myContacts.get(i).getContactNumber());


        }
    }

    }





