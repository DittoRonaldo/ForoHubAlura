package com.example.FOROHUBFINAL;

import com.example.FOROHUBFINAL.Tópico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Scanner;

public interface TópicoRepository extends JpaRepository<Tópico, Long> {
    Page<Tópico> findAll(Pageable pageable);

    @GetMapping
    public Page<Tópico> obtenerTópicos(@PageableDefault(size = 10) Pageable pageable) {
        Scanner tópicoRepository;
        return tópicoRepository.findAll(pageable);
    }

}
