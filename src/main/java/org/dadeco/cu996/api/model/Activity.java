package org.dadeco.cu996.api.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Activity")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @Column(name = "name")
    private String name;

    @NonNull
    @Column(name = "start")
    private String start;

    @NonNull
    @Column(name = "end")
    private String end;

    @Column(name = "chargeable")
    @NonNull
    private String chargeable;

    @NonNull
    @Column(name = "is_planned")
    private String isPlanned;

    @Column(name = "daily_effort")
    @NonNull
    private Integer dailyEffort;

    @Enumerated(EnumType.STRING)
    private ActivityRole role;
}
