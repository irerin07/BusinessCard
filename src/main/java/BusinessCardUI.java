import dto.BusinessCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusinessCardUI {

    public int printMenuAndInputValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 명함등록\t2. 명함삭제\t3. 명함검색\t 4.명함수정\t 5.명함저장\t 6.명함불러오기 \t 7.프로그램종료 " );
        int value = scanner.nextInt();
        return value;
    }

    public BusinessCard getCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요.");
        String name = scanner.nextLine();
        System.out.println("연락처를 입력하세요.");
        String phone = scanner.nextLine();
        System.out.println("회사명을 입력하세요.");
        String compName = scanner.nextLine();
        BusinessCard card = new BusinessCard(name, phone, compName);
        return card;
    }

    public int getId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("아이디를 입력하세요");
        Integer id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public String getFileName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("파일이름을 확장자까지 입력하세요.");
        String fileName = scanner.nextLine();
        return fileName;
    }

    public String getSchType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("검색/수정 기준을 입력 해 주세요. (이름, 연락처, 회사명)");
        String fileName = scanner.nextLine();
        return fileName;
    }

    public String getSchVal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("검색/수정 값을 입력 해주세요.");
        String fileName = scanner.nextLine();
        return fileName;
    }

    public void printFriends(List<BusinessCard> cards){
        for(BusinessCard card : cards){
            System.out.println(card.getName() + "   " + card.getPhone() + "   " + card.getCorporationName());
        }
    }
}
