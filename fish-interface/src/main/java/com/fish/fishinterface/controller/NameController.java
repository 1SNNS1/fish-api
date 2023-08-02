package com.fish.fishinterface.controller;

import cn.hutool.extra.qrcode.QrCodeUtil;
import com.fish.fishclientsdk.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * 名称 API
 *
 * @author fishLight
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name, HttpServletRequest request) {
        System.out.println(request.getHeader("fish"));
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request) {
        /*String accessKey = request.getHeader("accessKey");
        String nonce = request.getHeader("nonce");
        String timestamp = request.getHeader("timestamp");
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");
        //  实际情况应该是去数据库中查是否已分配给用户
        if (!accessKey.equals("fish")) {
            throw new RuntimeException("无权限");
        }
        if(Long.parseLong(nonce)>10000){
            throw new RuntimeException("无权限");
        }
        //  时间和当前时间不能超过5分钟
        //  实际情况中是从数据库中查出 secretKey
        String serverSign = SignUtils.genSign(body, "fishabc");
        if(!sign.equals(serverSign)){
            throw new RuntimeException("无权限");
        }*/
        String result = "POST 用户名是" + user.getUsername();
        //  调用成功后 次数+1
        return result;
    }

    @GetMapping("/getCode")
    public void getCodeGet(String msg, HttpServletResponse response) throws IOException {
        //生成二维码到输出流
        response.setContentType("image/jpeg");
        ServletOutputStream out = response.getOutputStream();
        QrCodeUtil.generate(msg, 300, 300, "jpg", out);
        out.close();
    }

}
