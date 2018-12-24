package dao;

import dto.BusinessCard;

import java.util.List;

public interface DAO {
    public boolean addCard(BusinessCard bc);
    public int deleteCard(int id);
    public List<BusinessCard> findCard(String schType, String schVal);
    public BusinessCard findCardId(int id);
    public void save(String filename);
    public void load(String filename);
    public List<BusinessCard> editCard(BusinessCard bc, String schType, String schVal);

}
