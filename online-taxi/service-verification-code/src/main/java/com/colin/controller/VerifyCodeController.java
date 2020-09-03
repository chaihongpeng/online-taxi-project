package com.colin.controller;

import com.colin.dto.ResponseResult;
import com.colin.service.VerifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verify-code")
public class VerifyCodeController {
    @Autowired
    VerifyCodeService verifyCodeService;

    @GetMapping("/generate/{identity}/{phoneNumber}")
    public ResponseResult generate(@PathVariable("identity") int identity,@PathVariable("phoneNumber") String phoneNumber) {
        System.out.println(identity + phoneNumber);
        return verifyCodeService.generate();
    }
}
