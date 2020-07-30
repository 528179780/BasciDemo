package com.sufu.basic.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 *
 * @author sufu
 * @date 2020/7/26
 */
//表示该类只能作用于类上
@Target({ElementType.TYPE})
public @interface MyAnno2 {
}