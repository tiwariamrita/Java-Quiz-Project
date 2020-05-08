import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { IndexFormComponent } from './Components/index-form/index-form.component';
import { LoginFormComponent } from './Components/login-form/login-form.component';
import { SloginFormComponent } from './Components/slogin-form/slogin-form.component';
import { RegisterFormComponent } from './Components/register-form/register-form.component';
import { SpageFormComponent } from './Components/spage-form/spage-form.component';
import { TpageFormComponent } from './Components/tpage-form/tpage-form.component';


const routes: Routes = [
  {path:'', redirectTo: 'index', pathMatch: 'full'}, 
  {path: 'index', component: IndexFormComponent},
  {path: 'login', component: LoginFormComponent},
  {path: 'slogin', component: SloginFormComponent},
  {path: 'register', component: RegisterFormComponent},
  {path: 'student', component: SpageFormComponent},
  {path: 'teacher', component: TpageFormComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
