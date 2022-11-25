import javax.print.attribute.standard.RequestingUserName;
import java.util.Random;

public class uc1 {
    Random random = new Random();

    void start(){
        int stakeOfDay = 100;
        int betEveryGame = 1;

        int bet = random.nextInt(2);
        if(bet == 1){
            System.out.println("winn $1 ");
        }else{
            System.out.println("loose $1");
        }
    }
}
