package com.foxmail.chwetion.dubbo.provider.context;

public class RuntimeContext {
    private static boolean health;

    static {
        health = true;
    }

    public static boolean isHealth() {
        return health;
    }

    public static void setHealth(boolean health) {
        RuntimeContext.health = health;
    }
}
