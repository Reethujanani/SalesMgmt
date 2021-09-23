package com.example.SalesMgmt.DTO;

import lombok.Data;

import java.sql.Timestamp;

@Data

public class UserDTO {

    private int id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String mobile_no;
    private int is_active;
    private int is_deleted;


}
