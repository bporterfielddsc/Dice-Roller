package com.company;

import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {
        DiceRoller dRoll = new DiceRoller();
        boolean success = true;
        int numDice = 0;
        int numSides = 0;
        int targetSum = 0;

        do
        {
            try
            {
                numDice = Integer.parseInt(JOptionPane.showInputDialog("please input the number of dice you want to roll"));
                numSides = Integer.parseInt(JOptionPane.showInputDialog("please input the number of sides per dice"));
               targetSum = Integer.parseInt(JOptionPane.showInputDialog("please input the target sum"));
                dRoll.setNumDice(numDice);
                dRoll.setNumSides(numSides);
                dRoll.setTargetSum(targetSum);
                if (dRoll.getNumDice() <= 0)
                {
                    success = false;
                    JOptionPane.showMessageDialog(null, "ERROR");
                }

                else if(numSides < 1)
                {
                    success = false;
                    JOptionPane.showMessageDialog(null, "ERROR");

                }


                else if ((dRoll.getTargetSum() < dRoll.getNumDice()) || dRoll.getTargetSum() > (dRoll.getNumDice() * dRoll.getNumSides()))
                {
                    success = false;
                    JOptionPane.showMessageDialog(null, "ERROR");
                }

                else
                {
                    success = true;
                    dRoll.setNumDice(numDice);
                    dRoll.setNumSides(numSides);
                    dRoll.setTargetSum(targetSum);
                }



            } catch (Exception e)
            {
                success = false;
                JOptionPane.showMessageDialog(null, "You entered an invalid number");

            }


        } while (!success);


        JOptionPane.showMessageDialog(null, "it took you " + dRoll.calculateNumRolls() + " rolls to achieve your target sum");
    }
}
