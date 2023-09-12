package com.simple.framework.common.mq;


public interface MqTopic<T> {

    /**
     * 发送消息
     *
     * @param message 消息体
     */
    default void product(T message) {
    }

    /**
     * 自定义发送消息
     *
     * @param mqConfig 消息配置
     * @param message  消息体
     */
    default void product(MqConfig mqConfig, T message) {
    }

    /**
     * 消费消息
     *
     * @param message 消息体
     */
    void consume(T message);
}
