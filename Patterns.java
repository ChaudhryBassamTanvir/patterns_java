package patterns;

public class Patterns {
    public static void main(String[] args) {
      // *****   
      // *****   
      // *****   
      // *****
      
      for (int i = 0; i <4; i++) {
        for(int j=0;j<5;j++){
            System.out.print("*");
        }
                    System.out.println();

      }

System.out.println("Q2");

//*****
//*   *
//*   *
//*****  


//outer loop
for (int i = 1; i <= 4; i++) {
//inner loop
for(int j=1;j<=5;j++){

  if (i==1 || j==1 ||i==4 || j==5 ) {
    System.out.print("*");
  } else{
    System.out.print(" ");
  }
}

System.out.println();
}

//Q3
System.out.println("Q3");

// *
// **
// ***
// **** 
 for(int i = 1;i<=4;i++){
  for (int j = 1; j <=i; j++) {
    System.out.print("*");
    
  }
  System.out.println();


 }

System.out.println("Q4");
// **** 
// ***
// **
// *
for(int i = 1;i<=4;i++){
  for (int j = 4; j >=i; j--) {
    System.out.print("*");
    
  }
  System.out.println();


 }



    }

    
}
