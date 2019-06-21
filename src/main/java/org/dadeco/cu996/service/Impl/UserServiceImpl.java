package org.dadeco.cu996.service.Impl;

import org.dadeco.cu996.dao.UserDao;
import org.dadeco.cu996.dataobject.UserDO;
import org.dadeco.cu996.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao UserDao;

    @Override
    public List<UserDO> findUpAll() {

        return UserDao.findByRole("admin");
    }
}
