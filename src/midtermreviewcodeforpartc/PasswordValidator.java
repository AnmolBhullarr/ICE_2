
package midtermreviewcodeforpartc;

/**
 *
 * @author Anmol Bhullar
 */
public class PasswordValidator {
    
     public boolean passwordValidator(String password) {

        boolean passwdValid;
        int specialCharCount = 0;
        
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                
                specialCharCount++;
            }
        }
        if (specialCharCount > 0 && password.length() > 7) {
            passwdValid = true;
        }
        else {
            passwdValid = false;
        }
        return passwdValid;
    }
}
    

