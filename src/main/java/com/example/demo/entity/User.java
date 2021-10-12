package com.example.demo.entity;

import java.util.Date;
import lombok.Data;

@Data
public class User {

  private Integer userId;
  private String userName;
  private String password;
  private Integer role;
  private Integer storeId;
  private Integer userStatus;
  private String createdUser;
  private Date createdAt;
  private String updatedUser;
  private Date updatedAt;

}
