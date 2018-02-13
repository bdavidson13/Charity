using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using vincent.Models;

public class UserController :Controller
{
    [Route("/user/createuser")] 
    public IActionResult CreateUser (){
        UserViewModel model = new UserViewModel();
        return View(model);
    }

    [HttpPost]
    [Route("/user/createuser")] 
    public IActionResult CreateUser(UserViewModel model){
        if(!ModelState.IsValid){
            return View(model);
        }
        saveUser(model);
        return View("../Home/Index");
    }
    private void saveUser(UserViewModel user){
        //TODO implement call to service to save
    }
}