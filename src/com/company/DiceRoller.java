package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class DiceRoller
{
    private int numDice = 0;
    private int numSides = 0;
    private int targetSum = 0;

    public DiceRoller()
    {
        numDice = 0;
        numSides = 0;
        targetSum = 0;
    }

    public int getNumDice()
    {
        return numDice;
    }

    public void setNumDice(int numDice)
    {
        this.numDice = numDice;
    }

    public int getNumSides()
    {
        return numSides;
    }

    public void setNumSides(int numSides)
    {
        this.numSides = numSides;
    }

    public int getTargetSum()
    {
        return targetSum;
    }

    public void setTargetSum(int targetSum)
    {
        this.targetSum = targetSum;
    }

    public int calculateNumRolls()
    {
        int sumRolls = 0;
        int rollNumber = 0;

        while(sumRolls != targetSum)
        {
            sumRolls = ThreadLocalRandom.current().nextInt(numDice, ((numDice*numSides) + 1));
            rollNumber++;
        }
        return rollNumber;
    }
}
