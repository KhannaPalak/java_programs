class Complex {
    private int real, imag;
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }
    public Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }
    public Complex multiply(Complex c) {
        int r = this.real * c.real - this.imag * c.imag;
        int i = this.real * c.imag + this.imag * c.real;
        return new Complex(r, i);
    }
    public void display() {
        System.out.println(real + " + " + imag + "i");
    }
}