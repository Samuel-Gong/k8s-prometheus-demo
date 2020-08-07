package cn.edu.nju.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * <p>
 *
 * @author Shenmiu
 * @date 2020/8/7
 */
@RestController
public class HelloController {
    @GetMapping(path = "/hello")
    public HelloResp sayHello() {
        return new HelloResp("hello world");
    }
}

class HelloResp {
    private String msg;

    public HelloResp(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
