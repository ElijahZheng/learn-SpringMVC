package com.zxl.service.impl;
import com.zxl.dao.ZxlUserDao;
import com.zxl.model.ZxlUser;
import com.zxl.service.ZxlUserService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 服务层实现类，注入 ZxlUserDao 接口，并实现 findAll() 方法
 */

@Service
public class ZxlUserServiceImpl implements ZxlUserService{
    @Resource
    private ZxlUserDao zxlUserDao;

    public List<ZxlUser> findAll () {
        return zxlUserDao.findAll();
    }
}
