//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //q1
        int fac=factor(4);
        System.out.println(fac);
        System.out.println(di(222220,2));
        System.out.println(shakes(4));
        System.out.println(power(3,4));
        System.out.println(reverse("doctor",6));
        System.out.println(pal("racecar",7));
    }
    //q1******************************************************************
    static int factor(int numb){
        if(numb==1)
            return 1;
        return numb*factor(numb-1);
    }
    //**************************************q3***************************
    static int di(int numb,int digit){
        if(numb<=0)
            return 0;
        int check=numb%10;
        int sum=0;
        if(check==digit)
            sum++;
        sum=sum+di(numb/10,digit);
        return sum;
    }
    //**********************************q4
    static int shakes(int numb){
        if(numb==1)
            return 0;
        int sum=numb-1;
        sum=sum+shakes(numb-1);
        return sum;
    }
    //****************************q5
static int power(int base,int pow){
        if(pow==1)
            return base;
        return base*power(base,pow-1);
}
//************************q7
    static String reverse(String s,int len){
        if(len<=1)
            return s ;
        return reverse(s.substring(1),--len)+s.charAt(0);


    }
    static int pal(String s,int len)
    {
        if(s.length()==len){
            return 1;
        }
        else if(s.charAt(0)!=s.charAt(len-1))
            return 0;
        else
            return pal(s.substring(1),--len);


    }


}
