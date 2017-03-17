package com.dongwt.dubbo.api.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> implements Serializable{

	private static final long serialVersionUID = 4678546660271566677L;

	private Integer status;
	
	private String message;
	
	private T data;
	

}
