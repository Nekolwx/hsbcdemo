public class GameRule {

    public static boolean numSelfOrMultiple(int num,int testNum){
        return 0 == testNum%num;
    }

    public static boolean includeSingleNum(int num,int testNUm){
        String numStr = String.valueOf(num);
        String testNumStr = String.valueOf(testNUm);
        return testNumStr.indexOf(numStr) >= 0;

    }

    public static void main(String[] args) {
        System.out.println(includeSingleNum(1, 35));;
    }
}
