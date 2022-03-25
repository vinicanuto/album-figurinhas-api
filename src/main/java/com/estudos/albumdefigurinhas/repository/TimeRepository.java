package com.estudos.albumdefigurinhas.repository;

import com.estudos.albumdefigurinhas.entity.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends JpaRepository<Time,Long> {

}
