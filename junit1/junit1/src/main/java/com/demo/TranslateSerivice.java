package com.demo;

import com.sun.tools.javac.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class TranslateSerivice {
    public Map<String,String> dictionary = new HashMap<>();
    public TranslateSerivice(){
        initDict();
    }

    private void initDict() {
        dictionary.put("hello","Bonjour");
        dictionary.put("yes","Qui");
        dictionary.put("no","Non");
        dictionary.put("goodbye","Au revior");
        dictionary.put("good night","Bonne nuit");
        dictionary.put("thank you","Merci");
    }

    public String translatr(String text){
        if (text == null || text.trim().isEmpty()){ //trim 左右去空格
            throw new IllegalArgumentException("输入值不能为空");
        }
        return englishToFrench(text);
    }

    private String englishToFrench(String text) {
        String textlowercase = text.toLowerCase();
        return dictionary.getOrDefault(textlowercase,"没有找到");
    }

    public static void main(String[] args) {
        TranslateSerivice dic = new TranslateSerivice();
        String dic1 = dic.dictionary.get("hello");
        System.out.println(dic1);
    }

}

