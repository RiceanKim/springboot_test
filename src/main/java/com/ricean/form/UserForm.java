package com.ricean.form;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
public class UserForm {
    @NotEmpty(message = "vin码不能为空")
    private String vin;
}
