package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Create Credentials
        Credential cred1 = new Credential();
        Credential cred2 = new Credential();
        Credential cred3 = new Credential();

        //Set the credential data
        cred1.setCredential("Insta", "lolkek@gmail.com", "1234");
        cred2.setCredential("Google", "lolkek@gmail.com", "asdfaxvv");
        cred3.setCredential("Facebook", "lolkek@gmail.com", "fi023@");

        //create a credential vault and add the credentials to it
        Credential[] vault = new Credential[3];
        vault[0]=cred1;
        vault[1]=cred2;
        vault[2]=cred3;

        //Search for credential based on the users input
        System.out.println("Which credential are you looking for?");
        String query = input.next();
        for (Credential credential : vault) {
            String description = credential.getCredential()[0];
            if (description.equals(query)) {
                System.out.println(credential.getInfo());
            }
        }
    }
}