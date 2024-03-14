package hello.servlet.web.frontController.v3;

import hello.servlet.web.frontController.ModelAndView;

import java.util.Map;

public interface ControllerV3 {

    ModelAndView process(Map<String, String> paramMap);
}
