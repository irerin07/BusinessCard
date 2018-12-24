public class StringExam {
    public static void main(String[] args) {
        String str = new String("hello");
        String str2 = new String("hello");
        String str3 = "hello"; //상수풀에 들어간다. 같은 상수 문자열인 hello를 참조한다. (new가 쓰이면 다른 참조값.)
        String str4 = "hello";
        String substr = str.substring(2); //새로운 String 객체를 만들어서 리턴해준다. 자기자신은 변하지 않는다.

        System.out.println(substr);
        System.out.println(str);

        if(str.equals(str2)){
            System.out.println("str equals str2");
        }else{
            System.out.println();
        }
        if(str == str2){
            System.out.println("str == str2");
        }else{
            System.out.println("str != str2");
        }

        if(str.equals(str3)){
            System.out.println("str equals str3");
        }

        if(str == str3){
            System.out.println("str == str3");
        }

        if(str3 == str4){
            System.out.println("str3 == str4");
        }
    }
}
