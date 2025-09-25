package com.Windz;

import java.util.Random;

public class Captcha {
    public static void main(String[] args) {
        String captcha = RandomCaptcha(5);
        System.out.println(captcha);
    }
    public  static String  RandomCaptcha(int length){
        //定义要使用的自由集
        String number = "0123456789";
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWSYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwsyz";
        //合并所以的字符集
        String allCharacters = number + upperCaseLetters + lowerCaseLetters;
        //生成随机数
        Random random = new Random();
        //存储验证码
        StringBuilder captcha = new StringBuilder();
        //循环生成验证码
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allCharacters.length());
            char randomChar = allCharacters.charAt(index);
            captcha.append(randomChar);
        }
        return captcha.toString();
    }
}
