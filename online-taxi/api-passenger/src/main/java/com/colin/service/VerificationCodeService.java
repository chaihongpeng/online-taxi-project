package com.colin.service;


import com.colin.dto.ResponseResult;

public interface VerificationCodeService {

    public ResponseResult send(String phoneNumber);

    public ResponseResult verify(String phoneNumber, String code);
}
