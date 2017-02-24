package dip.lab2.student.solution1;
/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BartenderServiceTipCalculator implements TipCalculator {
    private double amountPerDrink;
    private int drinkCount;
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality serviceQuality;
    
    public BartenderServiceTipCalculator(double amountPerDrink,int drinkCount) {
        setAmountPerDrink(amountPerDrink);
        setDrinkCount(drinkCount);
    }
    
    @Override
    public final double getTip(){

        return amountPerDrink * drinkCount;
    }

    public final double getAmountPerDrink() {
        return amountPerDrink;
    }

    public final void setAmountPerDrink(double amountPerDrink) {
        this.amountPerDrink = amountPerDrink;
    }

    @Override
    public final double getGoodTip() {
        return 0;
    }

    @Override
    public final void setGoodTip(double goodTip) {
        
    }

    @Override
    public final double getFairTip() {
        return fairTip;
    }

    @Override
    public final void setFairTip(double fairTip) {
        
    }

    @Override
    public final double getPoorTip() {
        return 0;
    }

    @Override
    public final void setPoorTip(double poorTip) {
        
    }

    @Override
    public final ServiceQuality getServiceQuality() {
        return serviceQuality.GOOD;
    }

    @Override
    public final void setServiceQuality(ServiceQuality serviceQuality) {
        
    }

    public final int getDrinkCount() {
        return drinkCount;
    }

    public final void setDrinkCount(int drinkCount) {
        this.drinkCount = drinkCount;
    }
    
   
}
