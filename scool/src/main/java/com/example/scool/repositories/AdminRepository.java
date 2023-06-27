package com.example.scool.repositories;

import com.example.scool.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    @Override
    List<Admin> findAll();
}
