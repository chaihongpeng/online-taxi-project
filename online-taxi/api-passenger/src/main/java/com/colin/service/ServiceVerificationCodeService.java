package com.colin.service;

import com.colin.constant.IdentityConstant;
import com.colin.dto.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("service-verification-code")
public interface ServiceVerificationCodeService {
    @GetMapping("/verify-code/generate/{identity}/{phoneNumber}")
    ResponseResult generatorCode(@PathVariable("identity") int identity, @PathVariable("phoneNumber") String phoneNumber);
}
