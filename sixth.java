public class sixth {
        static public void main(String args[]){
            int a=43;
            int count=0;
            for(int i=1;i<=a;i++){

                if(a%i==0){
                    count++;
                    
                }
                
            }
            if(count==2){
                System.out.println("It is a prime ");
            }
            else{
                System.out.println("It is not prime");
            }
        }
    
}
