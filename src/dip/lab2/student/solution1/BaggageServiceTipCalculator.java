package dip.lab2.student.solution1;
/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    private double baseRate;
    private int bagCount;
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality serviceQuality;
    
    public BaggageServiceTipCalculator(double baseRate, ServiceQuality serviceQuality, int bagCount) {
        setBaseRate(baseRate);
        setServiceQuality(serviceQuality);
        setBagCount(bagCount);
    }
    
    @Override
    public final double getTip(){
        double tip = 0;
        switch(serviceQuality){
            case GOOD:
                tip = baseRate * bagCount * goodTip; 
                break;
            case FAIR:
                tip = baseRate * bagCount * fairTip;  
                break;
            case POOR:
                tip = baseRate * bagCount * poorTip;
                break;
        }
        return tip;
    }

    public final double getBaseRate() {
        return baseRate;
    }

    public final void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    @Override
    public final double getGoodTip() {
        return goodTip;
    }

    @Override
    public final void setGoodTip(double goodTip) {
        this.goodTip = goodTip;
    }

    @Override
    public final double getFairTip() {
        return fairTip;
    }

    @Override
    public final void setFairTip(double fairTip) {
        this.fairTip = fairTip;
    }

    @Override
    public final double getPoorTip() {
        return poorTip;
    }

    @Override
    public final void setPoorTip(double poorTip) {
        this.poorTip = poorTip;
    }

    @Override
    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    @Override
    public final void setServiceQuality(ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }
    
   
}
