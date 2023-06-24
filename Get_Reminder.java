package Modulo_Arithmatic;

public class Get_Reminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int getRem(int x, int n, int m){
	    if(n==0)
	    return 1%m;
	    if(n%2==0){
	        int y=getRem(x,n/2,m);
	        return (y*y)%m;
	    }
	    return ((x%m)*getRem(x,n-1,m))%m;
	}
	public static int getRem(int a ,int n , int m){
	    int result = 1;
	    while(n!=0){
	        result = (result % m * a %m)%m;
	        --n;
	    }
	    return result;
	}
}
