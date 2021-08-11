
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodResourceIdentifierBuilder implements Builder<ShippingMethodResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public ShippingMethodResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public ShippingMethodResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ShippingMethodResourceIdentifier build() {
        return new ShippingMethodResourceIdentifierImpl(id, key);
    }

    /**
     * builds ShippingMethodResourceIdentifier without checking for non null required values
     */
    public ShippingMethodResourceIdentifier buildUnchecked() {
        return new ShippingMethodResourceIdentifierImpl(id, key);
    }

    public static ShippingMethodResourceIdentifierBuilder of() {
        return new ShippingMethodResourceIdentifierBuilder();
    }

    public static ShippingMethodResourceIdentifierBuilder of(final ShippingMethodResourceIdentifier template) {
        ShippingMethodResourceIdentifierBuilder builder = new ShippingMethodResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
