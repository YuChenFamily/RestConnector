/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.yongchristophertang.engine.java;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YongTang on 2015/3/18.
 *
 * @author Yong Tang
 * @since 0.4
 */
public class JavaTest {

    @Test
    public void testDemo() {
        DemoInterface di = ProxyFactories.createLoggerProxy(new DemoClient());
        di.test();
    }

    @Test
    public void testDemo2() {
        TestClassClient proxy = ProxyFactories.createClassLoggerProxy(new TestClassClient("oops,"));
        proxy.testAPI("cool");
        System.out.println(proxy);

        proxy.testObject("cool");
        Map<String, String> map = new HashMap<>();
        map.put("1", "ddd");
        proxy.testMap(map);
    }
}
