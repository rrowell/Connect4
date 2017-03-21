import java.util.Scanner;

public static void wantAI(){
Scanner sc = newScanner(System.in);
System.out.println("Enter 1 for 1 player and 2 for 2 player");
int numPlayers = sc.nextInt();
if(numPlayers == 1){
    AI = false;
}
else{
    if(numPlayers == 2) {
        AI = true;
    }
    else{
        System.out.println("Please enter a valid number");
        wantAI();
        
    }

    
}
}
