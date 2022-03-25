package com.estudos.albumdefigurinhas.repository;

import com.estudos.albumdefigurinhas.entity.Jogador;
import com.estudos.albumdefigurinhas.entity.PosicaoJogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador,Long> {

    List<Jogador> findAllByPosicao(PosicaoJogador posicaoJogador);

    List<Jogador> findAllByTimeId(Long timeId);

}
