package HerdManager;

import java.util.Random;

/**
 * This class uses your Gate class to fill the corral with snails. We have supplied you will the
 * code necessary to execute as an app. You must fill in the missing logic below.
 */
public
class FillTheCorral extends Gate {

    /**
     * Select a predictable seed for the RandomNumber generator.
     */
    public static final int sRANDOM_SEED=1234;

    /**
     * The maximum number of Gate objects.
     */
    private static final int sMAX_GATES=4;

    // TODO -- Fill your code in here

    public static
    void main ( String[] args ) {
        Random randomNumber=new Random(sRANDOM_SEED);
         FillTheCorral mFillTheCorral=new FillTheCorral();
         Gate[] corral=new Gate[sMAX_GATES];
        for ( int i=0; i<corral.length; i++ ) {
            corral[i]=new Gate();
        }
        do {
            // Randomly set the direction of each gate's swing in
            // the corral array.
            mFillTheCorral.setCorralGates(corral , randomNumber);
        } while (!mFillTheCorral.anyCorralAvailable(corral));

        // Corral all the snails.
        mFillTheCorral.corralSnails(corral , randomNumber);
    }


    public void setCorralGates(Gate[] gate,Random selectDirection) {
        System.out.println("Initial gate setup:");
        for(int i=0;i<gate.length;i++){
            gate[i].setSwing(selectDirection.nextInt(3)-1);
            System.out.println("Gate " + i + ": " + gate[i].toString() );
        }
    }

    public boolean anyCorralAvailable(Gate[] corral){
        for(int i=0;i<corral.length;i++){
            if(corral[i].getSwingDirection() == Gate.IN)
                return true;
        }
        return false;
    }

    public int corralSnails(Gate[] corral,Random rand){
        int pasture = 5;
        int attemptCount = 0;
        int randomNumber = 0;
        int randomGate = 0;
        do {
            randomGate = rand.nextInt(corral.length);
            randomNumber = rand.nextInt(pasture)+1;
            System.out.println(randomNumber + " are trying to move through corral " + randomGate);
            pasture-=corral[randomGate].thru(randomNumber);
            attemptCount++;
        } while(pasture > 0);
        System.out.println("It took "+attemptCount+" attempts to corral all of the snails.");
        return attemptCount;
    }
}