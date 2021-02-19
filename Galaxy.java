
public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String ringer = getRingTone();
    	String ringing = ringer + ", " + ringer + ", " + ringer;
        return ringing;
    }
    @Override
    public String unlock() {
        return "cltf";
    }
    @Override
    public void displayInfo() {
        System.out.println("Model: "+getVersionNumber() +", Carrier: "+ getCarrier() + ", Batter: "+ getBatteryPercentage()+"%");    
    }
}
