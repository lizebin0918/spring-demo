package com.lzb.school.entity.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * 小学、初中、高中
 */
public enum TYPE_ENUM {
    PRIMARY(1), MEDIUM(2), HIGH(3);

    TYPE_ENUM(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @EnumValue
    private final int value;
}