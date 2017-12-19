using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using vincent.Models;

public class UserController :Controller
{
    [Route("/createuser")] 
    public IActionResult CreateUser (){
        UserViewModel model = new UserViewModel();
        return View(model);
    }
}