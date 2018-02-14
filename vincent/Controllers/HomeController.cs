using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Configuration;
using vincent.Models;

namespace vincent.Controllers
{
    public class HomeController : BaseController
    {
        public HomeController(IConfiguration configuration) : base(configuration)
        {
        }

        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Login(){
            UserViewModel model = new UserViewModel();
            return View(model);
        }
        [HttpPost]
        public IActionResult Login(UserViewModel model){
            if(!ModelState.IsValid){
                return View(model);
            }
            /*TODO: 
                1) get User back from service
                2) if user doesn't exist return error
                3) if uses does exist save user data in session var
                4) redirect home
                5) once that's working go back and save where uses is
                   coming from and redirect back to there
            */
            return View("Index");
        }
        public IActionResult About()
        {
            ViewData["Message"] = "Your application description page.";

            return View();
        }

        public IActionResult Contact()
        {
            ViewData["Message"] = "Your contact page.";
            return View();
        }

        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
