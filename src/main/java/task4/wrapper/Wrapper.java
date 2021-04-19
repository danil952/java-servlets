package task4.wrapper;


import task4.domain.User;
import task4.rep.userRep;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;


public class Wrapper extends ServletRequestWrapper {

    public Wrapper(ServletRequest request) {
        super(request);
    }

    @Override
    public Object getAttribute(String name) {
        if (name.equals("user"))
        {
            String login = (String)super.getParameter("login");
            User user = userRep.selectLogin(login);
            return user;
        }
        else
            return super.getAttribute(name);
    }

    @Override
    public void setAttribute(String name, Object o) {
        super.setAttribute(name, o);
    }
}
