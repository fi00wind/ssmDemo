package cn.coolwind.ssmdemo.service;

import cn.coolwind.ssmdemo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    public Object getById(int id) {
        return testDao.getById(id);
    }
}
