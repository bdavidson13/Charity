using System.Collections.Generic;
public class UserViewModel
{
    public string FirstName { get; set; }
    public string LastName { get; set; } 
    public string Email { get; set; }
    public string Password { get; set; }
    public string PhoneNumber { get; set; }
    public List<Skill> Skills { get; set; }
}