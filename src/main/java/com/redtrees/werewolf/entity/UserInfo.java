package com.redtrees.werewolf.entity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
public class UserInfo {
    @Id
    private int openid;
    private String sessionKey;
}
