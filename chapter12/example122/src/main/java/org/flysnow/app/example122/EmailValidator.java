package org.flysnow.app.example122;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 飞雪无情
 * @since 16-5-9 上午12:00
 */
public class EmailValidator {
    public static boolean isValidEmail(String email){
        if (null==email || "".equals(email)) return false;
        //Pattern p = Pattern.compile("\\w+@(\\w+.)+[a-z]{2,3}"); //简单匹配
        Pattern p =  Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");//复杂匹配
        Matcher m = p.matcher(email);
        return m.matches();
    }
}
