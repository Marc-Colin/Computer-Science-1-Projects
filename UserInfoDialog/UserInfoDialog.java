package userinfodialog;
import javax.swing.JOptionPane;
public class UserInfoDialog 
{
    public static void main(String[] args) 
    {
     String firstName;
     String lastName;
     String fullName;
     
     firstName = JOptionPane.showInputDialog(" What is your first name? ");
     lastName = JOptionPane.showInputDialog(" What is your last name? ");
     fullName = (firstName + " " + lastName);
     JOptionPane.showMessageDialog(null, "Your full name is: " + fullName);
     System.exit(0);
    }
    
}
