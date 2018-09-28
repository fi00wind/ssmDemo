package cn.coolwind.ssmdemo.dao;

import cn.coolwind.ssmdemo.model.Test;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao {
    Test getById(int id);
}
