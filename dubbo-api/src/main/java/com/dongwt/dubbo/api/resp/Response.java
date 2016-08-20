package com.dongwt.dubbo.api.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {
	
	@Setter
	@Getter
	private Integer status;
	
	@Setter
	@Getter
	private String message;
	
	@Setter
	@Getter
	private T data;
	

}
