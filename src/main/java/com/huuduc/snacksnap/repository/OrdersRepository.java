package com.huuduc.snacksnap.repository;

import com.huuduc.snacksnap.data.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {

    List<Orders> findByUserId(long userId);

    List<Orders> findByStatusId(long statusId);

    List<Orders> findByUserIdAndStatusId(long userId,long statusId);

    Long countByStatusId(long statusId);
}