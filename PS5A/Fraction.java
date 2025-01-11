public class Fraction{
        private int numerator;
        private int denominator;
        public Fraction(){
            numerator = 0;
            denominator = 1;
        }
        public Fraction(int numerator, int denominator){
            if(denominator == 0){
                System.out.println("Denominator cannot be zero");
            }else{
                this.numerator = numerator;
                this.denominator = denominator;
            }
        }
        public Fraction(String fraction){
            int slashIndex = fraction.indexOf("/");
            if(slashIndex == -1) {
                System.out.println("Wrong fraction format");
            }else{
                this.numerator = Integer.parseInt(fraction.substring(0,slashIndex));
                this.denominator = Integer.parseInt(fraction.substring(slashIndex));
            }
        }
        public Fraction(Fraction copy){
            this.numerator = copy.numerator;
            this.denominator = copy.denominator;
        }
        public int getNum(){
            return numerator;
        }
        public int getDenom(){
            return denominator;
        }
        public String toString(){
            return numerator + "/" + denominator;
        }
        public double toDouble(){
            return (double) numerator/denominator;
        }
        public void reduce(){
            int cf = gcf(numerator,denominator);
            numerator /= cf;
            denominator /= cf;
        }
        public void setNum(int numerator){
            this.numerator = numerator;
        }
        public void setDenom( int denominator){
            if(denominator == 0){
                System.out.println("Denominator cannot be zero");
            }
            this.denominator = denominator;
        }
        public static Fraction multiply(Fraction a, Fraction b){
            int newNum = a.numerator*b.numerator;
            int newDenom = a.denominator*b.denominator;
            Fraction f = new Fraction(newNum, newDenom);
            f.reduce();
            return f;
        }
        public static Fraction divide(Fraction a, Fraction b){
            if(b.numerator == 0){
                System.out.println("Cannot divide by zero");
            }
            int newNum = a.numerator*b.denominator;
            int newDenom = a.denominator*b.numerator;
            Fraction f = new Fraction(newNum, newDenom);
            f.reduce();
            return f;
        }
        public static Fraction add(Fraction a, Fraction b){
            int newNum= a.numerator*b.denominator + b.numerator*a.denominator;
            int newDenom= a.denominator*b.denominator;
            Fraction f = new Fraction(newNum, newDenom);
            f.reduce();
            return f;
        }
        public static Fraction subtract(Fraction a, Fraction b){
            int newNum = a.numerator*b.denominator - b.numerator*a.denominator;
            int newDenom = a.denominator*b.denominator;
            Fraction f = new Fraction(newNum, newDenom);
            f.reduce();
            return f;
        }
        private int gcf(int a, int b){
            int cf = Math.min(a, b);
            while(a%cf !=0 || b%cf !=0){
                cf--;
            }
            return cf;
        }
    }
