
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ItemShippingDetailsBuilder {

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets;

    private Boolean valid;

    public ItemShippingDetailsBuilder targets(final com.commercetools.api.models.cart.ItemShippingTarget... targets) {
        this.targets = new ArrayList<>(Arrays.asList(targets));
        return this;
    }

    public ItemShippingDetailsBuilder targets(
            final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets) {
        this.targets = targets;
        return this;
    }

    public ItemShippingDetailsBuilder valid(final Boolean valid) {
        this.valid = valid;
        return this;
    }

    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargets() {
        return this.targets;
    }

    public Boolean getValid() {
        return this.valid;
    }

    public ItemShippingDetails build() {
        return new ItemShippingDetailsImpl(targets, valid);
    }

    public static ItemShippingDetailsBuilder of() {
        return new ItemShippingDetailsBuilder();
    }

    public static ItemShippingDetailsBuilder of(final ItemShippingDetails template) {
        ItemShippingDetailsBuilder builder = new ItemShippingDetailsBuilder();
        builder.targets = template.getTargets();
        builder.valid = template.getValid();
        return builder;
    }

}
