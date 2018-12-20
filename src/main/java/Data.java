public class Data {
    private int value;

    public Data (int value){

    }

    public int getValue() {
        return value;
    }

    //Data d1 = new Data(100);
    //Data d2 = new Data(d1);
    //System.out.println(d2.getValue());
    //자기 자신을 받아들이는 생성자가 있다.
    //데이터가 데이터를 받아들인다.
    //기존의 데이터값을 나에게 복사(카피)하겠다...?
    //카피 생성자
    public Data(Data d){
        this.value = d.getValue();
    }

    //String에서 subString이 새로운 인스턴스를 리턴 해 주는것 과 같은 메소드.
    public Data cloneData(){
        Data data = new Data(this.value); //새로운 데이터 인스턴스를 생성해서 리턴 해준다.
        return data;
    }
}
