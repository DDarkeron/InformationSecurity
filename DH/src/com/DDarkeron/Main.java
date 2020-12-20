package com.DDarkeron;

import com.DDarkeron.dh.DH;

public class Main {

    public static void main(String[] args) {
        DH dh = new DH();
        Person dick = new Person(dh);
        Person alice = new Person(dh);

        int p = dick.createP();
        int g = dick.createG();
        System.out.println("p: " + p);
        System.out.println("g: " + g);
        System.out.println();

        dick.createPrivateKey();
        alice.createPrivateKey();
        System.out.print("Alice: ");
        dick.sayPrivateKey();
        System.out.print("Dick: ");
        alice.sayPrivateKey();
        System.out.println();

        int bobPublicKey = dick.createPublicKey();
        int jackPublicKey = alice.createPublicKey();
        System.out.println("Alice's public key: " + bobPublicKey);
        System.out.println("Dick's public key: " + jackPublicKey);
        System.out.println();

        dick.createGeneralSecretKey(jackPublicKey);
        alice.createGeneralSecretKey(bobPublicKey);
        System.out.print("Alice: ");
        dick.sayGeneralSecretKey();
        System.out.print("Dick: ");
        alice.sayGeneralSecretKey();
    }

}
