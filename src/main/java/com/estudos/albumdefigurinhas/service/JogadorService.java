package com.estudos.albumdefigurinhas.service;

import com.estudos.albumdefigurinhas.entity.Jogador;
import com.estudos.albumdefigurinhas.entity.PosicaoJogador;
import com.estudos.albumdefigurinhas.entity.Time;
import com.estudos.albumdefigurinhas.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    public List<Jogador> buscarTodos(){
        return jogadorRepository.findAll();
    }

    public List<Jogador> buscaJogadoresPorPosicao(PosicaoJogador posicaoJogador){
        return  jogadorRepository.findAllByPosicao(posicaoJogador);
    }

    public Jogador salva(Jogador jogador){
        return jogadorRepository.save(jogador);
    }

    public Optional<Jogador> buscaPorId(Long id){
        return jogadorRepository.findById(id);
    }

    public Jogador alteraTime(Long jogadorId, Time time) throws Exception {
        Optional<Jogador> jogador = jogadorRepository.findById(jogadorId);

        if (jogador.isPresent()){
            return jogadorRepository.save(jogador.get());
        }else {
            throw new Exception("Jogador não encontrado");
        }
    }
}
