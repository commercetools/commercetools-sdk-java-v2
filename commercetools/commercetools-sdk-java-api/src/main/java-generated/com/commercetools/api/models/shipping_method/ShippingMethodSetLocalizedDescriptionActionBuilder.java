
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodSetLocalizedDescriptionActionBuilder {

    @Nullable
    private String localizedDescription;

    public ShippingMethodSetLocalizedDescriptionActionBuilder localizedDescription(
            @Nullable final String localizedDescription) {
        this.localizedDescription = localizedDescription;
        return this;
    }

    @Nullable
    public String getLocalizedDescription() {
        return this.localizedDescription;
    }

    public ShippingMethodSetLocalizedDescriptionAction build() {
        return new ShippingMethodSetLocalizedDescriptionActionImpl(localizedDescription);
    }

    public static ShippingMethodSetLocalizedDescriptionActionBuilder of() {
        return new ShippingMethodSetLocalizedDescriptionActionBuilder();
    }

    public static ShippingMethodSetLocalizedDescriptionActionBuilder of(
            final ShippingMethodSetLocalizedDescriptionAction template) {
        ShippingMethodSetLocalizedDescriptionActionBuilder builder = new ShippingMethodSetLocalizedDescriptionActionBuilder();
        builder.localizedDescription = template.getLocalizedDescription();
        return builder;
    }

}
