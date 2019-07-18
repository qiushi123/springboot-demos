package com.shitou.springbootdemos.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by qcl on 2019-06-29
 * 微信：2501902696
 * desc: 使用全局配置
 */
@Component
@ConfigurationProperties(prefix = "limit")
public class LimitConfig {
    private BigDecimal minMoney;
    private BigDecimal maxMoney;
    private String description;

    public BigDecimal getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(BigDecimal minMoney) {
        this.minMoney = minMoney;
    }

    public BigDecimal getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(BigDecimal maxMoney) {
        this.maxMoney = maxMoney;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
