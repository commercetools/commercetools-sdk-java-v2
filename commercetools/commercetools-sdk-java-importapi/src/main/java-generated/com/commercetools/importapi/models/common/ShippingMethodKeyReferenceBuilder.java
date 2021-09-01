
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodKeyReferenceBuilder implements Builder<ShippingMethodKeyReference> {

    private String key;

    public ShippingMethodKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public ShippingMethodKeyReference build() {
        Objects.requireNonNull(key, ShippingMethodKeyReference.class + ": key is missing");
        return new ShippingMethodKeyReferenceImpl(key);
    }

    /**
     * builds ShippingMethodKeyReference without checking for non null required values
     */
    public ShippingMethodKeyReference buildUnchecked() {
        return new ShippingMethodKeyReferenceImpl(key);
    }

    public static ShippingMethodKeyReferenceBuilder of() {
        return new ShippingMethodKeyReferenceBuilder();
    }

    public static ShippingMethodKeyReferenceBuilder of(final ShippingMethodKeyReference template) {
        ShippingMethodKeyReferenceBuilder builder = new ShippingMethodKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
