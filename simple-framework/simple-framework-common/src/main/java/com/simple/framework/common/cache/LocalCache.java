package com.simple.framework.common.cache;

import org.springframework.context.SmartLifecycle;

public interface LocalCache extends SmartLifecycle {

    /**
     * 初始化缓存
     */
    void initCache();

    @Override
    default void start() {
        initCache();
    }

    @Override
    default void stop() {

    }

    @Override
    default boolean isRunning() {
        return false;
    }
}
