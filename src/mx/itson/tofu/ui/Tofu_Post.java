/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tofu.ui;

import java.util.ArrayList;
import java.util.List;
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
        user2.setName("Mariana Moreno");
        user2.setEmail("yoonie_fresita23@gmail.com");
        user2.setPassword("minyO0ngi");
        
        Category category = new Category ();
        category.setName("Tecnología");
        
       List<Usser> users = new ArrayList();
       users.add(user);
       users.add(user2);
        
        Post post = new Post ();
        post.setTitle("La adopción en la nube");
        post.setDescription("La computación en la nube ha transformado la forma en que se desarrolla y se despliega el software \nPermite a los desarrolladores acceder a recursos escalables y flexibles, lo que facilita la creación y la\ngestión de aplicaciones. La nube también ha permitido la aparición de servicios de software como servicio (SaaS), \ndonde los usuarios pueden acceder a aplicaciones directamente a través de Internet sin necesidad de instalarlas en \nsus dispositivos.");
        post.setComments(user2.getName()+": Orale que padre");
        post.setLike(23);
        post.setDislike(10);
        post.setDate("18 de octubre del 2023");
        post.setUser(user);
        post.setCategory(category);
        
        System.out.println("-------------"+post.getTitle().toUpperCase()+"-------------");
        System.out.println("DESCRIPTION: " + post.getDescription());
        System.out.println("https://www.aboutespanol.com/thmb/8BscW9bK2MXHxqPR9yuhf-V0v0w=/2121x1193/smart/filters:no_upscale()/Almacenamientoenlanube-5b0a965d1d6404003700653f.jpg");
        System.out.println("                             "+"BY: " + user.getName() );
        System.out.println("LIKES " + post.getLike() + "                    " + " DISLIKES " + post.getDislike());
        System.out.println("DATE: " + post.getDate() + "          " + "CATEGORY: " + post.getCategory().getName());
        System.out.println(" ");
        System.out.println("REPLY... " +post.getComments());
        System.out.println("------------------------------------------------------------");
        
       
    }
    
}
