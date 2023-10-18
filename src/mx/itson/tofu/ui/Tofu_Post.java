/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tofu.ui;

import mx.itson.tofu.entities.Category;
import mx.itson.tofu.entities.Post;
import mx.itson.tofu.entities.Usser;

/**
 *
 * @author avalo
 */
public class Tofu_Post {

    public static void main(String[] args) {
        Usser user = new Usser ();
        user.setName("Egla Avalos");
        user.setEmail("ela_thv23@gmail.com");
        user.setPassword("kuromi23");
        
        Usser user2 = new Usser ();
        user2.setName("Marian Moreno");
        user2.setEmail("yoonie_fresita23@gmail.com");
        user2.setPassword("minyO0ngi");
        
        Category category = new Category ();
        category.setName("Tecnología");
        
        Post post = new Post ();
        post.setTitle("La adopción en la nube");
        post.setDescription("La computación en la nube ha transformado la forma en que se desarrolla y se despliega el software. "
                + "\nPermite a los desarrolladores acceder a recursos escalables y flexibles, lo que facilita la creación y la"
                + "\ngestión de aplicaciones. La nube también ha permitido la aparición de servicios de software como servicio (SaaS),"
                + "\ndonde los usuarios pueden acceder a aplicaciones directamente a través de Internet sin necesidad de instalarlas en sus dispositivos.");
        post.getCategory();
        System.out.println(post.getDescription());
       
    }
    
}
