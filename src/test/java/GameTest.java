import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class GameTest {


    @Test
    public void gameOne(){
        for (int i = 1; i < 101; i++) {
            boolean numThreeCondition = GameRule.numSelfOrMultiple(3, i);
            boolean numFiveCondition = GameRule.numSelfOrMultiple(5, i);

            boolean threeFiveCondition = numThreeCondition && numFiveCondition;

            if (threeFiveCondition) {
                System.out.println(GameOutputFlag.THREE_FIVE.getFlag());
            } else if (numThreeCondition) {
                System.out.println(GameOutputFlag.THREE.getFlag());
            } else if (numFiveCondition) {
                System.out.println(GameOutputFlag.FIVE.getFlag());
            } else {
                System.out.println(i);
            }

        }
    }

    @Test
    public void gameTwo(){
        for (int i = 1; i < 101; i++) {
            boolean numThreeCondition = GameRule.numSelfOrMultiple(3, i);
            boolean hasThree = GameRule.includeSingleNum(3, i);

            boolean numFiveCondition = GameRule.numSelfOrMultiple(5, i);
            boolean hasFive = GameRule.includeSingleNum(5, i);

            boolean threeFiveCondition = numThreeCondition && numFiveCondition;
            boolean hasThreeFive = hasThree && hasFive;

            if (threeFiveCondition || hasThreeFive) {
                System.out.println(GameOutputFlag.THREE_FIVE.getFlag());
            } else if (numThreeCondition || hasThree) {
                System.out.println(GameOutputFlag.THREE.getFlag());
            } else if (numFiveCondition || hasFive) {
                System.out.println(GameOutputFlag.FIVE.getFlag());
            } else {
                System.out.println(i);
            }

        }

    }


}
