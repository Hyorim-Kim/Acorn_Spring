package anno1_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Component      // 단순하게 객체를 생성
//@Service("senderProcess")    // 가독성을 위해서 컴포넌트 대신 비지니스 로직으로서 사용하기위해
@Service
public class SenderProcess {
   //@Autowired      // type에 의한 매핑 : 클래스의 포함관계
   //private Sender sender;
    
   @Autowired
   @Qualifier("sender")
   //@Qualifier("sender2")
   private SenderInter inter;
    
   /*
   @Autowired      // method에 자동으로 Sender 타입의 객체를 매핑
   public void setSender(Sender sender) {
      this.sender = sender;
   }
   */
   /*
   public Sender getSender() {
      return sender;
   }
   public void displayData() {
      sender.show();
   }
   */
   
   public SenderInter getInter() {
      return inter;
   }
   public void displayData() {
      inter.show();
   }
}