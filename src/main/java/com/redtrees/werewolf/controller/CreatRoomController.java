package com.redtrees.werewolf.controller;

import com.redtrees.werewolf.entity.Player;
import com.redtrees.werewolf.entity.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreatRoomController {

    @PostMapping(value = "/feedback")
    protected Result creatRoom(Player creator, @RequestParam("roleList")String roleList){

        return new Result();
    }
}
