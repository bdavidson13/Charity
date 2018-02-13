using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Configuration;

namespace vincent.Controllers
{
    public class BaseController:Controller
    {
       public IConfiguration configuration;
        public BaseController(IConfiguration configuration){
            this.configuration = configuration;
        }
    }
}