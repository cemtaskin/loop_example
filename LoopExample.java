public class LoopExample {
    
    public static void main(String[] args) {
        int i=0;
        while (true){
            int randomNumber = (int)(Math.random()*101);
            System.out.println(randomNumber);

            i++;

            if (randomNumber==100){
                System.out.println("We find 100 in " + i  + " times ");
                break;
            }
            
        }

        String[] cars =  {"Volvo","BMW","Mercedes","Fiat","Toyoya","Lexus","Audi"};
        for(String car : cars){
            System.out.println(car);
        }

        int lessThenFifty =0;
        int biggerThenFifty=0;
        int fiftyCount=0;
        for (int j=0;j<100;j++){
            int randomNumber = (int)(Math.random()*101);
            System.out.println(randomNumber);
            if (randomNumber>50){
                biggerThenFifty++;
            }else if (randomNumber<50){
                lessThenFifty++;
            }else{
                fiftyCount++;
            }
        }

        System.out.println("Random numbers bigger then 50 :" + biggerThenFifty);
        System.out.println("Random numbers lower then 50 :" + lessThenFifty);
        System.out.println("Random numbers equals  50 :" + fiftyCount);
        

    }
}
