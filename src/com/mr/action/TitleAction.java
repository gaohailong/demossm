package com.mr.action;

import com.mr.bean.Title;
import com.mr.service.TitleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by gaohailong on 2016/9/17.
 */
@Controller
public class TitleAction {

    @Autowired
    private TitleServiceImpl titleService;

    /*@RequestMapping("/helloworld")
    public String hello() {
        return "success";
    }*/
    @ResponseBody
    @RequestMapping("/helloworld")
    public List<Title> getAll() {
        return titleService.getAll();
    }
}
