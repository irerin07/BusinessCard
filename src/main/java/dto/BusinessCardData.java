package dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BusinessCardData {
    private int maxNum;
    private List<BusinessCard> businessCardList;

    public BusinessCardData(){
        this.maxNum = 1;
        businessCardList = new ArrayList<>();
    }
    public int getMaxNum() {
        return maxNum++;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public List<BusinessCard> getBusinessCardList() {
        return businessCardList;
    }

    public void setBusinessCardList(List<BusinessCard> businessCardList) {
        this.businessCardList = businessCardList;
    }

    @Override
    public String toString() {
        return "BusinessCardData{" +
                "maxNum=" + maxNum +
                ", businessCardList=" + businessCardList +
                '}';
    }

    public boolean add(BusinessCard bc) {
        boolean flag = businessCardList.add(bc);
        return flag;
    }

    public int delete(int id) {
        int deleteCount = 0;
        Iterator<BusinessCard> iterator = businessCardList.iterator();
        while(iterator.hasNext()){
            BusinessCard card = iterator.next();
            if(card.getPhone().equals(id)){
                iterator.remove();
                deleteCount++;
            }
        }
        return deleteCount;
    }

    private List<BusinessCard> getBusinessCards(String name) {
        List<BusinessCard> list = new ArrayList<>();
        for(BusinessCard card : businessCardList){
            if(card.getName().contains(name)){
                list.add(card);
            }
        }
        return list;
    }
    private BusinessCard getBusinessCards(int id) {
        BusinessCard bc = new BusinessCard();
        for(BusinessCard card : businessCardList){
            if(card.getId() == id){
                bc = card;
            }
        }
        return bc;
    }

    public List<BusinessCard> findCardPhone(String phone) {
        return getBusinessCards(phone);
    }
    public List<BusinessCard> findCardName(String name) {
        return getBusinessCards(name);
    }
    public List<BusinessCard> findCardCompName(String compName) {
        return getBusinessCards(compName);
    }
    public BusinessCard findCardId(int id){
        return getBusinessCards(id);
    }

    public List<BusinessCard> editCards(BusinessCard bc, String schType, String schVal) {
        List<BusinessCard> list = new ArrayList<>();
        if(schType.equals("이름")){
            bc.setName(schVal);
            list.add(bc);
        }else if(schType.equals("연락처")){
            bc.setPhone(schVal);
            list.add(bc);
        }else if(schType.equals("회사명")){
            bc.setCorporationName(schVal);
            list.add(bc);
        }
        return list;
    }
}
