
package Lab6.Question2;

public class StringOp {


    public static String hideLast4Digits(String phone) {
        if (phone.length() > 4) {
            String firstPart = phone.substring(0, phone.length() - 4);
            return firstPart + "****";
        } else {
            return "****";
        }
    }


    public static String hideEmail(String email) {
        int atPos = email.indexOf('@');
        if (atPos <= 0) {
            return "Invalid email";
        }

        String user = email.substring(0, atPos);
        String domain = email.substring(atPos + 1);

        String hiddenUser = "";
        if (user.length() <= 2) {
            hiddenUser = user.charAt(0) + "*";
        } else {
            hiddenUser = user.charAt(0) + "*" + user.charAt(user.length() - 1);
        }

        int dotPos = domain.indexOf('.');
        String domainName;
        String tld;
        if (dotPos > 0) {
            domainName = domain.substring(0, dotPos);
            tld = domain.substring(dotPos);
        } else {
            domainName = domain;
            tld = "";
        }

        String hiddenDomain = "";
        if (domainName.length() <= 2) {
            hiddenDomain = domainName.charAt(0) + "*";
        } else {
            hiddenDomain = domainName.charAt(0) + "*" + domainName.charAt(domainName.length() - 1);
        }

        return hiddenUser + "@" + hiddenDomain + tld;
    }


    public static String maskExceptFirstLast(String str) {
        if (str.length() <= 2) {
            return str;
        } else {
            return str.charAt(0) + "*" + str.charAt(str.length() - 1);
        }
    }

    public static void main(String[] args) {
        String phone = "9876543210";
        String email = "example123@gmail.com";
        String word = "Security";

        System.out.println("Masked Phone: " + hideLast4Digits(phone));
        System.out.println("Masked Email: " + hideEmail(email));
        System.out.println("Masked Word: " + maskExceptFirstLast(word));
    }
}
