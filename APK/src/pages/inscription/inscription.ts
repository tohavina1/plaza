import { InterfaceProvider } from './../../providers/interface/interface';
import { Component } from '@angular/core';
import { IonicPage, NavParams, ViewController, NavController } from 'ionic-angular';

/**
 * Generated class for the InscriptionPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage({
  name : 'inscription-page'
})
@Component({
  selector: 'page-inscription',
  templateUrl: 'inscription.html',
})
export class InscriptionPage {
  username :string;
  email : string;
  password : string;

  constructor(
    public navCtrl : NavController,
    public navParams: NavParams,
    public view : ViewController,
    public rest : InterfaceProvider
  ) {
  }

  closeModal() : void {
    this.view.dismiss();
  }

  signUp() : void {
    this.rest.signUp(this.username, this.email, this.password).subscribe(data => {});
    this.view.dismiss();
    alert("Account created");
  }

}
