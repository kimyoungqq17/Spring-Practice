package hello.servlet.web.frontcontroller.v4.controller;

import java.util.Map;

public interface ControllerV4 {
    String process(Map<String, String> paraMap, Map<String, Object> model);
}
