package Utilities;

public class Validator {
    public static boolean isEmail(String email) {
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    }

    public static boolean isPassword(String password) {
        //Must contain at least 8 characters, no other special requirements
        return password.length() >= 8;
    }

    public static boolean isName(String name) {
        return name.matches("^[a-zA-Z\\s]*$");
    }

    public static boolean isContactNumber(String contactNumber) {
        return contactNumber.matches("^(09|\\+639)\\d{9}$");
    }

    public static boolean isDate(String date) {
        //Date format should be (mm/dd/yyyy)
        return date.matches("^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/\\d{4}$");
    }

    public static boolean isTime(String time) {
        return time.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
    }

    public static boolean isInteger(String integer) {
        return integer.matches("^\\d+$");
    }

    public static boolean isDecimal(String decimal) {
        return decimal.matches("^\\d+\\.\\d+$");
    }

    public static boolean isAlphaNumeric(String alphaNumeric) {
        return alphaNumeric.matches("^[a-zA-Z0-9]*$");
    }

    public static boolean isAlpha(String alpha) {
        return alpha.matches("^[a-zA-Z]*$");
    }

    public static boolean isAlphaAllowNull(String alpha) {
        return alpha.matches("^[a-zA-Z]*$") || alpha.equals("");
    }

    public static boolean isAlphaSpace(String alphaSpace) {
        return alphaSpace.matches("^[a-zA-Z\\s]*$");
    }

    public static boolean isAlphaNumericSpace(String alphaNumericSpace) {
        return alphaNumericSpace.matches("^[a-zA-Z0-9\\s]*$");
    }

    public static boolean isAlphaNumericSpecial(String alphaNumericSpecial) {
        return alphaNumericSpecial.matches("^[a-zA-Z0-9!@#$%^&*]*$");
    }

    public static boolean isAlphaNumericSpaceSpecial(String alphaNumericSpaceSpecial) {
        return alphaNumericSpaceSpecial.matches("^[a-zA-Z0-9\\s!@#$%^&*]*$");
    }

    public static boolean passwordMatch(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }
}
