package com.example.demo.entity;

import lombok.Data;

@Data
public class UserInfo {
  // ユーザID
  private int userId;

  // ユーザ名
  private String userName;

  // 店舗名
  private String storeName;

  // ロール
  private String role;

  // ユーザステータス
  private int userStatus;
}
