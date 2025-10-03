package br.com.fiap.dao;

import br.com.fiap.to.RemedioTo;

import java.time.LocalDate;
import java.util.ArrayList;

public class RemedioDAO {
    public ArrayList<RemedioTo> findAll(){
        ArrayList<RemedioTo> remedios = new ArrayList<>();
        RemedioTo remedio = new RemedioTo(1L, "Loratadina", 7.93,
                LocalDate.parse("2023-10-10"), LocalDate.parse("2025-10-10"));
        remedios.add(remedio);
        remedio = new RemedioTo(2L, "Amoxicilina", 26.50, LocalDate.now(), LocalDate.now().plusYears(2));
        remedios.add(remedio);

        return remedios;
    }
}
