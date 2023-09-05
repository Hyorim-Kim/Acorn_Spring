package pack;

// 세번째로 MyInter 인터페이스를 만든다.
public interface MyInter { // 이 메서드는 서비스 처리용 인터페이스 (아마 spr6arrange에서 사용했던것 같음 참고하샘)
    String inputData(); // 이거는 입력된 정보를 String타입으로 반환하는거임. (이거 키보드 입력 할때 사용했었음 spr3 참고하샘)
    void showResult(); // 이거는 위에 inputData 메서드를 통해 정보를 입력받음
}

// 이제 인터페이스 만들었으니까 클래스만들러 MyImpl 로ㄱㄱ