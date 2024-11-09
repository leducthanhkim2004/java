package Users;

import java.util.List;

public class Admin extends User {

    // Constructor for Admin, using the constructor from User
    public Admin(String User_ID, String User_Name, String Role, String Contact_Number, String Status)
    {
        super(User_ID, User_Name, Role, Contact_Number, Status);
    }

    // Overriding the addRole method to assign roles in a more controlled way
    @Override
    public void addRole(String Role) {
        
        checkActiveStatus();
        
        if (Role.equalsIgnoreCase("Manager") || Role.equalsIgnoreCase("Admin")) 
        {
            super.addRole(Role);
            System.out.println("Role " + Role + " assigned successfully to " + getUserName());
        }   
        else 
        {
            throw new IllegalArgumentException("Only 'Manager' or 'Admin' roles can be assigned by Admin");
        }
    }

    // Method to update the role of any user
    public void updateRole(User user, String newRole) {
        
        checkActiveStatus();
        
        if (newRole != null && !newRole.isEmpty()) 
        {
            user.addRole(newRole);
            System.out.println("Role updated to " + newRole + " for user " + user.getUserName());
        } 
        else 
        {
            throw new IllegalArgumentException("Invalid role provided");
        }
    }

    // Overloaded updateUser methods

    // Original method from the User class (overriding)
    @Override
    public void updateUser(User another) {
        
        checkActiveStatus();
        
        super.updateUser(another); // Using the parent method
    }

    // Overloaded method: updates only the status
    public void updateUser(String newStatus) {
        
        checkActiveStatus();
        
        if (newStatus != null && !newStatus.isEmpty()) 
        {
            this.Status = newStatus;
            System.out.println("Status updated to " + newStatus + " for admin " + getUserName());
        }
        else
        {
            throw new IllegalArgumentException("Invalid status provided");
        }
    }

    // Overloaded method: updates only the contact number
    public void updateUser(String newContactNumber, boolean isContactNumber) {
        
        checkActiveStatus();
        
        if (newContactNumber != null && newContactNumber.length() == 10)
        {
            char[] contactChars = newContactNumber.toCharArray();
            this.Contact_Number = contactChars;
            System.out.println("Contact number updated for admin " + getUserName());
        }
        else 
        {
            throw new IllegalArgumentException("Contact number must be 10 characters long");
        }
    }

    // Overloaded method: updates another user's contact number
    public void updateUser(User user, String newContactNumber, boolean isContactNumber) {
        
        checkActiveStatus();
        
        if (newContactNumber != null && newContactNumber.length() == 10)
        {
            char[] contactChars = newContactNumber.toCharArray();
            user.Contact_Number = contactChars;
            System.out.println("Contact number updated for user " + user.getUserName());
        } 
        else
        {
            throw new IllegalArgumentException("Contact number must be 10 characters long");
        }
    }
    
        // Method to check if the admin is active
    private void checkActiveStatus() {
        if ("Inactive".equalsIgnoreCase(this.Status)) {
            throw new IllegalStateException("Admin " + getUserName() + " is inactive and cannot perform actions until status is updated.");
        }
    }
    
}
