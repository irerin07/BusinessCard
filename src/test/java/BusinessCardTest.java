import dao.BusinessCardDAO;
import dto.BusinessCard;
import org.junit.Before;
import org.junit.Test;

public class BusinessCardTest {
    private BusinessCardDAO bcDao;

    @Before
    public void init(){
        bcDao = new BusinessCardDAO();
        BusinessCard bc1 = new BusinessCard("김영수" ,"01037488850","삼성");
        BusinessCard bc2 = new BusinessCard("김철수" ,"01047488850","구글");
        BusinessCard bc3 = new BusinessCard("김한수" ,"01057488850","애플");
        BusinessCard bc4 = new BusinessCard("김연수" ,"01067488850","마소");
        BusinessCard bc5 = new BusinessCard("김문수" ,"01077488850","엘지");
    }

//    @Test
//    public void addCard(){
//        int size = bcDao.numCard();
//        bcDao.addCard(new BusinessCard("김해수", "01087488850", "한화"));
//        int size2 = bcDao.numCard();
//
//        if(size2-1 == size){
//            System.out.println("성공");
//        }else{
//            System.out.println("실패");
//        }
//    }

}
