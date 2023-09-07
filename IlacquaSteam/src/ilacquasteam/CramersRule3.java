/*Alexander Ilacqua - 3/16/2021
This class calculates the x,y,z solution of a 3 variable systems of equations
 */
package ilacquasteam;

public class CramersRule3
{
    // declaring data fields
    private double varX;
    private double varY;
    private double varZ;
    private double[] varMatrix = new double[9];
    private double[] solMatrix = new double[3];
    private int roundPlace;
    
    // constructor with parameters to receive input from Input3
    public CramersRule3(double[] varMatrix, double []solMatrix, int roundPlace)
    {
        this.varMatrix = varMatrix;
        this.solMatrix = solMatrix;
        this.roundPlace = roundPlace;
        // void method calculates x,y,z
        calculateVarX();
        calculateVarY();
        calculateVarZ();
    }
    // constructor with no parameters allows us to create objects later
    public CramersRule3()
    {
        this.varMatrix = new double[9];
        this.solMatrix = new double[3];
        this.roundPlace = 1;
        // void method calculates x,y,z
        calculateVarX();
        calculateVarY();
        calculateVarZ();
    }
    // mutators and accessors allow for data encapsulation
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
    public void setVarZ(double varZ)
    {
        this.varZ = varZ;
    }
    public double getVarZ()
    {
        return this.varZ;
    }
    // toString override prints the contents of the object requested
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
        String objValues = "varMatrix:" + varMatrixValues + " " + "solMatrix:" 
                           + solMatrixValues + " " + "roundPlace:" + this.roundPlace 
                           + ", x:" + this.varX + ", y:" + this.varY + ", z:" + 
                           this.varZ;
        return objValues;
    }
    // main method allows us to test the class
    public static void main(String[] args)
    {
        double varMatrix[] = {-2,5,-3,1,4,-5,6,2,1};
        double solMatrix[] = {4,2,5};
        int roundPlace = 1000;
        CramersRule3 cramers3Obj = new CramersRule3(varMatrix, solMatrix, roundPlace);
        System.out.println(cramers3Obj);
    }
    // void method calculates X
    public void calculateVarX()
    {
        double[] xMatrix = new double[9];
        // copies the received varMatrix to xMatrix
        for (int i = 0; i < this.varMatrix.length; i++)
        {
            xMatrix[i] = this.varMatrix[i];
        }
        // changes the leftmost column to the sol matrix values
        xMatrix[0] = this.solMatrix[0];
        xMatrix[3] = this.solMatrix[1];
        xMatrix[6] = this.solMatrix[2];
        // ensures determinant D is not 0 and if so throws an exception
        if (calculateDeterminant(this.varMatrix) == 0)
        {
            throw new ArithmeticException();
        }
        else
        {
            // assings the calculated x value to the datafield x
            this.varX = myRound(calculateDeterminant(xMatrix) / calculateDeterminant(this.varMatrix));
        }
    }
    // void method calculates Y
    public void calculateVarY()
    {
        double[] yMatrix = new double[9];
        // copies the received varMatrix to yMatrix
        for (int i = 0; i < this.varMatrix.length; i++)
        {
            yMatrix[i] = this.varMatrix[i];
        }
        // changes the middle column to the sol matrix values
        yMatrix[1] = this.solMatrix[0];
        yMatrix[4] = this.solMatrix[1];
        yMatrix[7] = this.solMatrix[2];
        //assigns the calculated y to the datafield y
        this.varY =  myRound(calculateDeterminant(yMatrix)/ calculateDeterminant(this.varMatrix));
    }
    // void method calculates Z
    public void calculateVarZ()
    {
        double[] zMatrix = new double[9];
        // copies the received varMatrix to zMatrix
        for (int i = 0; i < this.varMatrix.length; i++)
        {
            zMatrix[i] = this.varMatrix[i];
        }
        // changes the right column to the sol matrix values
        zMatrix[2] = this.solMatrix[0];
        zMatrix[5] = this.solMatrix[1];
        zMatrix[8] = this.solMatrix[2];
        //assigns the calculated z to the datafield z
        this.varZ =  myRound(calculateDeterminant(zMatrix)/ calculateDeterminant(this.varMatrix));
    }
    // method calculates the determinant of a matrix using formula and submatrices
    public double calculateDeterminant(double[] matrix)
    {
        double determinant;
        determinant = ( (matrix[0]*((matrix[4]*matrix[8])-(matrix[5]*matrix[7]))) 
                      - (matrix[1]*((matrix[3]*matrix[8])-(matrix[5]*matrix[6])))
                      + (matrix[2]*((matrix[3]*matrix[7])-(matrix[4]*matrix[6]))));
        return determinant;
    }
    
    // myRound rounds a user input to their specified desired value
    public double myRound(double number)
    {
        number = number * this.roundPlace;
        number = Math.round(number);
        number = number / this.roundPlace;
        return number;
    }
}