/*Alexander Ilacqua - 3/16/2021
This class calculates the x,y for a 2 variable system of equations
 */
package ilacquasteam;

public class CramersRule2
{
    // declaration of data fields
    private double varX;
    private double varY;
    private double[] varMatrix = new double[4];
    private double[] solMatrix = new double[2];
    private int roundPlace;
    
    // CramersRule2 constructor with parameters
    public CramersRule2(double[] varMatrix, double[] solMatrix, int roundPlace)
    {
        this.varMatrix = varMatrix;
        this.solMatrix = solMatrix;
        this.roundPlace = roundPlace;
        // void methods used to calculate answers
        calculateVarX();
        calculateVarY();
    }
    
    // CramersRule2 constructor with no parameters
    public CramersRule2()
    {
        this.varMatrix = new double[4];
        this.solMatrix = new double[2];
        this.roundPlace = 1;
        // void methods used to calculate answers
        calculateVarX();
        calculateVarY();
    }
    
    // mutators and accessors allow for encapsulation of class
    public void setVarMatrix(double[] varMatrix)
    {
        this.varMatrix = varMatrix;
    }
    public double[] getVarMatrix()
    {
        return this.varMatrix;
    }
    public void setSolMatrix(double[] solMatrix)
    {
        this.solMatrix = solMatrix;
    }
    public double[] getSolMatrix()
    {
        return this.solMatrix;
    }
    public void setRoundPlace(int roundPlace)
    {
        this.roundPlace = roundPlace;
    }
    public int getRoundPlace()
    {
        return this.roundPlace;
    }
    public void setVarX(double varX)
    {
        this.varX = varX;
    }
    public double getVarX()
    {
        return this.varX;
    }
    public void setVarY(double varY)
    {
        this.varY = varY;
    }
    public double getVarY()
    {
        return this.varY;
    }
    
    // to string override allows us to print contents of constructed objects
    @Override
    public String toString()
    {
        String varMatrixValues = "";
        String solMatrixValues = "";
        for (int i=0; i<this.varMatrix.length; i++)
        {
            varMatrixValues = varMatrixValues + this.varMatrix[i] + ",";
        }
        for (int i=0; i<this.solMatrix.length; i++)
        {
            solMatrixValues = solMatrixValues + this.solMatrix[i] + ",";
        }
        String objValues = "varMatrix:" + varMatrixValues + " " + "solMatrix:" + 
                           solMatrixValues + " " + "roundPlace:" + this.roundPlace 
                           + ", x:" + this.varX + ", y:" + this.varY;
        return objValues;
    }
    // main method tests the CramersRule2 class
    public static void main(String[] args)
    {
        double varMatrix[] = {1,2,4,1};
        double solMatrix[] = {4,2};
        int roundPlace = 1000;
        CramersRule2 cramers2Obj = new CramersRule2(varMatrix, solMatrix, roundPlace);
        System.out.println(cramers2Obj);
    }
    //void method calculates X
    public void calculateVarX()
    {
        // declaration
        double[] xMatrix = new double[4];
        // copying varMatrix to xMatrix
        for (int i = 0; i < this.varMatrix.length; i++)
        {
            xMatrix[i] = this.varMatrix[i];
        }
        // changes values on left of matrix
        xMatrix[0] = this.solMatrix[0];
        xMatrix[2] = this.solMatrix[1];
        // ensures determinant D is not 0
        if (calculateDeterminant(this.varMatrix) == 0)
        {
            throw new ArithmeticException();
        }
        // divides determinant of Dx by D to find the x
        else
        {
            this.varX = myRound(calculateDeterminant(xMatrix) / calculateDeterminant(this.varMatrix));
        }
    }
    //void method calculates Y
    public void calculateVarY()
    {
        double[] yMatrix = new double[4];
        // copying varMatrix to yMatrix
        for (int i = 0; i < this.varMatrix.length; i++)
        {
            yMatrix[i] = this.varMatrix[i];
        }
        // changing right hand values of ymatrix to soln matrix
        yMatrix[1] = this.solMatrix[0];
        yMatrix[3] = this.solMatrix[1];
        // divides determinant of Dx by D to find y
        this.varY = myRound(calculateDeterminant(yMatrix) / calculateDeterminant(this.varMatrix));
    }
    
    // calculate determinant method calculates the determinant of an array
    public double calculateDeterminant(double[] matrix)
    {
        double determinant;
        determinant = (matrix[0] * matrix[3]) - (matrix[1] * matrix[2]);
        return determinant;
    }
    // rounds a number to a selected value given by user
    public double myRound(double number)
    {
        number = number * this.roundPlace;
        number = Math.round(number);
        number = number / this.roundPlace;
        return number;
    }
}