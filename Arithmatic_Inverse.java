package Modulo_Arithmatic;

public class Arithmatic_Inverse {
	public static void main(String[] args) {
		System.out.println(modInverse(2,3));
	}
	public static int gcd(int a,int m){
	     /*   if(m==0)
	        return a;
	        else
	        return gcd(m,a%m);*/
	        return (m==0)?a:gcd(m,a%m);
	    }
	    public static int modInverse(int a, int m){
	        if(gcd(a,m)!=1)
	        return -1;
	        else{
	            for(int i=1; i<m;i++){
	                if(((a%m)*(i%m))%m==1)
	                return i;
	            }
	        }
	        return -1;
	    }
}
