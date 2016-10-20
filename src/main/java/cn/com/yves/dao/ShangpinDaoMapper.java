package cn.com.yves.dao;

import cn.com.yves.pojo.Shangpin;

public interface ShangpinDaoMapper {
    int insert(Shangpin record);

    int insertSelective(Shangpin record);
}