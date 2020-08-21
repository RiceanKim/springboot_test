package com.ricean.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class ResponseVO {
    private String result;
    private String msg;
    private Object data;

    public ResponseVO() {
        this.result = "1";
        this.msg = "SUCCESS";
    }

    public ResponseVO(String result) {
        this.result = result;
    }

    public ResponseVO(String result, String msg) {
        this.result = result;
        this.msg = msg;
    }

    public ResponseVO(String result, String msg, Object data) {
        this.result = result;
        this.msg = msg;
        this.data = data;
    }
}
