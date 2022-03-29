package com.estudos.albumdefigurinhas.controller;

import com.estudos.albumdefigurinhas.dto.AlbumDTO;
import com.estudos.albumdefigurinhas.dto.JogadorDTO;
import com.estudos.albumdefigurinhas.entity.AlbumFigurinhas;
import com.estudos.albumdefigurinhas.repository.AlbumFigurinhasRepository;
import com.estudos.albumdefigurinhas.request.AlbumRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/album")
public class AlbumFigurinhasController {

    @Autowired
    private AlbumFigurinhasRepository repository;

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody AlbumRequest albumRequest) {
        AlbumFigurinhas albumFigurinhas = albumRequest.converteParaAlbum();

        albumFigurinhas = repository.save(albumFigurinhas);
        AlbumDTO albumDTO = new AlbumDTO().converteParaDTO(albumFigurinhas);
        return ResponseEntity.ok(albumDTO);
    }

    @GetMapping
    public ResponseEntity<?> listarTodos() {
        List<AlbumFigurinhas> albumFigurinhas = repository.findAll();
        return ResponseEntity.ok(albumFigurinhas);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> listarTodos(@PathVariable Long id) {
        Optional<AlbumFigurinhas> albumFigurinhas = repository.findById(id);
        if(albumFigurinhas.isPresent())
            return ResponseEntity.ok(albumFigurinhas);
        return ResponseEntity.notFound().build();
    }

}
