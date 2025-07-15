// repeated letter
    class oneclass{
        
        void oneclass(String name){
            boolean flag ;
            int count =0;
            int value =0;
            System.out.println("The repeated letter is: ");
            for(int i = 0;i < name.length();i++){
                char ch = name.charAt(i);
                for (int j = i+1 ; j<name.length()-1;j++) {
                    char ch2 = name.charAt(j);
                    if (ch == ch2) {
                        count++;
                        System.out.print(ch + " ");
                        flag = true;
                        
                    }
                    // else if(!(ch == ch2)){
                    //     value++;
                    //     System.out.print(ch);
                        
                    // }
                    
                }
        }
        if (true) {
        System.out.print("The repeated count is: " + count);
        }
        

        // else if(false){
        //     System.out.println("The Non-repeated ");
        // }
        }



// non repeated
        // void classtwo(String name){
        //     boolean flag ;
            
        //     int value =0;
        //     System.out.println("The non-repeated letter is: ");
        //     for(int i = 0;i < name.length();i++){
        //         char ch = name.charAt(i);
        //         int count =0;
        //         for (int j = i+1 ; j<name.length()-1;j++) {
        //             char ch2 = name.charAt(j);
        //             if ((ch2 == ch)) {
        //                 count++;
        //                 System.out.print(ch + " ");
        //                 flag = true;
                        
        //             }
        //             // else if(!(ch == ch2)){
        //             //     value++;
        //             //     System.out.print(ch);
                        
        //             // }
                    
        //         }
        // if (count == 1) {
        // System.out.print("The non-repeated count is: " + count);
        // }
        // }
        
        // // else if(false){
        // //     System.out.println("The Non-repeated ");
        // // }
        // }




    }




public class string{



    public static void main(String[] args){

        String name = "VishorKathirgP@123";
        String[] splited = name.split(name);
        boolean flag;
        
//print
        System.out.println("Name:" + name);
           System.out.println(" ");

// Length 
        System.out.println("The Length of the word: " + name.length());
   System.out.println(" ");
// vowels
        System.out.print("Vowels: ");
        for(int i = 0;i<name.length() ; i++){
            char ch = Character.toLowerCase(name.charAt(i));
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.print(ch);
                
            } 
            //  else if(ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u'){
            //     System.out.print(ch + "\t");
            // }
        }
       
           System.out.println(" ");

// consonents
        System.out.print("Consonents:");
        for(int i = 0 ; i<name.length();i++){
            char ch = Character.toLowerCase(name.charAt(i));
            if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')){
                System.out.print(ch);
            }
        }
     
   System.out.println(" ");
//check  P present or not
        // System.out.println("P present or not : ");
        for (int i = 0;i<name.length();i++) {   
            char character = name.charAt(i);
            if(character == 'P'){
                // System.out.println("P is present");
                flag = true;
            }
        } 
        if(true){
            System.out.println("P is Present ");      
        }else{
            System.out.println("Not");
        }

// lowerCase to UpperCase
   System.out.println(" ");
        // System.out.println(name.toLowerCase());

// how many UpperCase
        int count=0;
        for(int i= 0;i<name.length();i++){
            
            char ch = name.charAt(i);
            if( ch >= 65 && ch <= 96){
                count++;
                flag = true;
            }
        }
        if(true){
            System.out.println("There are " + count + " UpperCase.");
        }
   System.out.println(" ");

// repeated's Object created

    // new oneclass("VishorKathirP");
    oneclass obj = new oneclass();
    obj.oneclass(name);
    // obj.classtwo(name);

       System.out.println(" ");
// Any number present?

    // System.out.println("Any number present or not?: ");
    String number = " ";
    for (int i = 0 ;i<name.length();i++) {
        int valuecount = 0;
        char ch = name.charAt(i);
        if(ch>='0'&& ch<='9'){
            number +=ch;
            flag = true;
            valuecount++;
            
        }
    }
    if(true){
    System.out.println( "There are " + count + " numbers and they are "+number);
    }   


    //Any special character available?

    System.out.println(" ");

    for(int i= 0;i<name.length();i++){
        char ch = name.charAt(i);
        if(!((ch >='a' && ch <='z') && (ch>='A' && ch<='Z') && (ch >='0' && ch<='9'))) {
            // System.out.print(ch);
            flag = true;
        }
        // else{
        //     flag = false;
        // }
    } 
    if(true){
        System.out.print("They have a special character");
    }else{
        System.out.print("They donot have any special character");
    }


// Sort and print it
    System.out.println();
   
    char[] nameArr = name.toCharArray();
    char temp;
       for(int i = 0 ; i<nameArr.length-1;i++){
        // char ch1 = nameArr.charAt(i);
        for(int j = i+1;j<nameArr.length;j++){
            // char ch2 = name.charAt(j);
            if (nameArr[j] > nameArr[i]) {
                temp = nameArr[i];
                nameArr[i] = nameArr[j];
                nameArr[j] = temp;
            }
        // System.out.println(ch2);
        }
       }
       System.out.print("the sorted name is :");
        for(char value : nameArr){
            System.out.print(value);
        }


// Reverse the name

    // for(int i = 0;i<name.length()-1;i++){ 
    //     char ch1 = name.charAt(i); 
    //     for(int j = 0-i;i<name.length();i++){
    //         char ch2 = name.charAt(j); 

    //         ch1 = ch2;
    //         ch2=ch1;
            
    //     }

    // }
    
    // convert into arr
   System.out.println("");
   String reversed = "";
    for(int i = name.length()-1;i>=0;i--){
        reversed += name.charAt(i);
    }
    System.out.print( "The reversed name is: "+reversed);


    //Print first last middle letter

    System.out.println(" ");
    System.out.println("the first latter is: " + name.charAt(0));
    System.out.println("The last letter is :" + name.charAt(name.length() -1));
    System.out.println("The middle letter is : " + name.charAt(name.length() / 2));


// character D is fourth letter or not

    // for (int i = 0; i < name.length(); i++) {

        if((name.charAt(4) == 'D')){
            System.out.print("yes,character D is fourth");
            // flag = true;
        }
        else{
            System.out.println("No,character D is fourth");
        }
    // }
    // if(true){
    // System.out.println("yes,character D is fourth");
    // }



// swap a to b , b to c , c to d

    

        // if((name.charAt(i) == 'a') || (name.charAt(i) == 'b') || (name.charAt(i) == 'c')){
        //     // System.out.println('a'='b' );
        //     // 'a' = 'b';
        //     // b=c;
        //     // c=d;
            String name2= "A basic fundamental";
            System.out.println("The swapping of character: " +name2.replace('a', 'b') + " "+ name2.replace('b', 'c') +  " "+ name2.replace('c', 'd'));


// is it english or not
String name3 = "vishorhnc";
boolean flag1 = true;

    for(int i=0;i<name3.length();i++){
        if(!((name3.charAt(i) >= 'A' && name3.charAt(i) <='Z') || (name3.charAt(i) >= 'a' && name3.charAt(i) <='z'))){
        // System.out.print("is it english");
       
        flag1 = false;
        break;
    }
    // else{
    //     flag= false;
    // }
    }
    if (flag1) {
        
         System.out.println("is it english");
    }else{
   System.out.println("is it not language");
    }
        
   


    }
}
       
    
