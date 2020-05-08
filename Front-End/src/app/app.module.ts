import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IndexFormComponent } from './Components/index-form/index-form.component';
import { LoginFormComponent } from './Components/login-form/login-form.component';
import { SloginFormComponent } from './Components/slogin-form/slogin-form.component';
import { FormsModule } from'@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RegisterFormComponent } from './Components/register-form/register-form.component';
import { SpageFormComponent } from './Components/spage-form/spage-form.component';
import { TpageFormComponent } from './Components/tpage-form/tpage-form.component';

@NgModule({
  declarations: [
    AppComponent,
    IndexFormComponent,
    LoginFormComponent,
    SloginFormComponent,
    RegisterFormComponent,
    SpageFormComponent,
    TpageFormComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
