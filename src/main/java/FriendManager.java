import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FriendManager {
    //메모리에 친구를 관리하고 싶다.
    //메모리에 친구들 정보가 있다.
    //~~들이라고 하면 보통 Collections를 쓴다.

    private List<Friend> friendList;

    public FriendManager(){
        friendList = new ArrayList<>();
    }

    public void addFriend(Friend fr){
        friendList.add(fr);
    }

    public List<Friend> schFriend(String name){
        List<Friend> friends = new ArrayList<>();
        for(Friend friend : friendList){
            if(friend.getName().contains(name)){
                friends.add(friend);
            }
        }
        return friends;

    }

    public int delFriend(String phone){
        int deleteCount = 0;
        Iterator<Friend> iterator = friendList.iterator();
        while(iterator.hasNext()){
            Friend friend = iterator.next();
            if(friend.getPhone().equals(phone)){
                iterator.remove();
                deleteCount++;
            }
        }
//        int size = friendList.size();
//        for(int i = 0; i < friendList.size(); i++){
//            Friend friend = friendList.get(i);
//            if(friend.getPhone().equals(phone)){
//                deleteCount++;
//                friendList.remove(i);
//                delFriend(phone);
//            }
//        }
//        for(Friend friend : friendList){
//            if(friend.getPhone().equals(phone)){
//                friendList.remove(friend);
//                break;
//            }
//        }
        return deleteCount;
    }

    public int numFriends(){
        int num = 0;
        for(Friend friend : friendList){
            ++num;
        }
        return num;
    }

    @Override
    public String toString() {
        return "FriendManager{" +
                "friendList=" + friendList +
                '}';
    }
    //친구추가
    //이름에 해당하는 친구정보들을 반환
    //전화번호에 해당하는 친구를 삭제
    //친구의 수를 반환


}
