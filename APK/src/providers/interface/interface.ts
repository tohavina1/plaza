import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

/*
  Generated class for the InterfaceProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class InterfaceProvider {
  host : string;

  constructor(public http: HttpClient) {
    this.host = "plazastreaming.herokuapp.com";
  }

  public getLogin(user, mdp){
    return this.http.get("http://"+this.host+"/statusUser.jsp?p="+user+"&mdp="+mdp);
  }

  public getCategory(){
    return this.http.get("http://"+this.host+"/ListeCategorie.jsp");
  }

  public getFilmByCat(idcat : string){
    return this.http.get("http://"+this.host+"/ListFilmBycat.jsp?idcat="+idcat);
  }

  public getVideoURL(idvideo : string){
    return this.http.get("http://"+this.host+"/film.jsp?idfilm="+idvideo);
  }

  public signUp(username : string, email : string, password : string){
    return this.http.get("http://"+this.host+"/Inscription.jsp?un="+username+"&email="+email+"&pw="+password);
  }

}
