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

package com.github.yongchristophertang.engine.web.annotations;

import com.github.yongchristophertang.engine.web.request.SimpleStringConverter;
import com.github.yongchristophertang.engine.web.request.StringConverter;

import java.lang.annotation.*;

/**
 * Binds the value of a URI template parameter or a path segment
 * containing the template parameter to a resource method parameter, the path segment should be in the format of
 * ${PathParam}.
 */
@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PathParam {

    /**
     * Path parameter name
     */
    String value();

    /**
     * Converter for transferring path paramter object into path string.
     */
    Class<? extends StringConverter> converter() default SimpleStringConverter.class;
}
