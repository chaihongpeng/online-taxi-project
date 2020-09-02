package com.colin.constant;

import lombok.Getter;

public enum CommonStatusEnum {
    VERIFY_DODE_ERROR(1001, "短信认证失败");
    @Getter
    int code;
    @Getter
    String value;

    CommonStatusEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }
}
