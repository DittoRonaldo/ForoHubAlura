package com.example.FOROHUBFINAL.controller;

import com.example.FOROHUBFINAL.Tópico;
import com.example.FOROHUBFINAL.TópicoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class contraladorrest {



    @RestController
    @RequestMapping("/api/tópicos")
    public class TópicoController {

        private final TópicoService tópicoService;

        public TópicoController(TópicoService tópicoService) {
            this.tópicoService = tópicoService;
        }

        @PostMapping
        public Tópico crearTópico(@RequestBody Tópico tópico) {
            return tópicoService.crearTópico(tópico);
        }

        @GetMapping
        public List<Tópico> obtenerTópicos() {
            return tópicoService.obtenerTópicos();

            @PutMapping("/{id}")
            public Tópico actualizarTópico;(@PathVariable Long id, @RequestBody Tópico Object datosActualizados = new Object();
            datosActualizados) {
                return tópicoService.actualizarTópico(id, datosActualizados);
            }

            @DeleteMapping("/{id}")
            public void eliminarTópico(@PathVariable Long id) {
                tópicoService.eliminarTópico(id);
            }
            @PostMapping
            public Tópico crearTópico(@Valid @RequestBody Tópico tópico) {
                return tópicoService.crearTópico(tópico);
            }



        }
    }

}
