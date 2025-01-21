package com.gabrielabo.forohub.dto;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopicos(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String autor,
        @NotBlank
        String curso
) {
}
