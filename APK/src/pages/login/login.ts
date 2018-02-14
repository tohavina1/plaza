import { CategoryPage } from './../category/category';
import { NavController, ModalController } from 'ionic-angular';
import { Component } from '@angular/core';
import { InterfaceProvider } from '../../providers/interface/interface';

//Page

@Component({
  selector: 'login-ionic',
  templateUrl: 'login.html'
})
export class LoginPage {
  username : string;
  password : string;
  loginResult : any;
  status : string;
  idUser : string;

  constructor(
    public navCtrl: NavController,
    public rest : InterfaceProvider,
    public modal : ModalController
  ) {

  }

  doLogin() : void{
    this.loginResult = this.rest.getLogin(this.username, this.password).subscribe(data => {
      this.status = data[0]["status"];
      this.idUser = data[0]["iduser"];
      if(this.status == "1"){
        this.navCtrl.setRoot(CategoryPage, this);
      }else if(this.status == "2"){
        alert("Incorrect login");
      }else{
        alert("Wrong password");
      }
    });
  }

  openModal() : void{
    const insModal = this.modal.create('inscription-page');

    insModal.present();
  }

}
