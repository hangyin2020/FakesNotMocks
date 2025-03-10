public class NYSE implements Exchange {

    private String accessKey;

    public NYSE(String accessKey) {
        this.accessKey = accessKey;
    }

    @Override
    public float rate(String origin, String target) {
        // Implement the logic to get the exchange rate between origin and target
        System.out.println("Accessing exchange rate with key: " + accessKey);
        return 1.0f;
    }

}