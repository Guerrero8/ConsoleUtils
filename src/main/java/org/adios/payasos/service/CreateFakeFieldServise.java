package org.adios.payasos.service;

import java.util.Random;

public class CreateFakeFieldServise {
    public String createFakeField(){
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int length = 8;
        StringBuilder symbolBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            symbolBuilder.append(randomChar);
        }
        return symbolBuilder.toString();
    }
}