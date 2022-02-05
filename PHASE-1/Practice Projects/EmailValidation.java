package emailvalidation;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailValidation{
    public static void main(String[] args) {
        List<String> emails=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter four Email Ids:");
        for(int i=0;i<4;i++){
            String mail=scanner.nextLine();
            emails.add(mail);
        }
        System.out.println(Arrays.asList(emails));
        System.out.println("Entry Filled Ready to Search");
        System.out.println("Enter Email Id To Search");
        String search=scanner.nextLine();
        Pattern pattern= Pattern.compile(search,Pattern.CASE_INSENSITIVE);
        boolean found=false;
        for(int i=0;i<4;i++){
            Matcher matcher=pattern.matcher(emails.get(i));
            if(matcher.find()){
                System.out.println("Email Found:"+emails.get(i));
                found=true;
            }
        }
        if(!found){
            System.out.println("Not Found - Invalid Email Id");
        }
        scanner.close();
    }
}