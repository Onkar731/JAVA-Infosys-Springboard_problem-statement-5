public class Complex {
    private float realPart;
    private float imaginaryPart;

    
    public Complex(float realPart, float imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public String sum(Complex c) {
        Complex temp = new Complex(0.0f, 0.0f);

        temp.realPart = realPart + c.realPart;
        temp.imaginaryPart = imaginaryPart + c.imaginaryPart;

        return temp.toString();
    }

    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}