public class Friend {
    private String name; //인스턴스를 생성할 때 선언 해 준뒤로는 변경이 불가능하다. Immutable 불변.
                        //모든 필드를 생성할 때만 값을 선언해주고 그 이후에는 변경이 불가능하도록 한다. -> 불변클래스 -> 대표적인 예) String class
    private String phone;

    public Friend(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

}
