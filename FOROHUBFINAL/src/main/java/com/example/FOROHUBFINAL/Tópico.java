package com.example.FOROHUBFINAL;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import jakarta.validation.constraints.*;

public class Tópico {


    @Entity
    @Table(name = "tópicos")
    public class Tópico {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String título;
        private String mensaje;

        @Column(name = "fecha_creación")
        private LocalDateTime fechaCreación = LocalDateTime.now();

        @Enumerated(EnumType.STRING)
        private Status status;

        private String autor;
        private String curso;

        @Entity
        public class Tópico {

            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;

            @NotBlank
            private String título;

            @NotBlank
            private String mensaje;

            @Enumerated(EnumType.STRING)
            private Status status;

            @NotBlank
            private String autor;

            @NotBlank
            private String curso;

            // Otros campos, getters y setters...
        }


    }

    enum Status {
        ABIERTO, CERRADO, PENDIENTE
    }


}
