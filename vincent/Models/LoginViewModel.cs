using System.ComponentModel.DataAnnotations;

namespace vincent.Models
{
    public class LoginViewModel
    {
        public string UserName { get; set; }
        
        [DataType(DataType.Password)]
        public string Password { get; set; }
    }
}