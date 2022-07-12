import java.util.Scanner ;

public class Zodiac {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int yearOfBirth , zodiac ;

        System.out.print("Enter the your year of birth : ");
        yearOfBirth = input.nextInt();
        zodiac = yearOfBirth % 12 ;

        switch (zodiac){
            case 0 :
                System.out.print("Your chinese zodiac is Monkey ! ");
                break;

            case 1 :
                System.out.print("Your chinese zodiac is Cock ! ");
                break;

            case 2 :
                System.out.print("Your chinese zodiac is Dog ! ");
                break;

            case 3 :
                System.out.print("Your chinese zodiac is Pig ! ");
                break;

            case 4 :
                System.out.print("Your chinese zodiac is Mouse ! ");
                break;

            case 5 :
                System.out.print("Your chinese zodiac is Ox ! ");
                break;

            case 6 :
                System.out.print("Your chinese zodiac is Tiger ! ");
                break;

            case 7 :
                System.out.print("Your chinese zodiac is Rabbit ! ");
                break;

            case 8 :
                System.out.print("Your chinese zodiac is Dragon ! ");
                break;

            case 9 :
                System.out.print("Your chinese zodiac is Snake ! ");
                break;

            case 10 :
                System.out.print("Your chinese zodiac is Horse ! ");
                break;

            case 11 :
                System.out.print("Your chinese zodiac is Sheep ! ");
                break;
        }

    }
}
