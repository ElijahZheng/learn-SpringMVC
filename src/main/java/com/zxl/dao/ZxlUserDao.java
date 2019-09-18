package com.zxl.dao;
import com.zxl.model.ZxlUser;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 接口，提供 findAll 方法用来查询所有的用户
 */

@Repository
public interface ZxlUserDao {
    List<ZxlUser> findAll();
}
