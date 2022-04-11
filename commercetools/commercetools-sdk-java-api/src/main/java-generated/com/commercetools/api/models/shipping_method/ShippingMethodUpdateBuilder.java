
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingMethodUpdateBuilder implements Builder<ShippingMethodUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction> actions;

    public ShippingMethodUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ShippingMethodUpdateBuilder actions(
            final com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public ShippingMethodUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public ShippingMethodUpdateBuilder plusActions(
            final com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public ShippingMethodUpdateBuilder plusActions(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionBuilder, Builder<? extends com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionBuilder.of()).build());
        return this;
    }

    public ShippingMethodUpdateBuilder withActions(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionBuilder, Builder<? extends com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction> getActions() {
        return this.actions;
    }

    public ShippingMethodUpdate build() {
        Objects.requireNonNull(version, ShippingMethodUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ShippingMethodUpdate.class + ": actions is missing");
        return new ShippingMethodUpdateImpl(version, actions);
    }

    /**
     * builds ShippingMethodUpdate without checking for non null required values
     */
    public ShippingMethodUpdate buildUnchecked() {
        return new ShippingMethodUpdateImpl(version, actions);
    }

    public static ShippingMethodUpdateBuilder of() {
        return new ShippingMethodUpdateBuilder();
    }

    public static ShippingMethodUpdateBuilder of(final ShippingMethodUpdate template) {
        ShippingMethodUpdateBuilder builder = new ShippingMethodUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
