package org.dadeco.cu996.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "user")
public class UserDO {

        @Id
        private int Id;

        private String ntName;

        private String passwordMd5;

        private String email;

        private String role;

}
