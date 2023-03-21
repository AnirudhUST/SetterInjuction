package ustbatchno3.DI_SetterInjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import ustbatchno3.Spring_IOC.Sim;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");  
         Roles r=context.getBean("ANIRU",Roles.class);
         r.display();
    }
}
