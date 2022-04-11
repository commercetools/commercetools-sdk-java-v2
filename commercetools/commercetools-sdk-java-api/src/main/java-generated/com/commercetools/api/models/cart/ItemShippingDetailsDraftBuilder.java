
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ItemShippingDetailsDraftBuilder implements Builder<ItemShippingDetailsDraft> {

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets;

    public ItemShippingDetailsDraftBuilder targets(
            final com.commercetools.api.models.cart.ItemShippingTarget... targets) {
        this.targets = new ArrayList<>(Arrays.asList(targets));
        return this;
    }

    public ItemShippingDetailsDraftBuilder targets(
            final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets) {
        this.targets = targets;
        return this;
    }

    public ItemShippingDetailsDraftBuilder plusTargets(
            final com.commercetools.api.models.cart.ItemShippingTarget... targets) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.addAll(Arrays.asList(targets));
        return this;
    }

    public ItemShippingDetailsDraftBuilder plusTargets(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    public ItemShippingDetailsDraftBuilder withTargets(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        this.targets = new ArrayList<>();
        this.targets.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargets() {
        return this.targets;
    }

    public ItemShippingDetailsDraft build() {
        Objects.requireNonNull(targets, ItemShippingDetailsDraft.class + ": targets is missing");
        return new ItemShippingDetailsDraftImpl(targets);
    }

    /**
     * builds ItemShippingDetailsDraft without checking for non null required values
     */
    public ItemShippingDetailsDraft buildUnchecked() {
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
