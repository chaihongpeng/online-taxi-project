package com.colin.service.impl;

import com.colin.constant.CommonStatusEnum;
import com.colin.constant.IdentityConstant;
import com.colin.dto.ResponseResult;
// import com.colin.service.ServiceSmsService;
import com.colin.service.ServiceVerificationCodeService;
import com.colin.service.VerificationCodeService;
import com.conlin.serviceverificationcode.response.VerifyCodeResponse;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerificationCodeServiceImpl implements VerificationCodeService {

    @Autowired
    private ServiceVerificationCodeService serviceVerificationCodeService;
    // @Autowired
    // private ServiceSmsService serviceSmsService;

    @Override
    public ResponseResult send(String phoneNumber) {
        // 获取验证码
        ResponseResult responseResult = serviceVerificationCodeService.generatorCode(IdentityConstant.PASSENGER, phoneNumber);
        VerifyCodeResponse verifyCodeResponse = null;
        if (responseResult.getCode() == CommonStatusEnum.SUCCESS.getCode()) {
            JSONObject data = JSONObject.fromObject(responseResult.getData().toString());
            verifyCodeResponse = (VerifyCodeResponse) JSONObject.toBean(data, VerifyCodeResponse.class);

        } else {
            return ResponseResult.fail("获取验证码失败");
        }

        String code = verifyCodeResponse.getCode();

        // ResponseResult result = serviceSmsService.sendSms(phoneNumber, code);
        // if (result.getCode() != CommonStatusEnum.SUCCESS.getCode()) {
        //     return ResponseResult.fail("发送短信 失败");
        // }
        return ResponseResult.success(responseResult);
    }

    @Override
    public ResponseResult verify(String phoneNumber, String code) {

        // return serviceVerificationCodeRestTemplateService.verifyCode(IdentityConstant.PASSENGER,phoneNumber,code);
        return null;
    }

}
