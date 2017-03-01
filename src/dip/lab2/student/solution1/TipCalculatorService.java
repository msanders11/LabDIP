package dip.lab2.student.solution1;

/**
 *
 * @author msanders11
 */
public class TipCalculatorService {
    private TipCalculator tipCalculator;

    public TipCalculatorService(TipCalculator tipCalculator) {
        setTipCalculator(tipCalculator);
    }
    
    public double getTip(){
        return tipCalculator.getTip();
    }

    public final TipCalculator getTipCalculator() {
        return tipCalculator;
    }

    public final void setTipCalculator(TipCalculator tipCalculator) {
        if(tipCalculator == null){
            throw new IllegalArgumentException("tip calculator");
        } 
        this.tipCalculator = tipCalculator;
    }
    
    
}
