package com.ecommerse.shopify.model; // This MUST match your folder structure

import lombok.Data;

@Data
public class UserDTO {
    private String username;
    private String email;
    private String password;
}