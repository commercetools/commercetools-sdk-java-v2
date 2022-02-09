
package com.commercetools.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Replaced {
    public Class<?> by();

}
