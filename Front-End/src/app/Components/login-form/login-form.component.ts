import { Component, OnInit } from '@angular/core';
import { Login } from 'src/app/Models/login';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  newlogin:Login = new Login()

  constructor() { }

  ngOnInit(): void {
  }

  Submitalert(){
    alert("Submitted!")
    console.log(this.newlogin)
  }

}


