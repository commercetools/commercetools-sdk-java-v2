
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ItemShippingDetailsBuilder implements Builder<ItemShippingDetails> {

    private java.util.List<com.commercetools.history.models.common.ItemShippingTarget> targets;

    private Boolean valid;

    public ItemShippingDetailsBuilder targets(
            final com.commercetools.history.models.common.ItemShippingTarget... targets) {
        this.targets = new ArrayList<>(Arrays.asList(targets));
        return this;
    }

    public ItemShippingDetailsBuilder targets(
            final java.util.List<com.commercetools.history.models.common.ItemShippingTarget> targets) {
        this.targets = targets;
        return this;
    }

    public ItemShippingDetailsBuilder valid(final Boolean valid) {
        this.valid = valid;
        return this;
    }

    public java.util.List<com.commercetools.history.models.common.ItemShippingTarget> getTargets() {
        return this.targets;
    }

    public Boolean getValid() {
        return this.valid;
    }

    public ItemShippingDetails build() {
        Objects.requireNonNull(targets, ItemShippingDetails.class + ": targets is missing");
        Objects.requireNonNull(valid, ItemShippingDetails.class + ": valid is missing");
        return new ItemShippingDetailsImpl(targets, valid);
    }

    /**
     * builds ItemShippingDetails without checking for non null required values
     */
    public ItemShippingDetails buildUnchecked() {
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
