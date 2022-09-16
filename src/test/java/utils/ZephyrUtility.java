package utils;

public class ZephyrUtility {

    private String apiToken;

    ThreadLocal<String> testCycleKey = new ThreadLocal<>();

    public ZephyrUtility(){

    }

    public void setApiToken(String accessToken){
        this.apiToken = "Bearer" + accessToken;
    }

    public void setTestCycleKey(String cycleKey){
        testCycleKey.set(cycleKey);
    }

    public String getTestCycleKey(){
        return testCycleKey.get();
    }

    public void createTestCycle(String payload){

    }
}
