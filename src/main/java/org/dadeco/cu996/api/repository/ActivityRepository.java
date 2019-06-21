package org.dadeco.cu996.api.repository;

import org.dadeco.cu996.api.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {
    Activity findByName(String name);

    @Query(value = "", nativeQuery = true)
    List<Object[]> getEffortByPjoname();

    Activity save(Activity productInfo);
}
