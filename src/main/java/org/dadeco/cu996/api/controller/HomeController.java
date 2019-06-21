package org.dadeco.cu996.api.controller;

import org.dadeco.cu996.dataobject.UserDO;
import org.dadeco.cu996.response.CommonReturnType;
import org.dadeco.cu996.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private UserService UserService;

    @GetMapping("/home")
    @ResponseBody
    public CommonReturnType home() {
        List<UserDO> UserDOlist = UserService.findUpAll();

        return CommonReturnType.create(UserDOlist);

    }
}

