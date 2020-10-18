package com.redtrees.werewolf.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
@Entity
public class Room {
    @Id
    private int id;
    private int roomid;
    private String playerList;
    private String gameStart;
    private int curPlayerNo;
    private String gameMode;
}
