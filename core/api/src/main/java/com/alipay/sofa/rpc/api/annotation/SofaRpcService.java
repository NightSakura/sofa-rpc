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
@Target({ ElementType.TYPE })
public @interface SofaRpcService {

    /**
     * The interface type of the RPC service to be create. because target may have multiple interfaces.
     *
     * @return return interface type
     */
    Class<?> interfaceType() default void.class;

    /**
     * The unique id of the RPC service to be created. Default to an empty string when not specified.
     *
     * @return return service unique-id
     */
    String uniqueId() default "";

    /**
     * protocol info, maybe bolt/rest
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

    /**
     * normal weight,when default,will use rpc default value, 100
     */

    int weight() default 0;

    /**
     * when warmup,the weight.
     *
     * @return
     */
    int warmUpWeight() default 0;

    /**
     * warmup time, default is 0
     *
     * @return
     */
    int warmUpTime() default 0;

    /**
     * filter beans
     *
     * @return
     */
    String[] filters() default {};

    /**
     * custorm thread pool for current service
     *
     * @return
     */
    String userThreadPool() default "";

    /**
     * registry for this provider
     *
     * @return
     */
    String registry() default "";

    /**
     * timeout
     *
     * @return
     */
    int timeout() default 3000;
}