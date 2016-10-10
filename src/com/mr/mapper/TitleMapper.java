package com.mr.mapper;

import com.mr.bean.Title;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 * Created by gaohailong on 2016/9/13.
 */
public interface TitleMapper {
/*    void save(Title title);

    void update(Title title);*/

    List<Title> findAll();
}
