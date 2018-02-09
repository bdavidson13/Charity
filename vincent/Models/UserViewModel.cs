using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;

namespace vincent.Models
{
    public class UserViewModel
    {
        public string FirstName { get; set; }
        public string LastName { get; set; } 
        public string Email { get; set; }
        
        [DataType(DataType.Password)]
        public string Password { get; set; }
        public string PhoneNumber { get; set; }
        public List<Skill> Skills { get; set; }
    }
}