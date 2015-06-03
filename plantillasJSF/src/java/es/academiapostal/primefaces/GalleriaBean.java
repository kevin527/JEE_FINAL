/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.academiapostal.primefaces;

import java.io.File;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;  
import java.util.Arrays;
import java.util.List;  
import javax.annotation.PostConstruct;  
import javax.faces.convert.FacesConverter;
import javax.swing.ImageIcon;


/**
 *
 * @author Salva
 */
@ManagedBean
@RequestScoped 
public class GalleriaBean {  
  
    private List<String> images;      
    

    @PostConstruct  

    public void init() {  
        images = new ArrayList<String>();  
        String [] nombresImgs={"camaro.jpg", "ferrari.jpg", 
        "lambo.jpg", "mustang.jpg", "dodge.jpg"};        
        images.addAll(Arrays.asList(nombresImgs));

    }  

     
    public List<String> getImages() {  
        return images;  
    }  

}  
           
