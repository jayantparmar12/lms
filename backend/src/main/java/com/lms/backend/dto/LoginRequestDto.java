package com.lms.backend.dto;

import lombok.Data;

@Data
public class LoginRequestDto {
    private String name;
    private String password;
}
