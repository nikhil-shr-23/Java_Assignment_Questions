class oneton{


    public static void print(int n){
        if(n==0){
            return;
            //base case 
        }
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) 
    {
        print(6);

    }

}
