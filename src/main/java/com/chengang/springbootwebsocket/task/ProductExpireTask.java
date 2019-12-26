package com.chengang.springbootwebsocket.task;

import com.chengang.springbootwebsocket.socket.ProductWebSocket;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: chengang
 * @date: 2019/12/26
 * @description:
 */
@Component
public class ProductExpireTask {

    @Scheduled(fixedRate=2000)
    public void productExpire() throws IOException {

        String[] strs={"Test随机消息 ：30.1123",
                "Test随机消息 ：32.1021",
                "Test随机消息 ：33.1774",
                "Test随机消息 ：33.2372",
                "Test随机消息 ：31.0281",
                "Test随机消息 ：30.0222",
                "Test随机消息 ：32.1322",
                "Test随机消息 ：33.3221",
                "Test随机消息 ：31.2311",
                "Test随机消息 ：32.3112"};

        ProductWebSocket.sendInfo(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) +"    Test 消息---->"+ RandomStr(strs));

    }

    //随机返回字符串数组中的字符串
    public static String RandomStr(String[] strs){
        int random_index = (int) (Math.random()*strs.length);
        return strs[random_index];
    }
}
