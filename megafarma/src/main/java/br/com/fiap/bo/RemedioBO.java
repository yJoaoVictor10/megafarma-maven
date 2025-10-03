package br.com.fiap.bo;

import br.com.fiap.dao.RemedioDAO;
import br.com.fiap.to.RemedioTo;

import java.util.ArrayList;

public class RemedioBO {

    private RemedioDAO remedioDAO;

    public ArrayList<RemedioTo> findAll(){
        remedioDAO = new RemedioDAO();
        //Aqui se implementa as regras de negócio
        return remedioDAO.findAll();
    }
}
