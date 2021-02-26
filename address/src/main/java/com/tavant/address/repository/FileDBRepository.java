package com.tavant.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tavant.address.models.FileDB;



@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
