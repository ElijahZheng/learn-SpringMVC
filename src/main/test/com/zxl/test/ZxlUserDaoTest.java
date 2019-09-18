package com.zxl.test;

import com.zxl.dao.ZxlUserDao;
import com.zxl.model.ZxlUser;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class ZxlUserDaoTest extends BaseJunit4Test{
    @Resource
    private ZxlUserDao zxlUserDao;

    @Test
    public void testFindAll () {
        List<ZxlUser> userList = zxlUserDao.findAll();
        System.out.println(userList.size());
    }
}
