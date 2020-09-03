package com.colin.controller;

import com.colin.dto.ResponseResult;
import com.colin.request.ShortMsgRequest;
import com.colin.service.VerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verify-code")
public class VerificationCodeController {
    @Autowired
    private VerificationCodeService verificationCodeService;

    @GetMapping("/send")
    public ResponseResult send(@RequestBody ShortMsgRequest request) {
        return verificationCodeService.send(request.getPhoneNumber());
    }
}
