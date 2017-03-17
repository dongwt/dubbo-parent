package com.dongwt.dubbo.enums;


public enum SexEnum {

    MAN(1,"男"),WOMAN(2,"女");

    private Integer key;

    private String value;

    SexEnum(){}

    SexEnum(Integer key,String value){
        this.key = key;
        this.value = value;
    }

}
