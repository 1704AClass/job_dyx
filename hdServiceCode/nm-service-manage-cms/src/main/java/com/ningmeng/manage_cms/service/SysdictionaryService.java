package com.ningmeng.manage_cms.service;

import com.ningmeng.framework.domain.system.SysDictionary;
import com.ningmeng.manage_cms.dao.SysDictionaryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 12699 on 2020/2/20.
 */
@Service
public class SysdictionaryService {
    @Autowired
    private SysDictionaryDao sysDictionaryDao;
    //根据字典分类type查询字典信息
    public SysDictionary findDictionaryByType(String type){
        return sysDictionaryDao.findBydType(type);
    }
}
