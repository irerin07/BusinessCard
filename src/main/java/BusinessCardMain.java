import dao.BusinessCardDAO;
import dto.BusinessCard;

import java.util.List;

public class BusinessCardMain {
    public static void main(String[] args) {
        BusinessCardUI ui = new BusinessCardUI();
        BusinessCardDAO dao = new BusinessCardDAO();
        System.out.println("프로그램 사용 전 먼저 명함 파일을 불러와야합니다.");
        dao.load(ui.getFileName());
        while(true){
            int menu = ui.printMenuAndInputValue();
            if(menu == 1 ){
                BusinessCard card = ui.getCard();
                dao.addCard(card);
            }else if(menu == 2){
                int id = ui.getId();
                dao.deleteCard(id);
            }else if(menu == 3){
                String schType = ui.getSchType();
                String schVal = ui.getSchVal();
                ui.printFriends(dao.findCard(schType, schVal));
            }else if(menu == 4){
                int id = ui.getId();
                String schType = ui.getSchType();
                String schVal = ui.getSchVal();
                BusinessCard bc = dao.findCardId(id);
                ui.printFriends(dao.editCard(bc, schType, schVal));


            }else if(menu == 5){
                String fileName = ui.getFileName();
                dao.save(fileName);
            }else if(menu == 6){
                String fileName = ui.getFileName();
                dao.load(fileName);
            } else if(menu == 7){
                System.out.println("프로그램을 종료합니다.");
                System.out.println("마지막으로 사용한 명함들을 저장합니다.");
                String fileName = ui.getFileName();
                dao.save(fileName);
                break;

            }else {
                System.out.println("오우 뇨우");
            }
        }



    }
}
