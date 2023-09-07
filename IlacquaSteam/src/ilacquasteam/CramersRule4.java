/*Alexander Ilacqua - 3/16/2021
This class calculates the x,y,z,w for a 4 variable system of equations
 */
package ilacquasteam;

public class CramersRule4
{
    // declaration of datafields
    private double varX;
    private double varY;
    private double varZ;
    private double varW;
    private double[] varMatrix = new double[16];
    private double[] solMatrix = new double[4];
    private int roundPlace;
    
    // constructors with parameters allow us to receive user input
    public CramersRule4(double[] varMatrix, double []solMatrix, int roundPlace)
    {
        this.varMatrix = varMatrix;
        this.solMatrix = solMatrix;
        this.roundPlace = roundPlace;
        // void method calculates x,y,z
        calculateVarX();
        calculateVarY();
        calculateVarZ();
        calculateVarW();
    }
    // constructor with no parameters allow us to create objects later
    public CramersRule4()
    {
        this.varMatrix = new double[16];
        this.solMatrix = new double[4];
        this.roundPlace = 1;
        // void method calculates x,y,z
        calculateVarX();
        calculateVarY();
        calculateVarZ();
        calculateVarW();
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
    public void setVarW(double varW)
    {
        this.varW = varW;
    }
    public double getVarW()
    {
        return this.varW;
    }
    // toString allows us to print the contents of an object
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
                           solMatrixValues + " " + "roundPlace:" + this.roundPlace + 
                           ", x:" + this.varX + ", y:" + this.varY + ", z:" + 
                           this.varZ + ", w:" + this.varW;
        return objValues;
    }
    // main method allow us to test the class
    public static void main(String[] args)
    {
        double varMatrix[] = {1,7,1,-1,3,5,4,4,6,4,3,4,2,4,1,5};
        double solMatrix[] = {5,16,22,15};
        int roundPlace = 1000;
        CramersRule4 cramersObj = new CramersRule4(varMatrix, solMatrix, roundPlace);
        System.out.println(cramersObj);
    }
    // void method calculates X
    public void calculateVarX()
    {
        double[] xMatrix = new double[16];
        // copies contents of varMatrix to  the xMatrix
        for (int i = 0; i < this.varMatrix.length; i++)
        {
            xMatrix[i] = this.varMatrix[i];
        }
        // assigns leftmost column of xMatrix solution values
        xMatrix[0] = this.solMatrix[0];
        xMatrix[4] = this.solMatrix[1];
        xMatrix[8] = this.solMatrix[2];
        xMatrix[12] = this.solMatrix[3];
        // ensures the determinant D is not 0 and throws an error if so
        if (calculateDeterminant(this.varMatrix) == 0)
        {
            throw new ArithmeticException();
        }
        // assigns the calculated X value to the datafield x
        else
        {
            this.varX = myRound(calculateDeterminant(xMatrix) / calculateDeterminant(this.varMatrix));
        }
    }
    // void method to calculate Y
    public void calculateVarY()
    {
        double[] yMatrix = new double[16];
        // copies contents of varMatrix to  the yMatrix
        for (int i = 0; i < this.varMatrix.length; i++)
        {
            yMatrix[i] = this.varMatrix[i];
        }
        // assigns middle left column of yMatrix solution values
        yMatrix[1] = this.solMatrix[0];
        yMatrix[5] = this.solMatrix[1];
        yMatrix[9] = this.solMatrix[2];
        yMatrix[13] = this.solMatrix[3];
        // assigns the calculated y value to the datafield y
        this.varY = myRound(calculateDeterminant(yMatrix)/ calculateDeterminant(this.varMatrix));
    }
    // void method to calculate Z
    public void calculateVarZ()
    {
        double[] zMatrix = new double[16];
        // copies contents of varMatriz to the zMatrix
        for (int i = 0; i < this.varMatrix.length; i++)
        {
            zMatrix[i] = this.varMatrix[i];
        }
        // assigns the middle right column of zMatrix the solution values
        zMatrix[2] = this.solMatrix[0];
        zMatrix[6] = this.solMatrix[1];
        zMatrix[10] = this.solMatrix[2];
        zMatrix[14] = this.solMatrix[3];
        // assigns the calculated Z value to the datafield z
        this.varZ =  myRound(calculateDeterminant(zMatrix)/ calculateDeterminant(this.varMatrix));
    }
    // void method to calculate W
    public void calculateVarW()
    {
        double[] wMatrix = new double[16];
        // copies the contents of varMatrix to the wMatrix
        for (int i = 0; i < this.varMatrix.length; i++)
        {
            wMatrix[i] = this.varMatrix[i];
        }
        // assigns the rightmost column of wMatrix the solution values
        wMatrix[3] = this.solMatrix[0];
        wMatrix[7] = this.solMatrix[1];
        wMatrix[11] = this.solMatrix[2];
        wMatrix[15] = this.solMatrix[3];
        // assigns the calculated Z value to the datafield z
        this.varW =  myRound(calculateDeterminant(wMatrix)/ calculateDeterminant(this.varMatrix));
    }
    // method calculates the determinant of a matrix using formula and submatrices
    public double calculateDeterminant(double[] matrix)
    {
        double determinant;
        determinant = ( (matrix[0]*
                        ((matrix[5]*((matrix[10]*matrix[15])-(matrix[11]*matrix[14]))) 
                      - (matrix[6]*((matrix[9]*matrix[15])-(matrix[11]*matrix[13])))
                      + (matrix[7]*((matrix[9]*matrix[14])-(matrix[10]*matrix[13])))))
                      
                      - (matrix[1]*
                        ((matrix[4]*((matrix[10]*matrix[15])-(matrix[11]*matrix[14]))) 
                      - (matrix[6]*((matrix[8]*matrix[15])-(matrix[11]*matrix[12])))
                      + (matrix[7]*((matrix[8]*matrix[14])-(matrix[10]*matrix[12])))))
            
                      + (matrix[2]*
                        ((matrix[4]*((matrix[9]*matrix[15])-(matrix[11]*matrix[13]))) 
                      - (matrix[5]*((matrix[8]*matrix[15])-(matrix[11]*matrix[12])))
                      + (matrix[7]*((matrix[8]*matrix[13])-(matrix[9]*matrix[12])))))
            
                      - (matrix[3]*
                        ((matrix[4]*((matrix[9]*matrix[14])-(matrix[10]*matrix[13]))) 
                      - (matrix[5]*((matrix[8]*matrix[14])-(matrix[10]*matrix[12])))
                      + (matrix[6]*((matrix[8]*matrix[13])-(matrix[9]*matrix[12])))))
                      );
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