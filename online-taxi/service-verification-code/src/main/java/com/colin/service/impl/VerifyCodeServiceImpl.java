package com.colin.service.impl;

import com.colin.dto.ResponseResult;
import com.colin.service.VerifyCodeService;
import com.conlin.serviceverificationcode.response.VerifyCodeResponse;
import org.springframework.stereotype.Service;

@Service
public class VerifyCodeServiceImpl implements VerifyCodeService {
    @Override
    public ResponseResult<VerifyCodeResponse> generate() {
        //生成随机六位数
        String code = String.valueOf((int) ((Math.random() * 9 + 1) * Math.pow(10, 5)));

        return ResponseResult.success(new VerifyCodeResponse().setCode(code));
    }
}
