import { ResultCategoryPage } from './../result-category/result-category';
import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

//Page
import { InterfaceProvider } from '../../providers/interface/interface';

/**
 * Generated class for the CategoryPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-category',
  templateUrl: 'category.html',
})
export class CategoryPage {
  category : any;

  constructor(public navCtrl: NavController, public navParams: NavParams, public rest : InterfaceProvider) {
    this.rest.getCategory().subscribe(data => {
      this.category = data;
    });
  }

  ionViewDidLoad() {

  }

  selectCategory(event, cat) : void{
    this.navCtrl.push(ResultCategoryPage, {
      cat: cat
    });
  }

}
