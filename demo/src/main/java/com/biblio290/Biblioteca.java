package com.biblio290;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Libros> libros = new ArrayList<>();

    public void agregarLibro(Libros libro) {
        libros.add(libro);
    }

    public List<Libros> buscarPorTitulo(String titulo) {
        List<Libros> resultado = new ArrayList<>();
        for (Libros libro : libros) {
            if (libro.titulo.contains(titulo)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    public List<Libros> buscarPorAutor(String autor) {
        List<Libros> resultado = new ArrayList<>();
        for (Libros libro : libros) {
            if (libro.autor.contains(autor)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    public List<Libros> mostrarTodosLosLibros() {
        return libros;
    }
}

