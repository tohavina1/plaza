import { InterfaceProvider } from './../../providers/interface/interface';
import { Component } from '@angular/core';
import { VideoPlayer, VideoOptions } from '@ionic-native/video-player';

import { NavController, NavParams } from 'ionic-angular';

@Component({
  selector: 'page-item-details',
  templateUrl: 'item-details.html'
})
export class ItemDetailsPage {
  videoOption : VideoOptions;
  idVideo : any;
  Video : any;
  videoURL : string;

  constructor(
    public navCtrl: NavController,
    public navParams: NavParams,
    public rest : InterfaceProvider,
    public videoPlayer : VideoPlayer
  ) {
    try{
      this.idVideo = navParams.get('res');
      this.rest.getVideoURL(this.idVideo).subscribe(data => {
        this.Video = data;
        this.videoURL = "http://plazachanel.000webhostapp.com/plaza/"+data[0]["cat"]+"/"+data[0]["lien"];
      });
    }catch(e){
      console.error(e);
    }
  }
}
