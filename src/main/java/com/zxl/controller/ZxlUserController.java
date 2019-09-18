package com.zxl.controller;
import com.zxl.model.ZxlUser;
import com.zxl.service.ZxlUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 注入服务层接口
 * @date 2019/9/7
 */

@Controller
@RequestMapping("/user")
public class ZxlUserController {
    @Resource
    private ZxlUserService zxlUserService;

    @GetMapping("/findAll")
    public String findAll(Model model) {
        List<ZxlUser> zxlUserList = zxlUserService.findAll();
        for (ZxlUser zxlUser: zxlUserList) {
            System.out.println("id: " + zxlUser.getId());
            System.out.println("name: " + zxlUser.getName());
        }
        return "hello";
    }
}
