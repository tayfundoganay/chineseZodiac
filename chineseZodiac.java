import java.util.Scanner;

public class chineseZodiac {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int birthYear, chineseZodiacNum;
        System.out.print("Enter your birth year : ");
        birthYear = scanner.nextInt();

        chineseZodiacNum = birthYear%12;

        switch (chineseZodiacNum){
            case 0:
                System.out.println("Your Chinese Zodiac : Monkey" );
                break;
            case 1:
                System.out.println("Your Chinese Zodiac : Rooster" );
                break;
            case 2:
                System.out.println("Your Chinese Zodiac : Dog" );
                break;
            case 3:
                System.out.println("Your Chinese Zodiac : Pig" );
                break;
            case 4:
                System.out.println("Your Chinese Zodiac : Mouse" );
                break;
            case 5:
                System.out.println("Your Chinese Zodiac : Cow" );
                break;
            case 6:
                System.out.println("Your Chinese Zodiac : Tiger" );
                break;
            case 7:
                System.out.println("Your Chinese Zodiac : Rabbit" );
                break;
            case 8:
                System.out.println("Your Chinese Zodiac : Dragon" );
                break;
            case 9:
                System.out.println("Your Chinese Zodiac : Snake" );
                break;
            case 10:
                System.out.println("Your Chinese Zodiac : Horse" );
                break;
            case 11:
                System.out.println("Your Chinese Zodiac : Sheep" );
                break;
        }
    }
}
