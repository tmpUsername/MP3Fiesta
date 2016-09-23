/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3fiesta.entity.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author admin
 */
public class MP3FiestTest {
    
   @BeforeClass
   public static void init(){
       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
   }
    
   @Test
   public void testvide(){
       
   }
}
