package dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import dto.BusinessCard;
import dto.BusinessCardData;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BusinessCardDAO implements DAO {
    private BusinessCardData businessCardData;

    public BusinessCardDAO() {
        businessCardData = new BusinessCardData();
    }

    @Override
    public boolean addCard(BusinessCard bc) {
        bc.setId(businessCardData.getMaxNum());
        boolean flag = businessCardData.add(bc);
        return flag;
    }

    @Override
    public int deleteCard(int id) {
        int deleteCount = businessCardData.delete(id);
        return deleteCount;
    }

    @Override
    public List<BusinessCard> findCard(String schType, String schVal) {
        List<BusinessCard> list = new ArrayList<>();
        if(schType.equals("이름")){
            return businessCardData.findCardName(schVal);
        }else if(schType.equals("연락처")){
            return businessCardData.findCardPhone(schVal);
        }else if(schType.equals("회사명")){
            return businessCardData.findCardCompName(schVal);
        }
        return list;
    }

    @Override
    public BusinessCard findCardId(int id){
        return businessCardData.findCardId(id);
    }

    @Override
    public void save(String fileName) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File(fileName);
            objectMapper.writeValue(file, businessCardData);
        } catch (Exception ex) {
            System.out.println("저장오류.");
        }
    }


    @Override
    public void load(String fileName) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            } else {
                businessCardData = objectMapper.readValue(file, BusinessCardData.class);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<BusinessCard> editCard(BusinessCard bc, String schType, String schVal) {
        return  businessCardData.editCards(bc, schType, schVal);
    }
}
