package hello.servlet.web.frontController.v5;

<<<<<<< HEAD
import hello.servlet.web.frontController.ModelView;
=======
import hello.servlet.web.frontController.ModelAndView;
>>>>>>> 62f5e21 (feat: @Controller)
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface MyHandlerAdapter {

    boolean supports(Object handler);

<<<<<<< HEAD
    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler)
=======
    ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler)
>>>>>>> 62f5e21 (feat: @Controller)
            throws ServletException, IOException;
}