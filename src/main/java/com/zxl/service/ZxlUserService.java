package com.zxl.service;
import com.zxl.model.ZxlUser;
import java.util.List;

/**
 * 服务层接口
 */

public interface ZxlUserService {
    List<ZxlUser> findAll();
}
