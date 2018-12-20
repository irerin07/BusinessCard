import org.junit.Before;
import org.junit.Test;

public class FriendTestJunit {
    private FriendManager fm;

    @Before
    public void init(){
        fm = new FriendManager();
        Friend fr1 = new Friend("김철수", "01027488854");
        fm.addFriend(fr1);
        Friend fr2 = new Friend("김영수", "01037488853");
        fm.addFriend(fr2);
        Friend fr3 = new Friend("김민수", "01047488852");
        fm.addFriend(fr3);
        Friend fr4 = new Friend("김연수", "01057488851");
        fm.addFriend(fr4);
        Friend fr5 = new Friend("김한수", "01067488850");
        fm.addFriend(fr5);
        System.out.println("init");

    }

    @Test
    public void addTest() throws Exception{
        int size = fm.numFriends();
        System.out.println(size);
        fm.addFriend(new Friend("김용수", "01077488850"));
        int size2 = fm.numFriends();
        System.out.println(size2);
        if(size == (size2-1)){
            System.out.println("와! 성공!");
        }else{
            System.out.println("와! 실패!");
        }
        System.out.println("addTest");

    }
    @Test
    public void countTest() throws Exception{
        System.out.println(fm.numFriends());
        System.out.println("countTest");
    }
    @Test
    public void schTest() throws Exception{
        System.out.println(fm.schFriend("김영수"));
        System.out.println("schTest");
    }

    @Test
    public void delTest() throws Exception{
        int deleteCode = fm.delFriend("01027488854");
        if(deleteCode == 1) {
            System.out.println("성공");
        }else{
            System.out.println("실패");
        }
    }




}
