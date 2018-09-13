package com.keung.spring4hibernate3.common.persistence.cache;


/**
 *
 * @author wangzhen
 * @ctime：2014-12-18 下午8:45:31
 *
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface CacheStr {

    /**
     * k
     * @return
     */
    String k();

    /**
     * 缓存时间 默认5分钟
     */
    int t = CacheKey.CACHE_TIME_LIST;

    /**
     *  v
     * @return
     */
    String v() default "";
}
