public class DataVault {
    int MatrixA[][], colunaA, linhaA;
    int MatrixB[][], colunaB, linhaB;

    public void setColunaA(int colunaA) {
        this.colunaA = colunaA;
    }
    public void setLinhaA(int linhaA) {
        this.linhaA = linhaA;
    }
    public void setMatrixA(int[][] matrixA) {
        MatrixA = matrixA;
    }
    public void setColunaB(int colunaB) {
        this.colunaB = colunaB;
    }
    public void setLinhaB(int linhaB) {
        this.linhaB = linhaB;
    }
    public void setMatrixB(int[][] matrixB) {
        MatrixB = matrixB;
    }
    public int getColunaA() {
        return colunaA;
    }
    public int getLinhaA() {
        return linhaA;
    }
    public int[][] getMatrixA() {
        return MatrixA;
    }
    public int getColunaB() {
        return colunaB;
    }
    public int getLinhaB() {
        return linhaB;
    }
    public int[][] getMatrixB() {
        return MatrixB;
    }
    
}   
