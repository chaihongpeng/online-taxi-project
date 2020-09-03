package com.colin.service;


import com.colin.dto.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-sms")
public interface ServiceSmsService {

    @RequestMapping(value = "/send/sms-template",method = RequestMethod.POST)
    ResponseResult sendSms(String phoneNumber , String code);
}
