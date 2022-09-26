public class Birth {
    public static void main(String[] args) {
         String monthLetter;
        int monthNumber = 14;

        if (monthNumber == 1){
            monthLetter = "J";
            System.out.println("Your birth month is: " + monthLetter);
        }else if (monthNumber == 2){
            monthLetter = "F";
            System.out.println("Your birth month is: " + monthLetter);
        }else if (monthNumber == 3){
            monthLetter = "M";
            System.out.println("Your birth month is: " + monthLetter);
        }else if (monthNumber == 4){
            monthLetter = "A";
            System.out.println("Your birth month is: " + monthLetter);
        }else if (monthNumber == 5){
            monthLetter = "M";
            System.out.println("Your birth month is: " + monthLetter);
        }else if (monthNumber == 6){
            monthLetter = "J";
            System.out.println("Your birth month is: " + monthLetter);
        }else if (monthNumber == 7){
            monthLetter = "J";
            System.out.println("Your birth month is: " + monthLetter);
        }else if (monthNumber == 8){
            monthLetter = "A";
            System.out.println("Your birth month is: " + monthLetter);
        }else if (monthNumber == 9){
            monthLetter = "S";
            System.out.println("Your birth month is: " + monthLetter);
        }else if (monthNumber == 10){
            monthLetter = "O";
            System.out.println("Your birth month is: " + monthLetter);
        }else if (monthNumber == 11){
            monthLetter = "N";
            System.out.println("Your birth month is: " + monthLetter);
        }else if (monthNumber == 12){
            monthLetter = "D";
            System.out.println("Your birth month is: " + monthLetter);
        }else if (monthNumber < 1 || monthNumber > 12){
            System.out.println("You entered an incorrect month value: " + monthNumber);
        }
    }
}
