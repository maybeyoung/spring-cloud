package com.example.cloud.repository;

import com.example.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/10/11 0011.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
