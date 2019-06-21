package org.dadeco.cu996.service;

import org.dadeco.cu996.dataobject.UserDO;

import java.util.List;

public interface UserService {
    List<UserDO> findUpAll();
}
