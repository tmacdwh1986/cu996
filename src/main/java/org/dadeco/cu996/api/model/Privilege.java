package org.dadeco.cu996.api.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    @NonNull
    private String name;

    @ManyToMany(mappedBy = "privileges")
    private Set<Role> roles;
}
