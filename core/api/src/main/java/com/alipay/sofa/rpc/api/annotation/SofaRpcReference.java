/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.rpc.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author bystander
 * @version $Id: SofaRpcService.java, v 0.1 2018年05月02日 5:11 PM bystander Exp $
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface SofaRpcReference {

    /***
     * @return return service unique-id
     */
    String uniqueId() default "";

    /**
     * timeout
     *
     * @return
     */
    int timeout() default 3000;

    /**
     * retry times
     *
     * @return
     */
    int retries() default 0;

    /**
     * address time out
     *
     * @return
     */
    int addressWaitTime() default 0;

    /**
     * invoke type
     *
     * @return
     */
    String invokeType() default "sync";

    /**
     * filter beans
     *
     * @return
     */
    String[] filters() default {};

    /**
     * direct url
     *
     * @return
     */
    String directUrl() default "";

    /**
     * call back handler,when invoke type is callback,it
     *
     * @return
     */
    String callBackHandler() default "";

    /**
     * registry for this consumer
     *
     * @return
     */
    String registry() default "";

    /**
     * protocol info
     *
     * @return
     */
    String binding() default "bolt";

    /**
     * service version
     *
     * @return
     */
    String version() default "1.0";

}