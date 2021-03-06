import java.util.Scanner;

public class CountChar {
    static Scanner sc= new Scanner(System.in);

    public static String inputParagraph(){
        String input = "";
        try {
            System.out.print("Nhập một đoạn: ");
            input=sc.nextLine();
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
        return input;
    }

    public static char inputCharacter(){
        char character = 0;
        try {
            System.out.print("Nhập một từ để kiểm tra: ");
            character=sc.next().charAt(0);
        } catch (Exception ex){
            System.out.print(ex.getMessage());
        }
        return character;
    }

    public static void countCharacter(String paragraph, char character){
        int count=0;
        int length=paragraph.length();
        try {
            for (int i=0; i<length; i++){
                if (paragraph.charAt(i)==character){
                    count++;
                }
            }
            System.out.print(character+" xuất hiện "+count+" lần.");
        } catch (Exception ex){
            System.out.print(ex.getMessage());
        }
    }
}
