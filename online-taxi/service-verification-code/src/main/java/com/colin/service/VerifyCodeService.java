package com.colin.service;

import com.colin.dto.ResponseResult;
import com.conlin.serviceverificationcode.response.VerifyCodeResponse;

public interface VerifyCodeService {
    public ResponseResult<VerifyCodeResponse> generate();
}
