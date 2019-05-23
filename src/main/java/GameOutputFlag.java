public enum GameOutputFlag {

    THREE("Fizz","3或3的倍数"),
    FIVE("Buzz","5或5的倍数"),
    THREE_FIVE("FizzBuzz","3和5的倍数");


    private String flag;
    private String desc;

    private GameOutputFlag(String flag, String desc) {
        this.flag = flag;
        this.desc = desc;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
