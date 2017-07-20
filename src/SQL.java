/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro
 */
public class SQL {
    
    static String sql ="DROP TABLE IF EXISTS Universidades;\n" +
            "CREATE TABLE Universidades (\n" +
            "id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL,\n" +
            "nombre TEXT,\n" +
            "www TEXT);\n" +
            "\n" +
            "DROP TABLE IF EXISTS Asignaturas;\n" +
            "CREATE TABLE Asignaturas(\n" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE,\n" +
            "nombre TEXT NOT NULL ,\n" +
            "Programas_id INTEGER REFERENCES Programas(id));\n" +
            "\n" +
            "DROP TABLE IF EXISTS Calificaciones;\n" +
            "CREATE TABLE Calificaciones(\n" +
            "Estudiantes_id INTEGER NOT NULL,\n" +
            "Programas_id INTEGER NOT NULL,\n" +
            "corte1 FLOAT DEFAULT 0.0,\n" +
            "peso1  FLOAT DEFAULT 0.2,\n" +
            "corte2 FLOAT DEFAULT 0.0,\n" +
            "peso2 FLOAT DEFAULT  0.2,\n" +
            "corte3 FLOAT DEFAULT 0.0,\n" +
            "peso3 FLOAT DEFAULT 0.6,\n" +
            "PRIMARY KEY(Estudiantes_id, Programas_id),\n" +
            "FOREIGN KEY(Estudiantes_id) REFERENCES Estudiantes(id),\n" +
            "FOREIGN  KEY(Programas_id) REFERENCES Programas(id)\n" +
            ");\n" +
            "\n" +
            "DROP TABLE IF EXISTS Estudiantes;\n" +
            "CREATE TABLE Estudiantes (\n" +
            "id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE ,\n" +
            "nombre TEXT NOT NULL ,\n" +
            "apellido TEXT NOT NULL ,\n" +
            "email TEXT NOT NULL ,\n" +
            "telefono TEXT NOT NULL ,\n" +
            "Programas_id INTEGER REFERENCES Programas(id));\n" +
            "\n" +
            "DROP TABLE IF EXISTS Programas;\n" +
            "CREATE TABLE Programas (\n" +
            "id INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE ,\n" +
            "nombre TEXT NOT NULL , director TEXT NOT NULL ,\n" +
            "email TEXT,\n" +
            "Universidades_id INTEGER REFERENCES Universidades(id));\n" +
            "\n" +
            "\n";    
    
    public static void main(String []abc){
        System.out.println(sql);
    }
}
