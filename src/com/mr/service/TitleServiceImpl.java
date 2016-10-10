package com.mr.service;

import com.mr.bean.Title;
import com.mr.mapper.TitleMapper;
import com.mr.service.Iservice.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaohailong on 2016/9/17.
 */
@Service("titleService")
public class TitleServiceImpl implements TitleService {
    @Autowired
    private TitleMapper titleMapper;

    @Override
    public List<Title> getAll() {
        List<Title> title = titleMapper.findAll();
        System.out.println(title.size()+"fadsfdsafsadffadsfdsafsadf");
        return title;
    }

}
