package com.estudos.albumdefigurinhas.repository;

import com.estudos.albumdefigurinhas.entity.AlbumFigurinhas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumFigurinhasRepository extends JpaRepository<AlbumFigurinhas,Long> {
}
