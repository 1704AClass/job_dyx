package com.ningmeng.ucenter.dao;

import com.ningmeng.framework.domain.ucenter.NmMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 12699 on 2020/3/13.
 */
@Mapper
public interface NmMenuMapper {
    public List<NmMenu> selectPermissionByUserId(String userid);
}
