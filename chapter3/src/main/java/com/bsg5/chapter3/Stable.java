package com.bsg5.chapter3;

import java.lang.annotation.*;

/**
 * @author huawei
 **/
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Stable {

    int major();

    int minor();
}
