public class ComputeMethods {
    public double fToC(double degreesF) {
        double degreesC = (5.0/9.0) * (degreesF-32);
        return degreesC;
    }
    public double hypotenuse(int a, int b) {
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return hypotenuse;
    }
    public int rolar() {
        int dado1 = (int) (Math.random()*6)+1;
        int dado2 = (int) (Math.random()*6)+1;
        int soma = dado1+dado2;
        return soma;
    }
}