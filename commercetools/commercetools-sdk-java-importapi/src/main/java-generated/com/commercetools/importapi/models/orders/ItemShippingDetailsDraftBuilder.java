
package com.commercetools.importapi.models.orders;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ItemShippingDetailsDraftBuilder {

    private java.util.List<com.commercetools.importapi.models.orders.ItemShippingTarget> targets;

    public ItemShippingDetailsDraftBuilder targets(
            final com.commercetools.importapi.models.orders.ItemShippingTarget... targets) {
        this.targets = new ArrayList<>(Arrays.asList(targets));
        return this;
    }

    public ItemShippingDetailsDraftBuilder targets(
            final java.util.List<com.commercetools.importapi.models.orders.ItemShippingTarget> targets) {
        this.targets = targets;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.orders.ItemShippingTarget> getTargets() {
        return this.targets;
    }

    public ItemShippingDetailsDraft build() {
        return new ItemShippingDetailsDraftImpl(targets);
    }

    public static ItemShippingDetailsDraftBuilder of() {
        return new ItemShippingDetailsDraftBuilder();
    }

    public static ItemShippingDetailsDraftBuilder of(final ItemShippingDetailsDraft template) {
        ItemShippingDetailsDraftBuilder builder = new ItemShippingDetailsDraftBuilder();
        builder.targets = template.getTargets();
        return builder;
    }

}
