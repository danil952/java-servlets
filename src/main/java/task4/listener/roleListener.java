package task4.listener;

import task4.domain.Role;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class roleListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        String adminName = servletContext.getInitParameter("adminName");
        int adminId = Integer.parseInt(servletContext.getInitParameter("adminId"));

        String userName = servletContext.getInitParameter("userName");
        int userId = Integer.parseInt(servletContext.getInitParameter("userId"));
        Role adminRole = new Role(adminId,adminName);
        Role userRole = new Role(userId,userName);
        servletContext.setAttribute("admin",adminRole);
        servletContext.setAttribute("user",userRole);
    }

//    public void contextDestroyed(ServletContextEvent sce) {
//        ServletContext sc = sce.getServletContext();
//        sc.removeAttribute("eName");
//        sc.removeAttribute("eName2");
//        System.out.println("Values deleted from context.");
//    }
}
