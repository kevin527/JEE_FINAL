package org.primefaces.showcase.view.multimedia;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ImagesView {

    private ArrayList<String> images;

    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
     
        images.add("1.jpg");
        images.add("2.jpg");
        images.add("3.jpg");
        images.add("4.jpg");
        images.add("5.jpg");
        images.add("6.jpg");
        images.add("7.jpg");
        //}
    }

    public ArrayList<String> getImages() {
        return images;
    }
}
