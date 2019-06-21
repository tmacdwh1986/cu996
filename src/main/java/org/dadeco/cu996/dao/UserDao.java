package org.dadeco.cu996.dao;

import org.dadeco.cu996.dataobject.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<UserDO, String> {

        List<UserDO> findByRole(String role);
}
