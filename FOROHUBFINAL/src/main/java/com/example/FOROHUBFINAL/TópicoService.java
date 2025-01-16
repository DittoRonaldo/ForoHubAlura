package com.example.FOROHUBFINAL;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class TópicoService {

 import java.util.Optional;
package com.example.FOROHUBFINAL;

import com.example.FOROHUBFINAL.Tópico;
import com.example.FOROHUBFINAL.TópicoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

    @Service
    public class TópicoService {

        private final TópicoRepository tópicoRepository;

        public TópicoService(TópicoRepository tópicoRepository) {
            this.tópicoRepository = tópicoRepository;
        }

        public Tópico crearTópico(Tópico tópico) {
            return tópicoRepository.save(tópico);
        }

        public List<Tópico> obtenerTópicos() {
            return tópicoRepository.findAll();
        }
    }

    @Service
    public class TópicoService {




        private final TópicoRepository tópicoRepository;

        public TópicoService(TópicoRepository tópicoRepository) {
            this.tópicoRepository = tópicoRepository;
        }

        public Tópico actualizarTópico(Long id, Tópico datosActualizados) {
            Optional<Tópico> tópicoExistente = tópicoRepository.findById(id);

            if (tópicoExistente.isPresent()) {
                Tópico tópico = tópicoExistente.get();
                tópico.setTítulo(datosActualizados.getTítulo());
                tópico.setMensaje(datosActualizados.getMensaje());
                tópico.setStatus(datosActualizados.getStatus());
                tópico.setAutor(datosActualizados.getAutor());
                tópico.setCurso(datosActualizados.getCurso());
                return tópicoRepository.save(tópico);
            } else {
                throw new RuntimeException("Tópico no encontrado con id: " + id);
            }
        }
    }

}
