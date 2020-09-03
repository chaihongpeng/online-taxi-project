package com.conlin.serviceverificationcode.response;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class VerifyCodeResponse {
	
	private String code;
}