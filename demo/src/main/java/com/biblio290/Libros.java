package com.biblio290;

public class Libros {
        public String titulo;
        public String autor;
        public String ISBN;
        public int anoPublicacion;
        
        
        public Libros(String titulo, String autor, String iSBN, int anoPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            ISBN = iSBN;
            this.anoPublicacion = anoPublicacion;
        }
        
        //Constructor
        public String getTitulo() {
            return titulo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
        public String getAutor() {
            return autor;
        }
        public void setAutor(String autor) {
            this.autor = autor;
        }
        public String getISBN() {
            return ISBN;
        }
        public void setISBN(String iSBN) {
            ISBN = iSBN;
        }
        public int getAnoPublicacion() {
            return anoPublicacion;
        }
        public void setAnoPublicacion(int anoPublicacion) {
            this.anoPublicacion = anoPublicacion;
        }   
    }
