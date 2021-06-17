
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderKeyReferenceBuilder {

    private String key;

    public OrderKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public OrderKeyReference build() {
        return new OrderKeyReferenceImpl(key);
    }

    public static OrderKeyReferenceBuilder of() {
        return new OrderKeyReferenceBuilder();
    }

    public static OrderKeyReferenceBuilder of(final OrderKeyReference template) {
        OrderKeyReferenceBuilder builder = new OrderKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
