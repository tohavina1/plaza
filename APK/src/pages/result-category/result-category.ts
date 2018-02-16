import { InterfaceProvider } from './../../providers/interface/interface';
import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
//Page
import { ItemDetailsPage } from '../item-details/item-details';

/**
 * Generated class for the ResultCategoryPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-result-category',
  templateUrl: 'result-category.html',
})
export class ResultCategoryPage {
  catresult : any;
  idcat : string;

  constructor(public navCtrl: NavController, public navParams: NavParams, public rest : InterfaceProvider) {
    this.idcat = navParams.get('cat').id;
    this.rest.getFilmByCat(this.idcat).subscribe(data => {
      this.catresult = data;
    });
  }

  selectCategory(event, res) : void{
    this.navCtrl.push(ItemDetailsPage, {
      res : res
    });
  }

}
