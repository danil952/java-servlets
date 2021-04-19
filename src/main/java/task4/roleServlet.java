package task4;

import listeners.EmployeeDTO;
import secure.filters.wrappers.MyHttpRequestWrapper;
import task4.domain.Role;
import task4.domain.User;
import task4.wrapper.Wrapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/getrole")
public class roleServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Wrapper wrapper = new Wrapper(request);
        PrintWriter out = response.getWriter();
        User user = (User)wrapper.getAttribute("user");
        Role userRole = (Role) getServletContext().getAttribute("user");
        Role adminRole = (Role) getServletContext().getAttribute("admin");
        String role_name="";
        if(user != null)
        {
            if(user.getRole_id()==userRole.getId()) role_name=userRole.getName();
            else if(user.getRole_id()==adminRole.getId()) role_name=adminRole.getName();
        }

        out.println("Role name = " + role_name);
    }
}
