package com.bsg5.chapter3;

/**
 * @author huawei
 **/
public interface Normalizer {

    default String transform(String input) {
        return input.trim();
    }
}
