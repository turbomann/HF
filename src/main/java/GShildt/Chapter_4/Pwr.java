package GShildt.Chapter_4;

public class Pwr
{
    double b,val;
    int e;

    Pwr(double base,int exp){

        b=base;
        e = exp;

        val =1;
        if (exp==0) return;
        for(;exp>0;exp--) val=val*base;
}
double get_pwr(){
        return val;
}
}

class DemoPrw{
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0,2);
        Pwr y = new Pwr(2.5,1);
        Pwr z = new Pwr(5.7,0);

        System.out.println(x.b +" in stepen "+ x.e + " equals " + x.get_pwr());
        System.out.println(y.b +" in stepen "+ y.e + " equals " + y.get_pwr());
        System.out.println(z.b +" in stepen "+ z.e + " equals " + z.get_pwr());
    }
}
