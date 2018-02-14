/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TOHX
 */
public class Image {
    private String id;
    private String image1;
    private String image2;

    public Image(String id, String image1, String image2) {
        setId (id);
        setImage1(image1) ;
        setImage2(image2) ;
    }

    public Image(String image1, String image2) {
        setImage1(image1) ;
        setImage2(image2) ;
    }

    public Image() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }
    
}
