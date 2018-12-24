import java.util.List;

/*
숙제
디버그 실행 > 브레이크 포인트 잡고 해보기

 */
public class FriendMain {
    public static void main(String[] args) {
        FriendUI ui = new FriendUI();
        FriendManager fm = new FriendManager();

        while(true){
            int menu = ui.printMenuAndInputValue();
            if(menu == 1 ){
                Friend friend = ui.getFriend();
                fm.addFriend(friend);
            }else if(menu == 2){
                String name = ui.inputName();
                List<Friend> list = fm.schFriend(name);
                ui.printFriends(list);

            }else if(menu == 3){
                String phone = ui.inputPhone();
                int count = fm.delFriend(phone);
                ui.printDeteledFriendReport(count);

            }else if(menu == 4){
                System.out.println("다음에 봐요");
                break;
            }else{
                System.out.println("오우 뇨우");
            }
        }
    }
}
