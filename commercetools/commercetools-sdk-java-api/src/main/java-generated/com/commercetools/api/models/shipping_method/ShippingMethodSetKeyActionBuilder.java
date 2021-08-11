
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodSetKeyActionBuilder implements Builder<ShippingMethodSetKeyAction> {

    @Nullable
    private String key;

    public ShippingMethodSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ShippingMethodSetKeyAction build() {
        return new ShippingMethodSetKeyActionImpl(key);
    }

    /**
     * builds ShippingMethodSetKeyAction without checking for non null required values
     */
    public ShippingMethodSetKeyAction buildUnchecked() {
        return new ShippingMethodSetKeyActionImpl(key);
    }

    public static ShippingMethodSetKeyActionBuilder of() {
        return new ShippingMethodSetKeyActionBuilder();
    }

    public static ShippingMethodSetKeyActionBuilder of(final ShippingMethodSetKeyAction template) {
        ShippingMethodSetKeyActionBuilder builder = new ShippingMethodSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
