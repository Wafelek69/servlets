package pl.sda.ZadanieMoje;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Wartosci {

    public static final List<String> USERList = Lists.newArrayList();
    public static final List<String> PASSList = Lists.newArrayList();

    private static final String LOGIN_ADMIN = "admin";
    private static final String PASS_ADMIN = "123admin123";

    public static String getLoginAdmin() {
        return LOGIN_ADMIN;
    }

    public static String getPassAdmin() {
        return PASS_ADMIN;
    }
}

