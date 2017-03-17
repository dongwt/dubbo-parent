package com.dongwt.dubbo.api.req;

import com.dongwt.dubbo.enums.SexEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 8041130182897801172L;

    private String name;

    private Integer age;

    private SexEnum sex;
}
