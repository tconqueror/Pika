package com.pikapika.utils;

/**
 * Created by anonymousjp on 5/20/17.
 */
public class Utils {
    public static final int WINDOW_WIDTH = 720;
    public static final int WINDOW_HEIGHT = 460;
    public static final String DEFAULT_FONT = "Shree Devanagari 714";
    public static final String BT_EASY = "Easy";
    public static final String BT_MEDIUM = "Medium";
    public static final String BT_HARD = "Hard";
    public static final String BT_SETTING = "Setting";
    public static final String BT_QUIT = "Quit Game";
    public static final boolean DEBUG = true;

    public static void debug(Class clz,String debug){
        if (DEBUG){
            debug = debug == null ? "Null debug string!" : debug;
            System.out.println(clz.getCanonicalName()+": "+debug);
        }
    }
}