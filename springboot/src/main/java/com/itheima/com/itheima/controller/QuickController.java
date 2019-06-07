package com.itheima.com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Herbert
 * @create 2019-05-31 19:12
 */
@Controller
public class QuickController {

    @RequestMapping("/quick")
    @ResponseBody
    public String Quick(){
        return "hello springboot";
    }
    //修改一点点同步回本地仓库
}
