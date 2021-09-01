
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderKeyReferenceBuilder implements Builder<OrderKeyReference> {

    private String key;

    public OrderKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public OrderKeyReference build() {
        Objects.requireNonNull(key, OrderKeyReference.class + ": key is missing");
        return new OrderKeyReferenceImpl(key);
    }

    /**
     * builds OrderKeyReference without checking for non null required values
     */
    public OrderKeyReference buildUnchecked() {
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
