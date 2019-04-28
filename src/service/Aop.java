package service;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class Aop {
//    @Before(value = "execution(* controller.Login.*(String))&&args(json)",argNames = "json")
//    public void before(String json){
//        System.out.println(json+"aop");
//
//    }
}
